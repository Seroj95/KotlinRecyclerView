package com.example.recyclerviewjava;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter <RecyclerViewAdapter.RecyclerViewViewHolder>{
    private ArrayList<RecyclerViewItems>arrayList;
    public static class RecyclerViewViewHolder extends RecyclerView.ViewHolder{
public ImageView imageView;
public TextView textView1;
public TextView textView2;
        public RecyclerViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView);
            textView1=itemView.findViewById(R.id.textView1);
            textView2=itemView.findViewById(R.id.textView2);

        }
    }

    public RecyclerViewAdapter(ArrayList<RecyclerViewItems> arrayList) {
        this.arrayList = arrayList;
    }



    @NonNull
    @Override
    public RecyclerViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.recyler_view_item, parent, false);
        return new RecyclerViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewViewHolder holder, int position) {
        RecyclerViewItems recyclerViewItems=arrayList.get(position);
holder.imageView.setImageResource(recyclerViewItems.getImageRecours());
holder.textView1.setText(recyclerViewItems.getText1());
holder.textView2.setText(recyclerViewItems.getText2());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
