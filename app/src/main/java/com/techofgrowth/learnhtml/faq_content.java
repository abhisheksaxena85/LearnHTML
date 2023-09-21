package com.techofgrowth.learnhtml;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdView;

public class faq_content extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq_content);

        AdView banner = findViewById(R.id.banner_ad);
        allFunctions allfunctions_obj = new allFunctions();
        allfunctions_obj.bannerAd(banner);


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
}