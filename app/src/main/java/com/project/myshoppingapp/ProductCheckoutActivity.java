package com.project.myshoppingapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ProductCheckoutActivity extends AppCompatActivity {

    ImageView img2, pro_save, pro_share, kart, pro_wishlist;
    TextView name2, price2, qty2, qtyValue, pDes;
    ImageButton addQty, minusQty;
    Button addToBag;
    int q;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.product_checkout_layout);

        img2 = findViewById(R.id.check_pimage_design);
        name2 = findViewById(R.id.check_product_name);
        price2 = findViewById(R.id.check_product_price);
        qty2 = findViewById(R.id.check_product_qty);
        qtyValue = findViewById(R.id.qty_value);
        addQty = findViewById(R.id.add_qty);
        minusQty = findViewById(R.id.minus_qty);
        pDes = findViewById(R.id.check_product_cdes);
        pro_save = findViewById(R.id.wishlist_icon);
        pro_share = findViewById(R.id.p_share);
        pro_wishlist = findViewById(R.id.p_wishlist);
        kart = findViewById(R.id.kart);
        addToBag = findViewById(R.id.add_to_bag);

        String n = getIntent().getStringExtra("PName").toString();
        int p = getIntent().getIntExtra("PPrice",0);
        q = getIntent().getIntExtra("PQty",0);
        String d = getIntent().getStringExtra("PDes").toString();

        name2.setText(n);
        price2.setText("Rs. "+p);
        qty2.setText("Available QTY:"+q);
        img2.setImageResource((getIntent().getIntExtra("PImage",R.drawable.white_shirt)));
        pDes.setText(d);

        addQty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int qValue = Integer.parseInt(qtyValue.getText().toString());
                ++qValue;
                if(qValue<=q) {
                    qtyValue.setText(Integer.toString(qValue));
                }
            }
        });

        minusQty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int qValue = Integer.parseInt(qtyValue.getText().toString());
                --qValue;
                if(qValue>0) {
                    qtyValue.setText(Integer.toString(qValue));
                }
            }
        });

        pro_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_share = new Intent();
                intent_share.setAction(Intent.ACTION_SEND);
                intent_share.setType("text/plain");
                intent_share.putExtra(Intent.EXTRA_TEXT, "Check this out");
                startActivity(Intent.createChooser(intent_share, "ShareVia"));
            }
        });

        pro_wishlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_wishlist = new Intent(ProductCheckoutActivity.this, WishlistActivity.class);
                startActivity(intent_wishlist);
            }
        });

        kart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent_kart = new Intent(ProductCheckoutActivity.this, CartActivity.class);
                startActivity(intent_kart);*/
                Toast.makeText(ProductCheckoutActivity.this, "Kart", Toast.LENGTH_SHORT).show();
            }
        });

        pro_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProductCheckoutActivity.this, "Product added to wishlist", Toast.LENGTH_SHORT).show();
            }
        });

        addToBag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProductCheckoutActivity.this, "Product added to bag", Toast.LENGTH_SHORT).show();
            }
        });


    }
}