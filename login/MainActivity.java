package com.example.login3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText user=findViewById(R.id.editTextText);
        EditText psd=findViewById(R.id.editTextNumberPassword);
        Button b=findViewById(R.id.button);
      b.setOnClickListener(new View.OnClickListener()
      {
          @Override
          public void onClick(View v)
          {
              if(user.getText().toString().equals("admin")&&psd.getText().toString().equals("123456"))
              {
                  Toast.makeText(getApplication(),"login Successful", Toast.LENGTH_SHORT).show();
              }
              else
              {
                  Toast.makeText(getApplication(),"login Failed", Toast.LENGTH_SHORT).show();
              }
          }
      });
    }
}