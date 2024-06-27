package com.project.myshoppingapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Product_Adapter extends RecyclerView.Adapter<Product_Adapter.ViewHolder> {
    private Context context;
    private ArrayList<Product> list;

    public Product_Adapter(Context context, ArrayList<Product> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public Product_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.product_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Product_Adapter.ViewHolder holder, int position) {
          holder.img.setImageResource(list.get(position).getProductImage());
          holder.name.setText(list.get(position).getProductName());
          holder.price.setText(Integer.toString(list.get(position).getProductPrice()));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView name, price;
        //Button addToCart;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.product_image_design);
            name = itemView.findViewById(R.id.product_name);
            price = itemView.findViewById(R.id.product_price);
            //addToCart = itemView.findViewById(R.id.add_to_bag);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();
                    Intent intent1 = new Intent(new Intent(context, ProductCheckoutActivity.class));
                    intent1.putExtra("PImage",list.get(pos).getProductImage());
                    intent1.putExtra("PName",list.get(pos).getProductName());
                    intent1.putExtra("PPrice",list.get(pos).getProductPrice());
                    intent1.putExtra("PQty",list.get(pos).getProductQty());
                    intent1.putExtra("PDes",list.get(pos).getProductDes());

                    context.startActivity(intent1);


                }
            });


        }
    }
}
