package com.example.wordtree;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.WordViewHolder> {

    private List<String> wordList;
    private View.OnClickListener listener;

    public WordAdapter(List<String> wordList, View.OnClickListener listener) {
        this.wordList = wordList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_word, parent, false);

        return new WordViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        String word = wordList.get(position);
        holder.wordTextView.setText(word);

        int greenColor = ContextCompat.getColor(holder.itemView.getContext(), R.color.primary_color_2);
        int lightColor = ContextCompat.getColor(holder.itemView.getContext(), R.color.text_color_1);
        int brownColor = ContextCompat.getColor(holder.itemView.getContext(), R.color.category);;

        if (position % 2 == 0) {
            holder.wordTextView.setBackgroundColor(greenColor);
            holder.wordTextView.setTextColor(lightColor);
        } else {
            holder.wordTextView.setBackgroundColor(lightColor);
            holder.wordTextView.setTextColor(brownColor);
        }

        holder.itemView.setOnClickListener(v -> {
            if (listener != null) {
                listener.onClick(v);
            }
        });

    }

    @Override
    public int getItemCount() {
        return wordList.size();
    }

    static class WordViewHolder extends RecyclerView.ViewHolder {

        TextView wordTextView;

        public WordViewHolder(@NonNull View itemView) {
            super(itemView);
            wordTextView = itemView.findViewById(R.id.wordTextView);
        }

    }

}
