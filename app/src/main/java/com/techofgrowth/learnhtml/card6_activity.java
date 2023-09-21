package com.techofgrowth.learnhtml;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.gms.ads.AdView;

public class card6_activity extends AppCompatActivity {
Toolbar toolbar;
CardView card1;
String file1;
String t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card6);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("");

        card1 = findViewById(R.id.fifth_card1);

        file1 = "file:///android_asset/html_color_names.html";

        t1  = "500+ HTML Color Names";

        contentIntent(card1,file1,t1);

        AdView banner = findViewById(R.id.banner_ad);
        allFunctions allfunctions_obj = new allFunctions();
        allfunctions_obj.bannerAd(banner);



    }
    public void contentIntent(CardView card, String file, String title){
        card.setOnClickListener(v -> {
            Intent webIntent = new Intent(card6_activity.this, card1_content.class);
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