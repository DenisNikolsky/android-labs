package com.example.user.labs;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Lab1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1);
    }

    public void onClick(View view) {
        TextView helloTextView = (TextView) findViewById(R.id.HelloTextView);
        Random rnd = new Random();
        helloTextView.setTextColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
        helloTextView.setText("Hello!");
    }
}
