package com.example.cgpacalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sem5Cst extends AppCompatActivity {

    int sp,ca,os,se,cg,spl,cgl,java,semi,internship;
    EditText etxtSP,etxtCA,etxtOS1,etxtSE,etxtCG,etxtSPlab,etxtCGlab,etxtJavalab,etxtSeminar,etxtInternship;
    TextView txt;
    double ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem5_cst);
        getSupportActionBar().setTitle("* - Third Year Sem 5  - *");

        etxtSP = (EditText) findViewById(R.id.etxtSP);
        etxtCA = (EditText) findViewById(R.id.etxtCA);
        etxtOS1 = (EditText) findViewById(R.id.etxtOS1);
        etxtSE = (EditText) findViewById(R.id.etxtSE);
        etxtCG = (EditText) findViewById(R.id.etxtCG);
        etxtSPlab = (EditText) findViewById(R.id.etxtSPlab);
        etxtCGlab = (EditText) findViewById(R.id.etxtCGlab);
        etxtJavalab = (EditText) findViewById(R.id.etxtJavalab);
        etxtSeminar = (EditText) findViewById(R.id.etxtSeminar);
        etxtInternship = (EditText) findViewById(R.id.etxtInternship);
    }

    public double cal()
    {

        sp = Integer.parseInt(etxtSP.getText().toString());
        ca = Integer.parseInt(etxtCA.getText().toString());
        os = Integer.parseInt(etxtOS1.getText().toString());
        se = Integer.parseInt(etxtSE.getText().toString());
        cg = Integer.parseInt(etxtCG.getText().toString());
        spl = Integer.parseInt(etxtSPlab.getText().toString());
        cgl = Integer.parseInt(etxtCGlab.getText().toString());
        java = Integer.parseInt(etxtJavalab.getText().toString());
        semi = Integer.parseInt(etxtSeminar.getText().toString());
        internship = Integer.parseInt(etxtInternship.getText().toString());

        int a = 3*range(sp);
        int b = 4*range(ca);
        int c = 4*range(os);
        int d = 3*range(se);
        int e = 3*range(cg);
        int f = range(spl*2);
        int g = range(cgl*2);
        int h = 4*range(java);
        int i = range(semi*2);
        int j = range(internship*2);

        double result = (double)a+b+c+d+e+f+g+h+i+j;
        ans = result/25;
        return ans;
    }

    public int range(int m)
    {
        if(m>=91 && m<=100)
            m=10;
        else if(m>=86 && m<=90)
            m=9;
        else if(m>=76 && m<=85)
            m=8;
        else if(m>=66 && m<=75)
            m=7;
        else if(m>=56 && m<=65)
            m=6;
        else if(m>=46 && m<=55)
            m=5;
        else if(m>=40 && m<=45)
            m=4;
        else
            m=0;

        return m;

    }


    public void Calculate(View view) {


        String cgpa = Double.toString(cal());

        // txt.setText("CGPA is: " + cgpa);

        Toast.makeText(this, "SGPA is"+cgpa, Toast.LENGTH_LONG).show();



    }
}