package com.example.lab2_pt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn_case1) ;

        // Navigate to AboutActivity
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, case1.class);
                startActivity(intent);
            }
        });
        
        btn2 = findViewById(R.id.btn_case2) ;

        // Navigate to AboutActivity
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, case2.class);
                startActivity(intent);
            }
        });
        btn3 = findViewById(R.id.btn_case3) ;

        // Navigate to AboutActivity
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, case3.class);
                startActivity(intent);
            }
        });
        btn4 = findViewById(R.id.btn_case4) ;

        // Navigate to AboutActivity
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, case4.class);
                startActivity(intent);
            }
        });

        btn5 = findViewById(R.id.btn_case5) ;

        // Navigate to AboutActivity
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, case5.class);
                startActivity(intent);
            }
        });

        btn6 = findViewById(R.id.btn_case6) ;

        // Navigate to AboutActivity
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, case4.class);
                startActivity(intent);
            }
        });
    }
}