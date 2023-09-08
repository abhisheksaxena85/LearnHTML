package com.techofgrowth.learnhtml;

import android.content.Context;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerView_adapter extends RecyclerView.Adapter<recyclerView_adapter.ViewHolder> {
Context context;
item_Listener listener;
ArrayList<bookmark_modle> bookmarkmodle;
    recyclerView_adapter(Context context, ArrayList<bookmark_modle> bookmarkmodle, item_Listener listener){
        this.bookmarkmodle = bookmarkmodle;
        this.listener = listener;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recyclerview_layout, parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(bookmarkmodle.get(position).title);
        holder.card.setOnClickListener(v-> {
            listener.onItemClicked(bookmarkmodle.get(position));
        });
    }

    @Override
    public int getItemCount() {
        return bookmarkmodle.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        CardView card;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.bookmark_title);
            card = itemView.findViewById(R.id.card);
        }
    }
}
