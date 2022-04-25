package com.example.week6_qn7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.Idly);
        button2 = (Button)findViewById(R.id.Dosa);
        button3 = (Button)findViewById(R.id.Poori);
        button4 = (Button)findViewById(R.id.Chapatti);
        button5 = (Button)findViewById(R.id.Rice);
        button6 = (Button)findViewById(R.id.Roti);

        button1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessage1(view);
            }
        });

        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessage2(view);
            }
        });

        button3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessage3(view);
            }
        });

        button4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessage4(view);
            }
        });

        button5.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessage5(view);
            }
        });

        button6.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessage6(view);
            }
        });
    };

    public void sendMessage1(View view) {
        Toast.makeText(MainActivity.this, "Ordered IDLY", Toast.LENGTH_SHORT).show();
    }
    public void sendMessage2(View view) {
        Toast.makeText(MainActivity.this, "Ordered Dosa", Toast.LENGTH_SHORT).show();
    }
    public void sendMessage3(View view) {
        Toast.makeText(MainActivity.this, "Ordered Poori", Toast.LENGTH_SHORT).show();
    }
    public void sendMessage4(View view) {
        Toast.makeText(MainActivity.this, "Ordered Chapatti", Toast.LENGTH_SHORT).show();
    }
    public void sendMessage5(View view) {
        Toast.makeText(MainActivity.this, "Ordered Rice", Toast.LENGTH_SHORT).show();
    }
    public void sendMessage6(View view) {
        Toast.makeText(MainActivity.this, "Ordered Roti", Toast.LENGTH_SHORT).show();
    }
}