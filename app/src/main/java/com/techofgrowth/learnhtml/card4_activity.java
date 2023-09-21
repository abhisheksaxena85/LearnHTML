package com.techofgrowth.learnhtml;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.gms.ads.AdView;

public class card4_activity extends AppCompatActivity {
Toolbar toolbar;
CardView card1,card2,card3,card4,card5,card6,card7,card8,card9,card10,card11,card12;
String file1,file2,file3,file4,file5,file6,file7,file8,file9,file10,file11,file12;
String t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card4);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("");



        card1 = findViewById(R.id.fourth_card1);
        card2 = findViewById(R.id.fourth_card2);
        card3 = findViewById(R.id.fourth_card3);
        card4 = findViewById(R.id.fourth_card4);
        card5 = findViewById(R.id.fourth_card5);
        card6 = findViewById(R.id.fourth_card6);
        card7 = findViewById(R.id.fourth_card7);
        card8 = findViewById(R.id.fourth_card8);
        card9 = findViewById(R.id.fourth_card9);
        card10 = findViewById(R.id.fourth_card10);
        card11 = findViewById(R.id.fourth_card11);
        card12 = findViewById(R.id.fourth_card12);



        file1 = "file:///android_asset/html5_tutorial.html";
        file2 = "file:///android_asset/html5_user_manual.html";
        file3 = "file:///android_asset/html5_tags.html";
        file4 = "file:///android_asset/html5_new_elements.html";
        file5 = "file:///android_asset/html5_event_attributes.html";
        file6 = "file:///android_asset/html5_google_maps.html";
        file7 = "file:///android_asset/html5_semantics.html";
        file8 = "file:///android_asset/html5_migration.html";
        file9 = "file:///android_asset/html5_audio_tag.html";
        file10 = "file:///android_asset/html5_video_tag.html";
        file11 = "file:///android_asset/html5_svg_tag.html";
        file12 = "file:///android_asset/html5_canvas_tag.html";


        t1  = "HTML5 Tutorial";
        t2  = "HTML5 User Manual";
        t3  = "HTML5 Tags";
        t4  = "HTML5 New Elements";
        t5  = "HTML5 Event Attributes";
        t6  = "HTML5 Google Maps";
        t7  = "HTML5 Semantics";
        t8  = "HTML5 Migration";
        t9  = "HTML5 Audio Tag";
        t10 = "HTML5 Video Tag";
        t11 = "HTML5 SVG Tag";
        t12 = "HTML5 Canvas Tag";



        contentIntent(card1,file1,t1);
        contentIntent(card2,file2,t2);
        contentIntent(card3,file3,t3);
        contentIntent(card4,file4,t4);
        contentIntent(card5,file5,t5);
        contentIntent(card6,file6,t6);
        contentIntent(card7,file7,t7);
        contentIntent(card8,file8,t8);
        contentIntent(card9,file9,t9);
        contentIntent(card10,file10,t10);
        contentIntent(card11,file11,t11);
        contentIntent(card12,file12,t12);


        AdView banner = findViewById(R.id.banner_ad);
        allFunctions allfunctions_obj = new allFunctions();
        allfunctions_obj.bannerAd(banner);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onBackPressed();
        return super.onOptionsItemSelected(item);
    }
    public void contentIntent(CardView card, String file, String title){
        card.setOnClickListener(v -> {
            Intent webIntent = new Intent(card4_activity.this, card1_content.class);
            webIntent.putExtra("file",file);
            webIntent.putExtra("title",title);
            startActivity(webIntent);
        });
    }
}