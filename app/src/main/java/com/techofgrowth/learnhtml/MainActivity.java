package com.techofgrowth.learnhtml;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
public class MainActivity extends AppCompatActivity {
Toolbar toolbar;
CardView card1, card2, card3, card4, card5;
DrawerLayout drawerLayout;
NavigationView navigationView;
BottomNavigationView bottomNavigationView;
AlertDialog.Builder exitDialog;
InterstitialAd inter_ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(inter_ad!=null){
                    inter_ad.show(MainActivity.this);
                }
            }
        },20000);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                InterstitialAd.load(getApplicationContext(), getString(R.string.inertial_ad_unit_id), ad_request, new InterstitialAdLoadCallback() {
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
        },90000);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(inter_ad!=null){
                    inter_ad.show(MainActivity.this);
                }
            }
        },100000);




        AdView banner = findViewById(R.id.banner_ad);
        allFunctions allfunctions_obj = new allFunctions();
        allfunctions_obj.bannerAd(banner);

        //Seting potrait mode only
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //Adding custom toolbar
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Learn HTML");
        toolbar.setTitleTextColor(getResources().getColor(R.color.home_hame_burger_color));


        //Navigation Drawer ->
        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigationView);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.openDrawer,R.string.closeDrawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.home_hame_burger_color));
        toggle.syncState();


        bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if(id==R.id.home){
                    loadFragment(new home_fragment());
                    toolbar.setVisibility(View.VISIBLE);
                }else if(id==R.id.faq){
                    loadFragment(new faq_fragment());
                    toolbar.setVisibility(View.VISIBLE);
                } else if (id==R.id.quiz) {
                    loadFragment(new quiz_fragment());
                    toolbar.setVisibility(View.VISIBLE);
                }
                else if(id==R.id.bookmark) {
                    loadFragment(new bookmark_fragment());
                    toolbar.setVisibility(View.VISIBLE);
                }
                return  true;
            }
        });
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setItemHorizontalTranslationEnabled(true);


        navigationView = findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if(id==R.id.home_drawer){
                    startActivity(new Intent(MainActivity.this, MainActivity.class));
                    finish();
                }else if(id==R.id.bookmark_drawer){
                    Intent intent = new Intent(MainActivity.this, drawerFragement.class);
                    startActivity(intent);
                }
                else if(id==R.id.rating){
                    Uri uri = Uri.parse("market://details?id=" + "com.techofgrowth.learnhtml");//here will be the package name of live app
                    Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                    goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY | Intent.FLAG_ACTIVITY_NEW_DOCUMENT | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                    try {
                        startActivity(goToMarket);
                    } catch (ActivityNotFoundException anfe) {
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=com.techofgrowth.learnhtml")));
                }
                }else if(id==R.id.moreapps){
                    try {
                        String devId = "8387089514532519099";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://developer?id="+devId));
                        startActivity(intent);
                    }catch (ActivityNotFoundException e){
                        String devUrl = "https://play.google.com/store/apps/dev?id=8387089514532519099";
                        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(devUrl));
                        startActivity(intent);
                    }
                }else if(id==R.id.feedback){
                    Intent email_intent = new Intent(Intent.ACTION_SEND);
                    email_intent.setType("message/rfc822");
                    email_intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"abhisheksaxena904411@gmail.com","abhisheksaxena852828@gamil.com"});
                    email_intent.putExtra(Intent.EXTRA_SUBJECT,"HTML Learning App related query...");
                    email_intent.putExtra(Intent.EXTRA_TEXT,"Please! write here your message..");
                    startActivity(email_intent);
                }else if(id==R.id.shareapp){
                    Intent intent_share = new Intent(Intent.ACTION_SEND);
                    intent_share.setType("text/plain");
                    intent_share.putExtra(Intent.EXTRA_SUBJECT,"Download HTML Learning App");
                    intent_share.putExtra(Intent.EXTRA_TEXT,"Hi! Your friend just shared this HTML Learning App, Which can help You to learn coding for Webdevelopment. \n\n Get this app for free on PlayStore. \n https://play.google.com/store/apps/details?id=com.techofgrowth.learnhtml");
                    startActivity(Intent.createChooser(intent_share,"Share"));
                }

                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });






    }

    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
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
                            MainActivity.super.onBackPressed();
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

            //On Exit Dailog Box
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
            alertDialog.setTitle("Are you sure want to exit?");
            alertDialog.setIcon(R.drawable.baseline_exit_to_app_24);


            //On Cancel click
            alertDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                }
            });


            //On Exit Click
            alertDialog.setPositiveButton("EXIT", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    if(inter_ad!=null){
                        //Showing Intertitial Ad if Available
                        inter_ad.show(MainActivity.this);
                    }else{
                        //Else closing app
                        MainActivity.super.onBackPressed();
                    }
                }
            });
            alertDialog.show();
        }
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onBackPressed();
        return super.onOptionsItemSelected(item);
    }
    //User defined Functions
    public void loadFragment(Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frameLayout, fragment);
        ft.commit();
    }

    @Override
    protected void onResume() {
        if(inter_ad!=null){
            inter_ad.show(MainActivity.this);
        }
        super.onResume();
    }
}