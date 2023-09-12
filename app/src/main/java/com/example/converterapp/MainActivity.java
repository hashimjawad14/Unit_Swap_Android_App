package com.example.converterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button weight_btn = (Button) findViewById(R.id.weight_convert_btn);
        Button temp_btn= (Button) findViewById(R.id.temp_convert_btn);
        Button length_btn = (Button) findViewById(R.id.length_convert_btn);

        weight_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent w_btn_intent=new Intent(MainActivity.this, Weight_Converter.class);
                startActivity(w_btn_intent);
            }
        });

        temp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent t_btn_intent=new Intent(MainActivity.this, Temp_Converter.class);
                startActivity(t_btn_intent);
            }
        });

        length_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent l_btn_intent= new Intent(MainActivity.this, Length_Converter.class);
                startActivity(l_btn_intent);
            }
        });

        statusbarColour();


    }

    private void statusbarColour(){

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
        {
            getWindow().setStatusBarColor(getResources().getColor(R.color.theme, this.getTheme()));
        }
    }


}