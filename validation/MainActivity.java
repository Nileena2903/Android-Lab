package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText fname,lname,password;
    RadioButton male,female;
    Button submit;
    Switch nm;
    RadioGroup gender;
    CheckBox check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname=findViewById(R.id.fname);
        lname=findViewById(R.id.lname);
        password=findViewById(R.id.pswd);
        male=findViewById(R.id.male);
        female=findViewById(R.id.female);
        submit=findViewById(R.id.button);
        gender=findViewById(R.id.grp);
        nm=findViewById(R.id.switch1);
        check=findViewById(R.id.checkBox);
    }
    public void submit(View view){
        if(validate()) {
            Toast.makeText(MainActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
        }else
        {
            Toast.makeText(MainActivity.this, "Some data is invalid", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean validate() {
        boolean isValid = false;
        String firstname, lastname;
        firstname = fname.getText().toString();
        lastname = lname.getText().toString();

        if (firstname.equals("")) {
            Toast.makeText(this, "Firstname is empty", Toast.LENGTH_SHORT).show();
        } else if (lastname.equals("")) {
            Toast.makeText(this, "Lastname is empty", Toast.LENGTH_SHORT).show();
        } else if (male.isChecked() && !female.isChecked()) {
            Toast.makeText(this, "Please choose gender ", Toast.LENGTH_SHORT).show();
        } else if (password.length() < 8) {
            Toast.makeText(this, "Password must have at least 8 letters", Toast.LENGTH_SHORT).show();
        } else if (!nm.isChecked()) {
            Toast.makeText(this, "New member", Toast.LENGTH_SHORT).show();
        } else if (!check.isChecked()) {
            Toast.makeText(this, "Please agree to the terms and conditions", Toast.LENGTH_SHORT).show();
        } else {
            isValid = true;
        }
        return  isValid;
    }

}