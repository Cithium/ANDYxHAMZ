package com.example.hamza.andyxhamz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class JavaFortsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_forts);

        Button ovningar = (Button) findViewById(R.id.javafovningar);
        ovningar.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://cs.lth.se/edaa30/oevningsuppgifter/"));
                startActivity(intent);
            }
        });

        Button seminarier = (Button) findViewById(R.id.javafseminarier);
        seminarier.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://cs.lth.se/edaa30/seminarier/"));
                startActivity(intent);
            }


        });

        Button labb = (Button) findViewById(R.id.javaflabb);
        labb.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://cs.lth.se/edaa30/laborationer/"));
                startActivity(intent);
            }


        });

        Button extentor = (Button) findViewById(R.id.javafextentor);
        extentor.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://cs.lth.se/edaa30/extentor/"));
                startActivity(intent);
            }


        });
    }

}
