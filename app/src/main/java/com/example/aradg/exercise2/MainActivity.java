package com.example.aradg.exercise2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button cfn,lowerthan,equalto,greaterthan;
    TextView txt1,txt2,wrongAnswer,rightAnswer;
    Random rnd=new Random();
    int a,b,wa,ra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cfn=(Button)findViewById(R.id.cfn);
        lowerthan=(Button)findViewById(R.id.lowerthan);
        equalto=(Button)findViewById(R.id.equalto);
        greaterthan=(Button)findViewById(R.id.greaterthan);

        txt1=(TextView)findViewById(R.id.txt1);
        txt2=(TextView)findViewById(R.id.txt2);
        wrongAnswer=(TextView)findViewById(R.id.wronganswer);
        rightAnswer=(TextView)findViewById(R.id.rightanswer);

        a=0;
        b=0;
        wa=0;
        ra=0;

    }

    public void btnclick1(View view) {
        a=rnd.nextInt(100);
        txt1.setText("Number= "+a);
        b=rnd.nextInt(100);
        txt2.setText("Number= "+b);

    }

    public void btnclick2(View view) {
        if(a<b){
            ra++;
            rightAnswer.setText("Right answers:"+ra);
        }else{
            wa++;
            wrongAnswer.setText("Wrong answers:"+wa);
        }

    }

    public void btnclick3(View view) {
        if(a==b){
            ra++;
            rightAnswer.setText("Right answers:"+ra);
        }else{
            wa++;
            wrongAnswer.setText("Wrong answers:"+wa);
        }
    }

    public void btnclick4(View view) {
        if(a>b){
            ra++;
            rightAnswer.setText("Right answers:"+ra);
        }else{
            wa++;
            wrongAnswer.setText("Wrong answers:"+wa);
        }

    }
}
