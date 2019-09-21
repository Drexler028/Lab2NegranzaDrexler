package com.negranza.lab2negranzadrexler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        et = findViewById(R.id.editText9);
    }

    public void Check(View v){
        SharedPreferences sp = getSharedPreferences("myData", MODE_PRIVATE);
        String course1 = sp.getString("Course1", null);
        String course2 = sp.getString("Course2", null);
        String course3 = sp.getString("Course3", null);
        String course4 = sp.getString("Course4", null);
        String course5 = sp.getString("Course5", null);
        String course6 = sp.getString("Course6", null);
        String course7 = sp.getString("Course7", null);
        String course8 = sp.getString("Course8", null);
        String etx = et.getText().toString();
        if(etx.equals(course1)||etx.equals(course2)||etx.equals(course3)||etx.equals(course4)||etx.equals(course5)||etx.equals(course6)||etx.equals(course7)||etx.equals(course8)){
            Toast.makeText(this, "Course is offered in UST", Toast.LENGTH_LONG).show();
        }

        else{
            Toast.makeText(this, "No course offered in UST", Toast.LENGTH_LONG).show();
        }
    }

    public void previous(View v){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }
    }
