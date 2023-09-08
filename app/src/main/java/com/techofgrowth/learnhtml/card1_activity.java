package com.techofgrowth.learnhtml;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
public class card1_activity extends AppCompatActivity {
String file;
Toolbar toolbar;
CardView card1,card2,card3,card4,card5,card6,card7,card8,card9,card10,card11,card12,card13,card14,card15;
CardView card16,card17,card18,card19,card20,card21,card22,card23,card24,card25,card26,card27,card28,card29,card30;
CardView card31, card32,card33,card34,card35,card36,card37;
TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29,t30,t31,t32,t33,t34,t35,t36,t37;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card1);

        //ToolBar
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        t1 = findViewById(R.id.card1_heading);
        t2 = findViewById(R.id.card2_heading);
        t3 = findViewById(R.id.card3_heading);
        t4 = findViewById(R.id.card4_heading);
        t5 = findViewById(R.id.card5_heading);
        t6 = findViewById(R.id.card6_heading);
        t7 = findViewById(R.id.card7_heading);
        t8 = findViewById(R.id.card8_heading);
        t9 = findViewById(R.id.card9_heading);
        t10 = findViewById(R.id.card10_heading);
        t11 = findViewById(R.id.card11_heading);
        t12 = findViewById(R.id.card12_heading);
        t13 = findViewById(R.id.card13_heading);
        t14 = findViewById(R.id.card14_heading);
        t15 = findViewById(R.id.card15_heading);
        t16 = findViewById(R.id.card16_heading);
        t17 = findViewById(R.id.card17_heading);
        t18 = findViewById(R.id.card18_heading);
        t19 = findViewById(R.id.card19_heading);
        t20 = findViewById(R.id.card20_heading);
        t21 = findViewById(R.id.card21_heading);
        t22 = findViewById(R.id.card22_heading);
        t23 = findViewById(R.id.card23_heading);
        t24 = findViewById(R.id.card24_heading);
        t25 = findViewById(R.id.card25_heading);
        t26 = findViewById(R.id.card26_heading);
        t27 = findViewById(R.id.card27_heading);
        t28 = findViewById(R.id.card28_heading);
        t29 = findViewById(R.id.card29_heading);
        t30 = findViewById(R.id.card30_heading);
        t31 = findViewById(R.id.card31_heading);
        t32 = findViewById(R.id.card32_heading);
        t33 = findViewById(R.id.card33_heading);
        t34 = findViewById(R.id.card34_heading);
        t35 = findViewById(R.id.card35_heading);
        t36 = findViewById(R.id.card36_heading);
        t37 = findViewById(R.id.card37_heading);



        t1.setText("HTML Tutorial");
        t2.setText("What is HTML?");
        t3.setText("HTML Text Editors");
        t4.setText("Building Blocks of HTML");
        t5.setText("HTML Tags");
        t6.setText("HTML Attribute");
        t7.setText("HTML Elements");
        t8.setText("HTML Formatting");
        t9.setText("HTML Heading");
        t10.setText("HTML Paragraph");
        t11.setText("HTML Phrase Tag");
        t12.setText("HTML Anchor");
        t13.setText("HTML Image");
        t14.setText("HTML Table");
        t15.setText("HTML Lists");
        t16.setText("HTML Ordered Lists");
        t17.setText("HTML Unordered List");
        t18.setText("HTML Description List");
        t19.setText("HTML Form");
        t20.setText("HTML Form Input Types");
        t21.setText("HTML Form Attribute");
        t22.setText("HTML Style Using CSS");
        t23.setText("HTML Classes");
        t24.setText("HTML Id Attribute");
        t25.setText("HTML iframes");
        t26.setText("HTML JavaScript");
        t27.setText("HTML Comments");
        t28.setText("HTML File Paths");
        t29.setText("HTML Head");
        t30.setText("HTML Layouts");
        t31.setText("HTML Layout Techniques");
        t32.setText("HTML Responsive");
        t33.setText("HTML Computer Code");
        t34.setText("HTML Entities");
        t35.setText("HTML Symbols");
        t36.setText("HTML Charset");
        t37.setText("HTML URL Encode");


        card1 = findViewById(R.id.card1);
        card2 = findViewById(R.id.card2);
        card3 = findViewById(R.id.card3);
        card4 = findViewById(R.id.card4);
        card5 = findViewById(R.id.card5);
        card6 = findViewById(R.id.card6);
        card7 = findViewById(R.id.card7);
        card8 = findViewById(R.id.card8);
        card9 = findViewById(R.id.card9);
        card10 = findViewById(R.id.card10);
        card11 = findViewById(R.id.card11);
        card12 = findViewById(R.id.card12);
        card13 = findViewById(R.id.card13);
        card14 = findViewById(R.id.card14);
        card15 = findViewById(R.id.card15);
        card16 = findViewById(R.id.card16);
        card17 = findViewById(R.id.card17);
        card18 = findViewById(R.id.card18);
        card19 = findViewById(R.id.card19);
        card20 = findViewById(R.id.card20);
        card21 = findViewById(R.id.card21);
        card22 = findViewById(R.id.card22);
        card23 = findViewById(R.id.card23);
        card24 = findViewById(R.id.card24);
        card25 = findViewById(R.id.card25);
        card26 = findViewById(R.id.card26);
        card27 = findViewById(R.id.card27);
        card28 = findViewById(R.id.card28);
        card29 = findViewById(R.id.card29);
        card30 = findViewById(R.id.card30);
        card31 = findViewById(R.id.card31);
        card32 = findViewById(R.id.card32);
        card33 = findViewById(R.id.card33);
        card34 = findViewById(R.id.card34);
        card35 = findViewById(R.id.card35);
        card36 = findViewById(R.id.card36);
        card37 = findViewById(R.id.card37);




        contentIntent(card1, "file:///android_asset/html_tutorial.html","HTML Tutorial");
        contentIntent(card2, "file:///android_asset/what_is_html.html","What is HTML");
        contentIntent(card3, "file:///android_asset/html_text_editor.html","HTML Text Editors");
        contentIntent(card4, "file:///android_asset/building_block_html.html","Building Blocks of HTML");
        contentIntent(card5, "file:///android_asset/html_tags.html","HTML Tags");
        contentIntent(card6, "file:///android_asset/html_attribute.html","HTML Attribute");
        contentIntent(card7, "file:///android_asset/html_elements.html","HTML Elements");
        contentIntent(card8, "file:///android_asset/html_formatting.html","HTML Formatting");
        contentIntent(card9, "file:///android_asset/html_heading.html","HTML Heading");
        contentIntent(card10,"file:///android_asset/html_paragraph.html","HTML Paragraph");
        contentIntent(card11,"file:///android_asset/html_pharse_tag.html","HTML Phrase Tag");
        contentIntent(card12,"file:///android_asset/html_anchor.html","HTML Anchor");
        contentIntent(card13,"file:///android_asset/html_image.html","HTML Image");
        contentIntent(card14,"file:///android_asset/html_table.html","HTML Table");
        contentIntent(card15,"file:///android_asset/html_lists.html","HTML Lists");
        contentIntent(card16,"file:///android_asset/html_ordered_list.html","HTML Ordered Lists");
        contentIntent(card17,"file:///android_asset/html_unordered_list.html","HTML Unordered List");
        contentIntent(card18,"file:///android_asset/html_description_list.html","HTML Description List");
        contentIntent(card19,"file:///android_asset/html_form.html","HTML Form");
        contentIntent(card20,"file:///android_asset/html_form_input_layout.html","HTML Form Input Types");
        contentIntent(card21,"file:///android_asset/html_form_attribute.html","HTML Form Attribute");
        contentIntent(card22,"file:///android_asset/html_style_using_css.html","HTML Style Using CSS");
        contentIntent(card23,"file:///android_asset/html_classes.html","HTML Classes");
        contentIntent(card24,"file:///android_asset/html_id_attribute.html","HTML Id Attribute");
        contentIntent(card25,"file:///android_asset/html_iframes.html","HTML iframes");
        contentIntent(card26,"file:///android_asset/html_javascript.html","HTML JavaScript");
        contentIntent(card27,"file:///android_asset/html_comments.html","HTML Comments");
        contentIntent(card28,"file:///android_asset/html_file_paths.html","HTML File Paths");
        contentIntent(card29,"file:///android_asset/html_head.html","HTML Head");
        contentIntent(card30,"file:///android_asset/html_layouts.html","HTML Layouts");
        contentIntent(card31,"file:///android_asset/html_layout_techniques.html","HTML Layout Techniques");
        contentIntent(card32,"file:///android_asset/html_responsive.html","HTML Responsive");
        contentIntent(card33,"file:///android_asset/html_computer_code.html","HTML Computer Code");
        contentIntent(card34,"file:///android_asset/html_entities.html","HTML Entities");
        contentIntent(card35,"file:///android_asset/html_symbols.html","HTML Symbols");
        contentIntent(card36,"file:///android_asset/html_charset.html","HTML Charset");
        contentIntent(card37,"file:///android_asset/html_url_encode.html","HTML URL Encode");









    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onBackPressed();
        return super.onOptionsItemSelected(item);
    }

    public void contentIntent(CardView card, String file, String title){
        card.setOnClickListener(v -> {
            Intent webIntent = new Intent(card1_activity.this, card1_content.class);
            webIntent.putExtra("file",file);
            webIntent.putExtra("title",title);
            startActivity(webIntent);
        });
    }


}