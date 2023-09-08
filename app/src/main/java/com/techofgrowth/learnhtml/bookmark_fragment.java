package com.techofgrowth.learnhtml;
import android.content.Intent;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

public class bookmark_fragment extends Fragment implements item_Listener{
    public bookmark_fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bookmark_fragment, container, false);


        //Bookmark elements
        LinearLayout bookmarkTag = view.findViewById(R.id.bookmarkTag);
        LinearLayout bookmarkErrorIMG = view.findViewById(R.id.bookmarkErrorIMG);
        View horizontal = view.findViewById(R.id.horizontal_rule);

        //Initializing database
        bookmarkDBhelper dBhelper = new bookmarkDBhelper(getContext());
        //Data array
        ArrayList<bookmark_modle> arrayBookmark =  dBhelper.getBookmark();


        //Bookmark Modle
        bookmark_modle modle = new bookmark_modle();

        //Setting RecyclerView
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        //Setting Adapter
        recyclerView_adapter adapter = new recyclerView_adapter(getContext(),arrayBookmark,this);
        recyclerView.setAdapter(adapter);


        //Checking if any data is available in SQL database
        if(arrayBookmark.size()==0){
            bookmarkTag.setVisibility(View.GONE);
            horizontal.setVisibility(View.GONE);
            bookmarkErrorIMG.setVisibility(View.VISIBLE);
        }else{
            bookmarkTag.setVisibility(View.VISIBLE);
            horizontal.setVisibility(View.VISIBLE);
            bookmarkErrorIMG.setVisibility(View.GONE);
        }
        return view;
    }


    @Override
    public void onItemClicked(bookmark_modle modle){

        String title = modle.title;
        String file = modle.file;
        Intent intent = new Intent(getContext(), card1_content.class);
        intent.putExtra("file",file);
        intent.putExtra("title",title);
        startActivity(intent);
    }
}