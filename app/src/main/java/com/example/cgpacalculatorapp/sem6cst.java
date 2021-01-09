package com.example.cgpacalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sem6cst extends AppCompatActivity {

    int cc,os2,oomd,dbe,ee,oomdlab,dbelab,aplab,mp;
    EditText etxtCC,etxtOS2,etxtDBE,etxtEE,etxtOOMD,etxtOOMDlab,etxtDBElab,etxtAPlab,etxtMP;
    TextView txt1;
    double ans1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem6cst);

        etxtCC = (EditText) findViewById(R.id.etxtCC);
        etxtOS2 = (EditText) findViewById(R.id.etxtOS2);
        etxtOOMD = (EditText) findViewById(R.id.etxtOOMD);
        etxtDBE = (EditText) findViewById(R.id.etxtDBE);
        etxtEE = (EditText) findViewById(R.id.etxtEE);
        etxtOOMDlab = (EditText) findViewById(R.id.etxtOOMDlab);
        etxtDBElab = (EditText) findViewById(R.id.etxtDBElab);
        etxtAPlab = (EditText) findViewById(R.id.etxtAPlab);
        etxtMP = (EditText) findViewById(R.id.etxtMP);

    }

    public double cal()
    {

        cc = Integer.parseInt(etxtCC.getText().toString());
        os2 = Integer.parseInt(etxtOS2.getText().toString());
        oomd = Integer.parseInt(etxtOOMD.getText().toString());
        dbe = Integer.parseInt(etxtDBE.getText().toString());
        ee = Integer.parseInt(etxtEE.getText().toString());
        oomdlab = Integer.parseInt(etxtOOMDlab.getText().toString());
        dbelab = Integer.parseInt(etxtDBElab.getText().toString());
        aplab = Integer.parseInt(etxtAPlab.getText().toString());
        mp = Integer.parseInt(etxtMP.getText().toString());

        int a = 4*range(cc);
        int b = 4*range(os2);
        int c = 4*range(oomd);
        int d = 4*range(dbe);
        int e = 3*range(ee);
        int f = range(oomdlab*2);
        int g = range(dbelab);
        int h = 3*range(aplab);
        int i = range(mp*2);

        double result = (double)a+b+c+d+e+f+g+h+i;
        ans1 = result/25;
        return ans1;
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


        String cgpa1 = Double.toString(cal());

        //  txt1.setText("CGPA is: " + cgpa1);

        Toast.makeText(this, "SGPA is: "+cgpa1, Toast.LENGTH_LONG).show();


    }
}