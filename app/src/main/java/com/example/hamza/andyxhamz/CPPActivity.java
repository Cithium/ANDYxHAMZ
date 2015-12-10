package com.example.hamza.andyxhamz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class CPPActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpp);
        getActionBar().setTitle("Hello world App");
        getSupportActionBar().setTitle("Hello world App");

        Button cppForelasningarButton = (Button) findViewById(R.id.cppforelasningar);
        cppForelasningarButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://cs.lth.se/edaf30/forelasningar/"));
                startActivity(intent);
            }
        });

        Button cppLaborationButton = (Button) findViewById(R.id.cpplaboration);
        cppLaborationButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://cs.lth.se/edaf30/laborationer/"));
                startActivity(intent);
            }


        });

        Button cppInlamningarButton = (Button) findViewById(R.id.cppinlamningar);
        cppInlamningarButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://cs.lth.se/edaf30/inlamningsuppgifter/"));
                startActivity(intent);
            }


        });

        Button cppTentamenButton = (Button) findViewById(R.id.cpptentamen);
        cppTentamenButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://cs.lth.se/edaf30/examination/"));
                startActivity(intent);
            }
        });
    }

}
