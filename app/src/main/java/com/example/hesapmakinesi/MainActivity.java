package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ontoplaClick(View v) {
        EditText s1 = (EditText) findViewById(R.id.sayi1);
        EditText s2 = (EditText) findViewById(R.id.sayi2);
        TextView t1 = (TextView) findViewById(R.id.sonuc);
        int sayi1 = Integer.parseInt(s1.getText().toString());
        int sayi2 = Integer.parseInt(s2.getText().toString());
        int topla = sayi1 + sayi2;
        t1.setText(Integer.toString(topla));


    }

    public void oncikarClick(View v) {
        EditText s1 = (EditText) findViewById(R.id.sayi1);
        EditText s2 = (EditText) findViewById(R.id.sayi2);
        TextView t1 = (TextView) findViewById(R.id.sonuc);
        int sayi1 = Integer.parseInt(s1.getText().toString());
        int sayi2 = Integer.parseInt(s2.getText().toString());
        int cikar = sayi1 - sayi2;
        t1.setText(Integer.toString(cikar));


    }

    public void onbolClick(View v) {
        EditText s1 = (EditText) findViewById(R.id.sayi1);
        EditText s2 = (EditText) findViewById(R.id.sayi2);
        TextView t1 = (TextView) findViewById(R.id.sonuc);
        int sayi1 = Integer.parseInt(s1.getText().toString());
        int sayi2 = Integer.parseInt(s2.getText().toString());
        int bol = sayi1 / sayi2;
        t1.setText(Integer.toString(bol));


    }

    public void oncarpClick(View v) {
        EditText s1 = (EditText) findViewById(R.id.sayi1);
        EditText s2 = (EditText) findViewById(R.id.sayi2);
        TextView t1 = (TextView) findViewById(R.id.sonuc);
        int sayi1 = Integer.parseInt(s1.getText().toString());
        int sayi2 = Integer.parseInt(s2.getText().toString());
        int carp = sayi1 * sayi2;
        t1.setText(Integer.toString(carp));


    }


}