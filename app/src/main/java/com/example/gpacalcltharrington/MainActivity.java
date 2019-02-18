package com.example.gpacalcltharrington;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        Button avgbtn = (Button) findViewById(R.id.avgbtn);
        avgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText gradeone = (EditText)findViewById(R.id.gradeone);
                EditText gradetwo = (EditText)findViewById(R.id.gradetwo);
                EditText gradethree = (EditText)findViewById(R.id.gradethree);
                EditText gradefour = (EditText)findViewById(R.id.gradefour);
                EditText gradefive= (EditText)findViewById(R.id.gradefive);
                TextView resulttextview =(TextView) findViewById(R.id.resulttextview);


                int num1 = Integer.parseInt(gradeone.getText().toString());
                int num2 = Integer.parseInt(gradetwo.getText().toString());
                int num3 = Integer.parseInt(gradethree.getText().toString());
                int num4 = Integer.parseInt(gradefour.getText().toString());
                int num5 = Integer.parseInt(gradefive.getText().toString());
                int result = (num1 + num2 +num3 +num4 + num5 ) / 5;
                resulttextview.setText(result + "");

                view.setBackgroundResource(R.color.red);


            }
        });

        }

    }



