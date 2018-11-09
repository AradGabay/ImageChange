package com.example.aradg.exercise2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button cfn,lowerthan,equalto,greaterthan;
    TextView txt1,txt2,rightAnswer,tof;
    Random rnd=new Random();
    int a,b,ra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cfn=(Button)findViewById(R.id.cfn);
        lowerthan=(Button)findViewById(R.id.lowerthan);
        equalto=(Button)findViewById(R.id.equalto);
        greaterthan=(Button)findViewById(R.id.greaterthan);

        tof=(TextView)findViewById(R.id.tof);
        txt1=(TextView)findViewById(R.id.txt1);
        txt2=(TextView)findViewById(R.id.txt2);
        rightAnswer=(TextView)findViewById(R.id.rightanswer);

        ra=0;

    }

    public void btnclick1(View view) {
        a=rnd.nextInt(100);
        txt1.setText("Number 1= "+a);
        b=rnd.nextInt(100);
        txt2.setText("Number 2= "+b);
        cfn.setEnabled(false);

    }

    public void btnclick2(View view) {
            if (a < b) {
                ra++;
                rightAnswer.setText("Score:" + ra);
                tof.setText("True");
                tof.setTextColor(Color.GREEN);
            } else {
                tof.setText("False");
                tof.setTextColor(Color.RED);
            } a=rnd.nextInt(100);
        txt1.setText("Number 1= "+a);
        b=rnd.nextInt(100);
        txt2.setText("Number 2= "+b);

    }

    public void btnclick3(View view) {
            if (a == b) {
                ra++;
                rightAnswer.setText("Score:" + ra);
                tof.setText("True");
                tof.setTextColor(Color.GREEN);
            } else {
                tof.setText("False");
                tof.setTextColor(Color.RED);
            } a=rnd.nextInt(100);
        txt1.setText("Number 1= "+a);
        b=rnd.nextInt(100);
        txt2.setText("Number 2= "+b);

    }

    public void btnclick4(View view) {
            if (a > b) {
                ra++;
                rightAnswer.setText("Score:" + ra);
                tof.setText("True");
                tof.setTextColor(Color.GREEN);
            } else {
                tof.setText("False");
                tof.setTextColor(Color.RED);
            } a=rnd.nextInt(100);
        txt1.setText("Number 1= "+a);
        b=rnd.nextInt(100);
        txt2.setText("Number 2= "+b);

    }
    }

