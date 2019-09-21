package com.negranza.lab2negranzadrexler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2, et3, et4, et5, et6, et7, et8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.editText);
        et2 = findViewById(R.id.editText2);
        et3 = findViewById(R.id.editText3);
        et4 = findViewById(R.id.editText4);
        et5 = findViewById(R.id.editText5);
        et6 = findViewById(R.id.editText6);
        et7 = findViewById(R.id.editText7);
        et8 = findViewById(R.id.editText8);
    }

    public void saveData(View v){
        SharedPreferences sp = getSharedPreferences("myData", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        String et = et1.getText().toString();
        String et1 = et2.getText().toString();
        String et2 = et3.getText().toString();
        String et3 = et4.getText().toString();
        String et4 = et5.getText().toString();
        String et5 = et6.getText().toString();
        String et6 = et7.getText().toString();
        String et7 = et8.getText().toString();

        editor.putString("Course1", et);
        editor.putString("Course2", et1);
        editor.putString("Course3", et2);
        editor.putString("Course4", et3);
        editor.putString("Course5", et4);
        editor.putString("Course6", et5);
        editor.putString("Course7", et6);
        editor.putString("Course8", et7);
        editor.commit();
        Toast.makeText(this, "Data was saved!", Toast.LENGTH_LONG).show();

    }

    public void next(View v){

    }
}
