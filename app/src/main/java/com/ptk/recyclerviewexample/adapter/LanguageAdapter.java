package com.ptk.recyclerviewexample.adapter;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.ptk.recyclerviewexample.R;
import com.ptk.recyclerviewexample.model.LanguageModel;

import java.util.ArrayList;

public class LanguageAdapter extends RecyclerView.Adapter<LanguageAdapter.MyViewHolder> {

    ArrayList<LanguageModel> languages;

    public LanguageAdapter(ArrayList<LanguageModel> languages) {
        this.languages = languages;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_languages, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Typeface typeface = ResourcesCompat.getFont(holder.itemView.getContext(), R.font.astral_sisters);
        holder.tvLanguage.setTypeface(typeface);
        holder.tvLanguage.setText(languages.get(position).getLanguageName());
        holder.tvDate.setText(languages.get(position).getDate());
    }

    @Override
    public int getItemCount() {
        return languages.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvLanguage, tvDate;

        public MyViewHolder(@NonNull View v) {
            super(v);
            tvLanguage = v.findViewById(R.id.tvLanguage);
            tvDate = v.findViewById(R.id.tvDate);
        }
    }

}
