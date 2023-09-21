package com.techofgrowth.learnhtml;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.gms.ads.AdView;

public class card5_activity extends AppCompatActivity {
Toolbar toolbar;
CardView card1,card2,card3,card4,card5;
String file1,file2,file3,file4,file5;
String t1,t2,t3,t4,t5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card5);


        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("");


        card1 = findViewById(R.id.fifth_card1);
        card2 = findViewById(R.id.fifth_card2);
        card3 = findViewById(R.id.fifth_card3);
        card4 = findViewById(R.id.fifth_card4);
        card5 = findViewById(R.id.fifth_card5);


        file1 = "file:///android_asset/html_drag_and_drop.html";
        file2 = "file:///android_asset/html_geolocation.html";
        file3 = "file:///android_asset/html_web_storage.html";
        file4 = "file:///android_asset/html_web_workers.html";
        file5 = "file:///android_asset/html5_server_sent_event_html.html";


        t1  = "HTML Drag and Drop";
        t2  = "HTML Geolocation";
        t3  = "HTML Web Storage";
        t4  = "HTML Web Workers";
        t5  = "HTML5 Server-Sent Event";


        contentIntent(card1,file1,t1);
        contentIntent(card2,file2,t2);
        contentIntent(card3,file3,t3);
        contentIntent(card4,file4,t4);
        contentIntent(card5,file5,t5);


        AdView banner = findViewById(R.id.banner_ad);
        allFunctions allfunctions_obj = new allFunctions();
        allfunctions_obj.bannerAd(banner);


    }

    public void contentIntent(CardView card, String file, String title){
        card.setOnClickListener(v -> {
            Intent webIntent = new Intent(card5_activity.this, card1_content.class);
            webIntent.putExtra("file",file);
            webIntent.putExtra("title",title);
            startActivity(webIntent);
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onBackPressed();
        return super.onOptionsItemSelected(item);
    }
}