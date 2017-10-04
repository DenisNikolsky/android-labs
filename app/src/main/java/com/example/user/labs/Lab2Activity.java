package com.example.user.labs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Lab2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2);
    }
    public void onClick(View view) {
        EditText name = (EditText) findViewById(R.id.editTextName);
        EditText patronymic = (EditText) findViewById(R.id.editTextPatronymic);
        EditText surname = (EditText) findViewById(R.id.editTextSurname);
        EditText group = (EditText) findViewById(R.id.editTextGroup);

        String strName = name.getText().toString();
        String strSurname = surname.getText().toString();
        String strGroup = group.getText().toString();
        String strPatronymic = patronymic.getText().toString();
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String strFaculty = spinner.getSelectedItem().toString();

        String student = strName + " " +strPatronymic + " " + strSurname + " "
                + strFaculty + " " + strGroup ;
        Toast toast = Toast.makeText(getApplicationContext(),student,Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();

        name.setText("");
        patronymic.setText("");
        surname.setText("");
        group.setText("");

    }
}
