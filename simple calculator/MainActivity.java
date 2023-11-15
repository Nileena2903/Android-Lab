package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
             EditText E1,E2,result;
    Button btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        E1=findViewById(R.id.E1);
        E2=findViewById(R.id.E2);
        result=findViewById(R.id.result);
        btn1=findViewById(R.id.btnAdd);
        btn2=findViewById(R.id.btnMinus);
        btn3=findViewById(R.id.btnDiv);
        btn4=findViewById(R.id.btnMul);


    }
    public void  sum(View view) {
        float a = Float.parseFloat(E1.getText().toString());
        float b = Float.parseFloat(E2.getText().toString());
        float c = a + b;
        result.setText(Float.toString(c));
    }
    public  void  sub(View view) {
        float a=Float.parseFloat(E1.getText().toString());
        float b=Float.parseFloat(E2.getText().toString());
        float c=a-b;
        result.setText(Float.toString(c));
    }
    public void div(View view) {
        float a=Float.parseFloat(E1.getText().toString());
        float b=Float.parseFloat(E2.getText().toString());
        float c=a/b;
        result.setText(Float.toString(c));
    }
    public void mul(View view) {
        float a=Float.parseFloat(E1.getText().toString());
        float b=Float.parseFloat(E2.getText().toString());
        float c=a*b;
        result.setText(Float.toString(c));
    }
}