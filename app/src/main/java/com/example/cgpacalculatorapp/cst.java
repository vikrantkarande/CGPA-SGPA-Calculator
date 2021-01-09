package com.example.cgpacalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class cst extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cst);




    }



    public void sem1(View view){

    }
    public void sem2(View view){

    }
    public void sem3(View view){

    }
    public void sem4(View view){

    }
    public void sem5(View view){
        Intent sem5 = new Intent(cst.this,sem5Cst.class);
        startActivity(sem5);

    }
    public void sem6(View view){
        Intent sem6 = new Intent(cst.this,sem6cst.class);
        startActivity(sem6);
    }
    public void sem7(View view){
        Intent sem7 = new Intent(cst.this,sem7cst.class);
        startActivity(sem7);

    }
    public void sem8(View view){

    }

}