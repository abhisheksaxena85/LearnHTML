package com.techofgrowth.learnhtml;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class faq_fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public faq_fragment() {
        // Required empty public constructor
    }

    CardView card1,card2,card3,card4,card5,card6,card7,card8,card9,card10,card11,card12,card13,card14,card15;
    CardView card16,card17,card18,card19,card20,card21,card22,card23,card24,card25,card26,card27,card28,card29,card30;
    CardView card31, card32,card33,card34,card35;
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29,t30,t31,t32,t33,t34,t35;

    public static faq_fragment newInstance(String param1, String param2) {
        faq_fragment fragment = new faq_fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_faq_fragment, container, false);





        card1 = view.findViewById(R.id.card1);
        card2 = view.findViewById(R.id.card2);
        card3 = view.findViewById(R.id.card3);
        card4 = view.findViewById(R.id.card4);
        card5 = view.findViewById(R.id.card5);
        card6 = view.findViewById(R.id.card6);
        card7 = view.findViewById(R.id.card7);
        card8 = view.findViewById(R.id.card8);
        card9 = view.findViewById(R.id.card9);
        card10 = view.findViewById(R.id.card10);
        card11 = view.findViewById(R.id.card11);
        card12 = view.findViewById(R.id.card12);
        card13 = view.findViewById(R.id.card13);
        card14 = view.findViewById(R.id.card14);
        card15 = view.findViewById(R.id.card15);
        card16 = view.findViewById(R.id.card16);
        card17 = view.findViewById(R.id.card17);
        card18 = view.findViewById(R.id.card18);
        card19 = view.findViewById(R.id.card19);
        card20 = view.findViewById(R.id.card20);
        card21 = view.findViewById(R.id.card21);
        card22 = view.findViewById(R.id.card22);
        card23 = view.findViewById(R.id.card23);
        card24 = view.findViewById(R.id.card24);
        card25 = view.findViewById(R.id.card25);
        card26 = view.findViewById(R.id.card26);
        card27 = view.findViewById(R.id.card27);
        card28 = view.findViewById(R.id.card28);
        card29 = view.findViewById(R.id.card29);
        card30 = view.findViewById(R.id.card30);
        card31 = view.findViewById(R.id.card31);
        card32 = view.findViewById(R.id.card32);
        card33 = view.findViewById(R.id.card33);
        card34 = view.findViewById(R.id.card34);
        card35 = view.findViewById(R.id.card35);


        t1 = view.findViewById(R.id.card1_heading);
        t2 = view.findViewById(R.id.card2_heading);
        t3 = view.findViewById(R.id.card3_heading);
        t4 = view.findViewById(R.id.card4_heading);
        t5 = view.findViewById(R.id.card5_heading);
        t6 = view.findViewById(R.id.card6_heading);
        t7 = view.findViewById(R.id.card7_heading);
        t8 = view.findViewById(R.id.card8_heading);
        t9 = view.findViewById(R.id.card9_heading);
        t10 = view.findViewById(R.id.card10_heading);
        t11 = view.findViewById(R.id.card11_heading);
        t12 = view.findViewById(R.id.card12_heading);
        t13 = view.findViewById(R.id.card13_heading);
        t14 = view.findViewById(R.id.card14_heading);
        t15 = view.findViewById(R.id.card15_heading);
        t16 = view.findViewById(R.id.card16_heading);
        t17 = view.findViewById(R.id.card17_heading);
        t18 = view.findViewById(R.id.card18_heading);
        t19 = view.findViewById(R.id.card19_heading);
        t20 = view.findViewById(R.id.card20_heading);
        t21 = view.findViewById(R.id.card21_heading);
        t22 = view.findViewById(R.id.card22_heading);
        t23 = view.findViewById(R.id.card23_heading);
        t24 = view.findViewById(R.id.card24_heading);
        t25 = view.findViewById(R.id.card25_heading);
        t26 = view.findViewById(R.id.card26_heading);
        t27 = view.findViewById(R.id.card27_heading);
        t28 = view.findViewById(R.id.card28_heading);
        t29 = view.findViewById(R.id.card29_heading);
        t30 = view.findViewById(R.id.card30_heading);
        t31 = view.findViewById(R.id.card31_heading);
        t32 = view.findViewById(R.id.card32_heading);
        t33 = view.findViewById(R.id.card33_heading);
        t34 = view.findViewById(R.id.card34_heading);
        t35 = view.findViewById(R.id.card35_heading);


        t1.setText("What is HTML?");
        t2.setText("What are Tags?");
        t3.setText("Do all HTML tags have an end tag?");
        t4.setText("What is formatting in HTML?");
        t5.setText("How many types of heading does an HTML contain?");
        t6.setText("How to create a hyperlink in HTML?");
        t7.setText("What are some common lists that are used when designing a page?");
        t8.setText("What is the difference between HTML elements and tags?");
        t9.setText("What is semantic HTML?");
        t10.setText("What is an image map?");
        t11.setText("How to insert a copyright symbol on a browser page?");
        t12.setText("How to create a nested webpage in HTML?");
        t13.setText("Does a hyperlink only apply to text?");
        t14.setText("What is a style sheet?");
        t15.setText("Can you create a multi-colored text on a web page?");
        t16.setText("Is it possible to change the color of the bullet?");
        t17.setText("Explain the layout of HTML?");
        t18.setText("What is marquee?");
        t19.setText("How many tags can be used to separate a section of texts?");
        t20.setText("How to make a picture of a background image of a webpage?");
        t21.setText("What are empty elements?");
        t22.setText("What is the use of a span tag? Give one example.");
        t23.setText("What is the use of an iframe?");
        t24.setText("What are the entities in HTML?");
        t25.setText("Why is a URL encoded in HTML?");
        t26.setText("Does a <!DOCTYPE html> tag is a HTML tag?");
        t27.setText("What is the canvas element in HTML5?");
        t28.setText("What is SVG?");
        t29.setText("What are the different new form element types in HTML 5?");
        t30.setText("Which type of video formats are supported by HTML5?");
        t31.setText("Is audio tag supported in HTML 5?");
        t32.setText("What is the difference between progress and meter tag?");
        t33.setText("What is the use of figure tag in HTML 5?");
        t34.setText("What is the use of figcaption tag in HTML 5?");
        t35.setText("What is button tag?");


        contentIntent(card1, "file:///android_asset/faq_file1.html","What is HTML?");
        contentIntent(card2, "file:///android_asset/faq_file2.html","What are Tags?");
        contentIntent(card3, "file:///android_asset/faq_file3.html","Do all HTML tags have an end tag?");
        contentIntent(card4, "file:///android_asset/faq_file4.html","What is formatting in HTML?");
        contentIntent(card5, "file:///android_asset/faq_file5.html","How many types of heading does an HTML contain?");
        contentIntent(card6, "file:///android_asset/faq_file6.html","How to create a hyperlink in HTML?");
        contentIntent(card7, "file:///android_asset/faq_file7.html","What are some common lists that are used when designing a page?");
        contentIntent(card8, "file:///android_asset/faq_file8.html","What is the difference between HTML elements and tags?");
        contentIntent(card9, "file:///android_asset/faq_file9.html","What is semantic HTML?");
        contentIntent(card10,"file:///android_asset/faq_file10.html","What is an image map?");
        contentIntent(card11,"file:///android_asset/faq_file11.html","How to insert a copyright symbol on a browser page?");
        contentIntent(card12,"file:///android_asset/faq_file12.html","How to create a nested webpage in HTML?");
        contentIntent(card13,"file:///android_asset/faq_file13.html","Does a hyperlink only apply to text?");
        contentIntent(card14,"file:///android_asset/faq_file14.html","What is a style sheet?");
        contentIntent(card15,"file:///android_asset/faq_file15.html","Can you create a multi-colored text on a web page?");
        contentIntent(card16,"file:///android_asset/faq_file16.html","Is it possible to change the color of the bullet?");
        contentIntent(card17,"file:///android_asset/faq_file17.html","Explain the layout of HTML?");
        contentIntent(card18,"file:///android_asset/faq_file18.html","What is marquee?");
        contentIntent(card19,"file:///android_asset/faq_file19.html","How many tags can be used to separate a section of texts?");
        contentIntent(card20,"file:///android_asset/faq_file20.html","How to make a picture of a background image of a webpage?");
        contentIntent(card21,"file:///android_asset/faq_file21.html","What are empty elements?");
        contentIntent(card22,"file:///android_asset/faq_file22.html","What is the use of a span tag? Give one example.");
        contentIntent(card23,"file:///android_asset/faq_file23.html","What is the use of an iframe?");
        contentIntent(card24,"file:///android_asset/faq_file24.html","What are the entities in HTML?");
        contentIntent(card25,"file:///android_asset/faq_file25.html","Why is a URL encoded in HTML?");
        contentIntent(card26,"file:///android_asset/faq_file26.html","Does a <!DOCTYPE html> tag is a HTML tag?");
        contentIntent(card27,"file:///android_asset/faq_file27.html","What is the canvas element in HTML5?");
        contentIntent(card28,"file:///android_asset/faq_file28.html","What is SVG?");
        contentIntent(card29,"file:///android_asset/faq_file29.html","What are the different new form element types in HTML 5?");
        contentIntent(card30,"file:///android_asset/faq_file30.html","Which type of video formats are supported by HTML5?");
        contentIntent(card31,"file:///android_asset/faq_file31.html","Is audio tag supported in HTML 5?");
        contentIntent(card32,"file:///android_asset/faq_file32.html","What is the difference between progress and meter tag?");
        contentIntent(card33,"file:///android_asset/faq_file33.html","What is the use of figure tag in HTML 5?");
        contentIntent(card34,"file:///android_asset/faq_file34.html","What is the use of figcaption tag in HTML 5?");
        contentIntent(card35,"file:///android_asset/faq_file35.html","What is button tag?");

        return view;
    }

    public void contentIntent(CardView card, String file, String title){
        card.setOnClickListener(v -> {
            Intent webIntent = new Intent(getActivity(), faq_content.class);
            webIntent.putExtra("file",file);
            webIntent.putExtra("title",title);
            startActivity(webIntent);
        });
    }

}