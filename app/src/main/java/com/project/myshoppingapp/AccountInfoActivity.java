package com.project.myshoppingapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AccountInfoActivity extends AppCompatActivity {

    ImageView back_acctInfo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.acctinfo_layout);

        back_acctInfo = (ImageView)findViewById(R.id.back_acct);

        back_acctInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent_acct = new Intent(AccountInfoActivity.this, DrawerActivity.class);
                startActivity(intent_acct);
            }
        });

    }
}