package com.example.v8t2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView printti;
    BottleDispenser bd = BottleDispenser.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        printti = (TextView) findViewById(R.id.textView2);
    }

    public void addMoney (View v){
        bd.addMoney();
        printti.setText("Rahaa lisätty 1€");
    }

    public void buyBottle(View v){
        int nro = bd.buyBottle();
        if (nro == 1) {
            printti.setText("Pullo pamahti ulos!");
        }
        else if (nro == 0) {
            printti.setText("Laita eka massia!");
        }
    }

    public void returnMoney(View v){
        float massit;
        massit = bd.returnMoney();
        String massitS = new Float(massit).toString();
        printti.setText("Sait takaisin " + massitS+ "€");
    }
}
