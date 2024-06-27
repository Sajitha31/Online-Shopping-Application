package com.project.myshoppingapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputLayout;

public class Login_activity extends AppCompatActivity {


    TextInputLayout email_l,pass_l;
    EditText email_r,pass_r;
    Button register2;
    TextView toRegister;

    private InputValidation inputValidation;
    private DatabaseHelper databaseHelper;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        email_l = (TextInputLayout)findViewById(R.id.textInputEmail2);
        pass_l = (TextInputLayout)findViewById(R.id.txtInputPass);

        email_r = (EditText)findViewById(R.id.editTxtEmail1);
        pass_r = (EditText)findViewById(R.id.editTxtPass1);

        register2 = (Button)findViewById(R.id.submitBtn);
        toRegister = (TextView)findViewById(R.id.txtView1);

        inputValidation = new InputValidation(Login_activity.this);
        databaseHelper = new DatabaseHelper(Login_activity.this);


        register2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!inputValidation.isInputEditTextFilled(email_r, email_l, "Enter your Email")){
                    return;
                }
                if (!inputValidation.isInputEditTextEmail(email_r, email_l,"Enter Valid Email")){
                    return;
                }
                if (!inputValidation.isInputEditTextFilled(pass_r, pass_l, "Enter Password")){
                    return;
                }

                if (databaseHelper.checkUser(email_r.getText().toString().trim(),
                        pass_r.getText().toString().trim())) {
                    Intent accountsIntent = new Intent(Login_activity.this,DrawerActivity.class);
                    accountsIntent.putExtra("EMAIL",email_r.getText().toString().trim());
                    Toast.makeText(Login_activity.this, "login successful", Toast.LENGTH_SHORT).show();
                    startActivity(accountsIntent);
                    emptyInputEditText();

                }
                else {
                    Toast.makeText(Login_activity.this, "Invalid Email or Password", Toast.LENGTH_SHORT).show();

                }
            }
            //startActivity(new Intent(Login_activity.this,HomeActivity.class));
        });

        toRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login_activity.this, SignupActivity.class);
                startActivity(intent);
            }
        });


    }

    public void emptyInputEditText() {
        email_r.setText(null);
        pass_r.setText(null);
    }

}