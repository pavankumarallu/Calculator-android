package com.vs.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import static java.lang.Math.pow;

public class MainActivity extends AppCompatActivity {

    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnadd;
    private Button btnsub;
    private Button btnmul;
    private Button btndiv;
    private Button btnve;
    private Button btnce;
    private Button btnback;
    private Button btndot;
    private Button btnper;
    private Button btneql;
    private TextView txt;
    private TextView txta;
    double X,Y,p;
    boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnsub);
        btnmul = findViewById(R.id.btnmul);
        btndiv = findViewById(R.id.btndiv);
        btnve =  findViewById(R.id.btnve);
        btnce = findViewById(R.id.btnce);
        btnback = findViewById(R.id.btnback);
        btndot = findViewById(R.id.btndot);
        btnper = findViewById(R.id.btnper);
        btneql = findViewById(R.id.btneql);
        txt = findViewById(R.id.txt);
        txta = findViewById(R.id.txta);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText().toString() + "9");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt.getText().length() >= 1){
                    X=Double.parseDouble(txt.getText()+"");
                    add=true;
                    txt.setText(null);
                    txta.setText(X+" "+"+");
                }
                if (txt.getText().length() < 1) {

                    txt.setText("");
                }
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt.getText().length() >= 1){
                    X=Double.parseDouble(txt.getText()+"");
                    sub=true;
                    txt.setText(null);
                    txta.setText(X+" "+"-");
                }
                if (txt.getText().length() < 1) {

                    txt.setText("");
                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt.getText().length() >= 1){
                    X=Double.parseDouble(txt.getText()+"");
                    mul=true;
                    txt.setText(null);
                    txta.setText(X+" "+"×");
                }
                if (txt.getText().length() < 1) {

                    txt.setText("");
                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt.getText().length() >= 1){
                    X=Double.parseDouble(txt.getText()+"");
                    div=true;
                    txt.setText(null);
                    txta.setText(X+" "+"÷");
                }
                if (txt.getText().length() < 1) {

                    txt.setText("");
                }
            }
        });
        btnper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt.getText().length() >= 1){
                    p = txt.getText().length();
                    txt.setText(Double.parseDouble(txt.getText()+"")/pow(10,p)+"");
                }
                if (txt.getText().length() < 1) {
                    txt.setText("");
                }
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt.getText().equals(".")){
                    txt.setText(txt.getText().toString());
                }
                if (txt.getText().toString().subSequence(txt.getText().toString().length()-1,txt.getText().toString().length()).equals(".")){
                    txt.setText(txt.getText());
                } else {
                    txt.setText(txt.getText().toString()+".");
                }
            }
        });
        btnve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt.getText().length() >= 1){
                    txt.setText(Integer.parseInt(txt.getText()+"")*(-1)+"");
                }
                if (txt.getText().length() < 1) {
                    txt.setText("");
                }
            }
        });
        btnce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("");
                txta.setText("");
            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt.getText().length() >= 1){
                    txt.setText(txt.getText().toString().substring(0,txt.getText().length()-1) + "");
                }
                if (txt.getText().length() < 1){

                    txt.setText("");
                }
            }
        });
        btneql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt.getText().toString().length() >= 1) {
                    Y = Double.parseDouble(txt.getText() + "");
                    if (add) {
                        txt.setText(X + Y + "");
                        txta.setText(X + " " + "+" + " " + Y);
                        add = false;
                    }
                    if (sub) {
                        txt.setText(X - Y + "");
                        txta.setText(X + " " + "-" + " " + Y);
                        sub = false;
                    }
                    if (mul) {
                        txt.setText(X * Y + "");
                        txta.setText(X + " " + "×" + " " + Y);
                        mul = false;
                    }
                    if (div) {
                        txt.setText(X / Y + "");
                        txta.setText(X + " " + "÷" + " " + Y);
                        div = false;
                    }
                }
                if (txt.getText().toString().equals("Error")){
                    txt.setText("");
                }
                if (txt.getText().toString().length() < 1) {
                    txt.setText("");
                }
            }
        });
    }
}