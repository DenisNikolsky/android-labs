package com.example.user.labs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClick(View view) {

        Intent intent;
        switch (view.getId()) {
            case R.id.buttonLab1 :
                intent = new Intent(MainActivity.this,Lab1Activity.class);
                startActivity(intent);
                break;
            case R.id.buttonLab2 :
                intent = new Intent(MainActivity.this,Lab2Activity.class);
                startActivity(intent);
                break;
            case R.id.buttonLab3 :
                intent = new Intent(MainActivity.this,Lab3Activity.class);
                startActivity(intent);
                break;
            case R.id.buttonLab4 :
                intent = new Intent(MainActivity.this,Lab4Activity.class);
                startActivity(intent);
                break;
//            case R.id.buttonLab5 :
//                intent = new Intent(MainActivity.this,Lab5Activity.class);
//                startActivity(intent);
//                break;
//            case R.id.buttonLab6 :
//                intent = new Intent(MainActivity.this,Lab6Activity.class);
//                startActivity(intent);
//                break;
//            case R.id.buttonLab7 :
//                intent = new Intent(MainActivity.this,Lab7Activity.class);
//                startActivity(intent);
//                break;
//            case R.id.buttonLab8 :
//                intent = new Intent(MainActivity.this,Lab8Activity.class);
//                startActivity(intent);
//                break;

        }
    }
}
