package com.project.myshoppingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class SignupActivity extends AppCompatActivity {

    TextInputLayout name_lay, email_lay, pass_lay, conf_lay;
    EditText name_reg, email_reg, pass_reg, confirmPass_reg;
    Button register;
    TextView already_acc;

    private DatabaseHelper databaseHelper;
    private InputValidation inputValidation;

    User user;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_layout);

        name_lay = (TextInputLayout)findViewById(R.id.textInputName);
        email_lay = (TextInputLayout)findViewById(R.id.textInputEmail);
        pass_lay = (TextInputLayout)findViewById(R.id.textInputPass);
        conf_lay = (TextInputLayout)findViewById(R.id.textInputConf);

        name_reg = (EditText)findViewById(R.id.editTextName1);
        email_reg = (EditText)findViewById(R.id.editTextEmail1);
        pass_reg = (EditText)findViewById(R.id.editTextPass1);
        confirmPass_reg = (EditText)findViewById(R.id.editTextConfPass1);

        register = (Button)findViewById(R.id.registerBtn);
        already_acc = (TextView)findViewById(R.id.loginTxt);

        databaseHelper = new DatabaseHelper(SignupActivity.this);
        inputValidation = new InputValidation(SignupActivity.this);
        user = new User();


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!inputValidation.isInputEditTextFilled(name_reg, name_lay, "Enter Full Name")) {
                    return;
                }
                if (!inputValidation.isInputEditTextFilled(email_reg, email_lay, "Enter your Email")) {
                    return;
                }
                if (!inputValidation.isInputEditTextEmail(email_reg, email_lay,"Enter Valid Email")){
                    return;
                }
                if (!inputValidation.isInputEditTextFilled(pass_reg, pass_lay, "Enter Password")){
                    return;
                }
                if (!inputValidation.isInputEditTextMatches(pass_reg, confirmPass_reg,
                        conf_lay,"Passwords Does Not Match")){
                    return;
                }
                if (!databaseHelper.checkUser(email_reg.getText().toString().trim()))
                {
                    user.setName(name_reg.getText().toString().trim());
                    user.setEmail(email_reg.getText().toString().trim());
                    user.setPassword(pass_reg.getText().toString().trim());
                    databaseHelper.addUser(user);

                    Toast.makeText(SignupActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                     emptyInputEditText();

                    Intent intent = new Intent(SignupActivity.this,Login_activity.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(SignupActivity.this, "Email Already Exists", Toast.LENGTH_SHORT).show();

                }
            }
        });

        already_acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivity.this, Login_activity.class);
                startActivity(intent);
            }
        });

    }


    public void emptyInputEditText() {
        name_reg.setText(null);
        email_reg.setText(null);
        pass_reg.setText(null);
        confirmPass_reg.setText(null);
    }
}
