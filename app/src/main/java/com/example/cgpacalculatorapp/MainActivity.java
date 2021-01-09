package com.example.cgpacalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void cst(View view){
        Intent cst = new Intent(this,cst.class);
        startActivity(cst);

    }
    public void ct(View view){

    }
    public void me(View view){

    }
    public void ect(View view){

    }
    public void food(View view){
        
    }
}