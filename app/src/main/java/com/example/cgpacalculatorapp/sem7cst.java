package com.example.cgpacalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class sem7cst extends AppCompatActivity {

    int aca,adbms,ds,ne,elective1,nel,webTl1,project1,internship2;
    EditText etxtACA,etxtADBMS,etxtDS,etxtNE,etxtElective1,etxtNElab,etxtWebTlab1,etxtProject1,etxtInternship2;
    double ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem7cst);

        etxtACA = (EditText) findViewById(R.id.etxtACA);
        etxtADBMS = (EditText) findViewById(R.id.etxtADBMS);
        etxtDS = (EditText) findViewById(R.id.etxtDS);
        etxtNE = (EditText) findViewById(R.id.etxtNE);
        etxtElective1 = (EditText) findViewById(R.id.etxtElective1);
        etxtNElab = (EditText) findViewById(R.id.etxtNElab);
        etxtWebTlab1 = (EditText) findViewById(R.id.etxtWebTlab1);
        etxtProject1 = (EditText) findViewById(R.id.etxtProject1);
        etxtInternship2 = (EditText) findViewById(R.id.etxtInternship2);



    }

    public double cal() {

        aca = Integer.parseInt(etxtACA.getText().toString());
        adbms = Integer.parseInt(etxtADBMS.getText().toString());
        ds = Integer.parseInt(etxtDS.getText().toString());
        ne = Integer.parseInt(etxtNE.getText().toString());
        elective1 = Integer.parseInt(etxtElective1.getText().toString());
        nel = Integer.parseInt(etxtNElab.getText().toString());
        webTl1 = Integer.parseInt(etxtWebTlab1.getText().toString());
        project1 = Integer.parseInt(etxtProject1.getText().toString());
        internship2 = Integer.parseInt(etxtInternship2.getText().toString());

        int a = 3*range(aca);
        int b = 4*range(adbms);
        int c = 4*range(ds);
        int d = 3*range(ne);
        int e = 3*range(elective1);
        int f = range(nel*2);
        int g = 4*range(webTl1);
        int h = 2*range(project1);
        int i = range(internship2*2);


        double result = (double)a+b+c+d+e+f+g+h+i;
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

        Toast.makeText(this, "SGPA is: "+ cgpa, Toast.LENGTH_LONG).show();

    }
    }