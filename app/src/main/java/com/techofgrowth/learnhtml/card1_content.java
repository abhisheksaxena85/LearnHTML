package com.techofgrowth.learnhtml;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class card1_content extends AppCompatActivity {
Toolbar toolbar;
InterstitialAd inter_ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card1_content);


        AdView banner = findViewById(R.id.banner_ad);
        allFunctions allfunctions_obj = new allFunctions();
        allfunctions_obj.bannerAd(banner);

        //Calling Intertitial Ad fucntion
        InterAd();

        bookmarkDBhelper dBhelper = new bookmarkDBhelper(this);


        ImageView bookmarkImg = findViewById(R.id.card1_bookmark);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView toolbar_title = findViewById(R.id.content_title_toolbar);


        Intent getdata = getIntent();
        String file = getdata.getStringExtra("file");
        String title = getdata.getStringExtra("title");
        toolbar_title.setText(title);

        WebView webView = findViewById(R.id.webview);
        webView.loadUrl(file);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setSupportZoom(false);







        SharedPreferences preferences = getSharedPreferences("isBookmarked",MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        Boolean check = preferences.getBoolean(file,false);

        if(check){
            bookmarkImg.setImageResource(R.drawable.baseline_bookmark_added_24);
            final int[] count = {0};
            bookmarkImg.setOnClickListener(v-> {

                count[0] = count[0] +1;
                if(count[0] ==1){

                    if (dBhelper.deleteBookmark(file)) {
                        //On Succcess Delete
                        editor.putBoolean(file,false);
                        editor.apply();
                        bookmarkImg.setImageResource(R.drawable.baseline_bookmark_add_24);
                        View view = getLayoutInflater().inflate(R.layout.custom_toast_second,findViewById(R.id.customToast));

                        Toast toast = new Toast(getApplicationContext());
                        TextView toast_title = view.findViewById(R.id.second_toast_title);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.BOTTOM,0,0);
                        toast_title.setText("'"+title+"'"+" removed from bookmark");
                        toast.setView(view);
                        toast.show();

                        if(inter_ad!=null){
                            inter_ad.show(card1_content.this);
                        }
                    } else {
                        //When if Delete failed or row not found
                        Toast.makeText(this, "Delete failed!", Toast.LENGTH_SHORT).show();
                    }




                } else if (count[0] ==2) {

                    dBhelper.addBookmark(file,title);

                    editor.putBoolean(file,true);
                    editor.apply();
                    bookmarkImg.setImageResource(R.drawable.baseline_bookmark_added_24);
                    View view = getLayoutInflater().inflate(R.layout.custom_toast,findViewById(R.id.customToast));


                    Toast toast = new Toast(getApplicationContext());
                    TextView toast_title = view.findViewById(R.id.toast_title);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.BOTTOM,0,0);
                    toast_title.setText("'"+title+"'"+" added to bookmark");
                    toast.setView(view);
                    toast.show();

                    if(inter_ad!=null){
                        inter_ad.show(card1_content.this);
                    }

                }
                if(count[0] >=2){
                    count[0] =0;
                }
            });

        }else{
            bookmarkImg.setImageResource(R.drawable.baseline_bookmark_add_24);
            final int[] count = {0};
            bookmarkImg.setOnClickListener(v-> {

                count[0] = count[0] +1;
                if(count[0] ==1){

                    dBhelper.addBookmark(file,title);

                    editor.putBoolean(file,true);
                    editor.apply();
                    bookmarkImg.setImageResource(R.drawable.baseline_bookmark_added_24);
                    View view = getLayoutInflater().inflate(R.layout.custom_toast,findViewById(R.id.customToast));


                    Toast toast = new Toast(getApplicationContext());
                    TextView toast_title = view.findViewById(R.id.toast_title);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.BOTTOM,0,0);
                    toast_title.setText("'"+title+"'"+" added to bookmark");
                    toast.setView(view);
                    toast.show();

                    if(inter_ad!=null){
                        inter_ad.show(card1_content.this);
                    }

                } else if (count[0] ==2) {


                    if (dBhelper.deleteBookmark(file)) {

                        editor.putBoolean(file,false);
                        editor.apply();
                        bookmarkImg.setImageResource(R.drawable.baseline_bookmark_add_24);
                        View view = getLayoutInflater().inflate(R.layout.custom_toast_second,findViewById(R.id.customToast));

                        Toast toast = new Toast(getApplicationContext());
                        TextView toast_title = view.findViewById(R.id.second_toast_title);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.BOTTOM,0,0);
                        toast_title.setText("'"+title+"'"+" removed from bookmark");
                        toast.setView(view);
                        toast.show();

                        if(inter_ad!=null){
                            inter_ad.show(card1_content.this);
                        }

                    } else {
                        Toast.makeText(this, "Delete Failed!", Toast.LENGTH_SHORT).show();
                    }



                }
                if(count[0] >=2){
                    count[0] =0;
                }
            });

        }
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onBackPressed();
        return super.onOptionsItemSelected(item);
    }

    public void InterAd(){
        //Intertitial Ad View
        AdRequest ad_request = new AdRequest.Builder().build();
        InterstitialAd.load(this, getString(R.string.inertial_ad_unit_id), ad_request, new InterstitialAdLoadCallback() {
            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                super.onAdFailedToLoad(loadAdError);

            }

            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                super.onAdLoaded(interstitialAd);
                inter_ad = interstitialAd;

                inter_ad.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdClicked() {
                        super.onAdClicked();
                    }

                    @Override
                    public void onAdDismissedFullScreenContent() {
                        super.onAdDismissedFullScreenContent();
                    }

                    @Override
                    public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                        super.onAdFailedToShowFullScreenContent(adError);
                    }

                    @Override
                    public void onAdImpression() {
                        super.onAdImpression();
                    }

                    @Override
                    public void onAdShowedFullScreenContent() {
                        super.onAdShowedFullScreenContent();
                        inter_ad = null;
                    }
                });
            }


        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(inter_ad!=null){
            inter_ad.show(card1_content.this);
        }else {
        }
    }
}