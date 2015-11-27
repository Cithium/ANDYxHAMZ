package com.example.hamza.andyxhamz;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button back     = (Button) findViewById(R.id.back);
        Button javaProg = (Button) findViewById(R.id.JavaProg);

        javaProg.setOnClickListener(new Button.OnClickListener() {
                                    public void onClick(View v) {
                                        startActivity(new Intent(getApplicationContext(), JavaActivity.class));
                                    }
                                }
        );

        back.setOnClickListener(new Button.OnClickListener() {
                                     public void onClick(View v) {
                                         startActivity(new Intent(getApplicationContext(), MainActivity.class));
                                     }
                                }
        );


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
