package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
Button btn;
TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initUI();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fetchData();
            }
        });

    }

    private void fetchData() {
        SharedPreferences sharedPref=getSharedPreferences("My_Pref",MODE_PRIVATE);
        t2.setText("First Name : "+sharedPref.getString("Fname",""));
        t1.setText("Last Name : "+sharedPref.getString("Lname",""));
        t3.setText("Gender: "+sharedPref.getString("Gender",""));

    }

    private void initUI() {
        btn=findViewById(R.id.button2);
        t1=findViewById(R.id.tw2);
        t2=findViewById(R.id.tw3);
        t3=findViewById(R.id.tw4);


    }
}
