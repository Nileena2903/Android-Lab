package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
EditText fname,lname;
RadioGroup gender;
RadioButton m,f;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerAndnavigate();
            }
        });
    }
private void registerAndnavigate(){
    SharedPreferences sp=getSharedPreferences("My_Pref",MODE_PRIVATE);
    SharedPreferences.Editor editor=sp.edit();
    editor.putString("Fname",fname.getText().toString());
    editor.putString("Lname",lname.getText().toString());
    String radiovalue="";
    int checkedRadioButtonId=gender.getCheckedRadioButtonId();
    if(checkedRadioButtonId==R.id.male){
        radiovalue="Male";
    } else if (checkedRadioButtonId==R.id.female) {
        radiovalue="Female";
    } else {
        radiovalue="Default";
    }
editor.putString("Gender",radiovalue);
    editor.apply();

    Intent intent=new Intent(this,MainActivity2.class);
    startActivity(intent);
}
private void initUI(){
        fname=findViewById(R.id.fname);
        lname=findViewById(R.id.lname);
        gender=findViewById(R.id.grp);
        m=findViewById(R.id.male);
        f=findViewById(R.id.female);
        b=findViewById(R.id.button);
}
}