package com.techofgrowth.learnhtml;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
public class home_fragment extends Fragment {
CardView card1, card2, card3, card4, card5, card6;
    public home_fragment() {

        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_fragment, container, false);

        card1 = view.findViewById(R.id.card1_main);
        card2 = view.findViewById(R.id.card2_main);
        card3 = view.findViewById(R.id.card3_main);
        card4 = view.findViewById(R.id.card4_main);
        card5 = view.findViewById(R.id.card5_main);
        card6 = view.findViewById(R.id.card6_main);


        card1.setOnClickListener(v-> startActivity(new Intent(getActivity(),card1_activity.class)));
        card2.setOnClickListener(v-> startActivity(new Intent(getActivity(),card2_activity.class)));
        card3.setOnClickListener(v-> startActivity(new Intent(getActivity(),card3_activity.class)));
        card4.setOnClickListener(v-> startActivity(new Intent(getActivity(),card4_activity.class)));
        card5.setOnClickListener(v-> startActivity(new Intent(getActivity(),card5_activity.class)));
        card6.setOnClickListener(v-> startActivity(new Intent(getActivity(),card6_activity.class)));

        return view;
    }


}