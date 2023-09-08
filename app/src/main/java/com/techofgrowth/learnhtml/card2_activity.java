package com.techofgrowth.learnhtml;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;

public class card2_activity extends AppCompatActivity {
Toolbar toolbar;
CardView card1, card2;
String card1_title, card2_title, file1, file2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card2);


        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        card1_title = "Global Attributes";
        card2_title = "HTML Event Attributes";

        file1 = "file:///android_asset/global_attributes.html";
        file2 = "file:///android_asset/html_event_attributes.html";


        card1 = findViewById(R.id.second_card1);
        card2 = findViewById(R.id.second_card2);

        card1.setOnClickListener(v-> {
            Intent content_intent = new Intent(card2_activity.this, card1_content.class);
            content_intent.putExtra("title", card1_title);
            content_intent.putExtra("file",file1);
            startActivity(content_intent);
        });

        card2.setOnClickListener(v-> {
            Intent content_intent = new Intent(card2_activity.this, card1_content.class);
            content_intent.putExtra("title",card2_title);
            content_intent.putExtra("file",file2);
            startActivity(content_intent);
        });





    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onBackPressed();
        return super.onOptionsItemSelected(item);
    }
}