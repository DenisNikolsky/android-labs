package com.example.user.labs;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Created by User on 21.09.2017.
 */

public class Lab3Activity extends AppCompatActivity {

    private RelativeLayout mRelativeLayout;
    Toast toast ;
    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3);
        mRelativeLayout = (RelativeLayout)findViewById(R.id.activity_lab3);
    }



    public void onRedBottonClick(View view) {
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.redColor));
        toast = Toast.makeText(getApplicationContext(),"now RED!",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    public void onGreenBottonClick(View view) {
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.greenColor));
        toast = Toast.makeText(getApplicationContext(),"now GREEN!",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    public void onBlueBottonClick(View view) {
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.blueColor));
        toast = Toast.makeText(getApplicationContext(),"now BLUE!",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    public void onYellowBottonClick(View view) {
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.yellowColor));
        toast = Toast.makeText(getApplicationContext(),"now YELLOW!",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    public void onImgBottonClick(View view) {

        mRelativeLayout.setBackground( getResources().getDrawable(R.drawable.background));

        toast = Toast.makeText(getApplicationContext(),"now IMG!",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }
}
