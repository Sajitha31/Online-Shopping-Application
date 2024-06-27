package com.project.myshoppingapp;

import android.content.Intent;
import android.graphics.ImageDecoder;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TCActivity extends AppCompatActivity {

    ImageView back_tc;
    Button agree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.tandc_layout);

        back_tc = (ImageView)findViewById(R.id.back_tc);
        agree = (Button)findViewById(R.id.agree_btn);

        back_tc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent_tc1 = new Intent(TCActivity.this, DrawerActivity.class);
                startActivity(intent_tc1);
            }
        });

        agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent_tc2 = new Intent(TCActivity.this, DrawerActivity.class);
                startActivity(intent_tc2);
            }
        });

    }
}