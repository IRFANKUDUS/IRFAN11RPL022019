package com.example.irfan11rpl022019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class ControlClass extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sharedPreferences=getSharedPreferences("login", Context.MODE_PRIVATE);

        if (sharedPreferences.getString("nama","").isEmpty()){
            startActivity(new Intent(ControlClass.this,MainActivity.class));
            finish();
        }else{
            startActivity(new Intent(ControlClass.this,menu.class));
            finish();
        }
    }
}