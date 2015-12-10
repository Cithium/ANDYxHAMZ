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

public class DatabasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_databas);

        Button dbForelasningarButton = (Button) findViewById(R.id.dbforelasningar);
        dbForelasningarButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://cs.lth.se/edaf20-database-technology/lectures/"));
                startActivity(intent);
            }
        });

        Button dbLaborationButton = (Button) findViewById(R.id.dblaboration);
        dbLaborationButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://cs.lth.se/edaf20-database-technology/computer-labs/"));
                startActivity(intent);
            }


        });

        Button dbProjectButton = (Button) findViewById(R.id.dbprojekt);
        dbProjectButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://cs.lth.se/edaf20-database-technology/project/"));
                startActivity(intent);
            }


        });

        Button dbTentamenButton = (Button) findViewById(R.id.dbtentamen);
        dbTentamenButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://cs.lth.se/edaf20-database-technology/examination/"));
                startActivity(intent);
            }
        });
    }

}
