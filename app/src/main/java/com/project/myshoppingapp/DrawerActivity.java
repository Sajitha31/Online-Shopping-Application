package com.project.myshoppingapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;



public class DrawerActivity extends AppCompatActivity {

    DrawerLayout drawerLayout1;
    ImageButton drawerBtn1;
    NavigationView navView;
    MenuItem nav_acct;
    CardView clothingTab;
    AlertDialog dialog2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer_layout);

        drawerLayout1 = findViewById(R.id.drawer1);
        drawerBtn1 = findViewById(R.id.drawerBtn);
        navView = findViewById(R.id.navigation_view1);
        nav_acct = findViewById(R.id.nav_acct_info);
        clothingTab = findViewById(R.id.clothing_tab);

        clothingTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent_cloth = new Intent(DrawerActivity.this, MenStoreActivity.class);
                startActivity(intent_cloth);
            }
        });


        drawerBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout1.open();
            }
        });

        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int itemId = item.getItemId();

                if (itemId == R.id.nav_acct_info) {

                    Intent intent1 = new Intent(DrawerActivity.this, AccountInfoActivity.class);
                    startActivity(intent1);
                }
                if (itemId == R.id.nav_orders) {
                    Toast.makeText(DrawerActivity.this, "orders", Toast.LENGTH_SHORT).show();

                }
                if (itemId == R.id.nav_feedback) {

                    //CardView feedbackLayout = findViewById(R.id.feedBkLayout);

                   /* Button feedCancel = findViewById(R.id.feed_cancel);

                    AlertDialog.Builder builder2 = new AlertDialog.Builder(DrawerActivity.this);
                    View view = getLayoutInflater().inflate(R.layout.feedback_layout,null);

                    feedCancel.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog2.dismiss();
                        }
                    });

                    builder2.setView(view);
                    dialog2 = builder2.create();
                    dialog2.show();*/

                }
                if (itemId == R.id.nav_tnc) {
                    Intent intent4 = new Intent(DrawerActivity.this, TCActivity.class);
                    startActivity(intent4);

                }
                if (itemId == R.id.nav_contact) {
                    Intent intent5 = new Intent(DrawerActivity.this, ContactActivity.class);
                    startActivity(intent5);

                }
                if (itemId == R.id.nav_share) {
                    Intent intent6 = new Intent();
                    intent6.setAction(Intent.ACTION_SEND);
                    intent6.setType("text/plain");
                    intent6.putExtra(Intent.EXTRA_TEXT, "Download the app \n" + getPackageName());
                    startActivity(Intent.createChooser(intent6, "ShareVia"));

                }
                if (itemId == R.id.nav_log_out) {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(DrawerActivity.this);
                    builder1.setTitle("Logout");
                    builder1.setMessage("Are you sure you want to log out");
                    builder1.setPositiveButton("Logout", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int i) {
                            finishAffinity();
                            Intent intent7 = new Intent(DrawerActivity.this, Login_activity.class);
                            startActivity(intent7);
                            Toast.makeText(DrawerActivity.this, "Logged Out", Toast.LENGTH_SHORT).show();
                        }
                    });
                    builder1.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int i) {

                            dialog.dismiss();
                        }
                    });

                    builder1.show();
                }

                drawerLayout1.close();
                return false;
            }
        });

    }
}
