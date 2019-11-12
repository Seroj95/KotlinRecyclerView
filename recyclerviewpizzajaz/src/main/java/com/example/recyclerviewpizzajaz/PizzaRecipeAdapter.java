package com.example.recyclerviewpizzajaz;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PizzaRecipeAdapter extends RecyclerView.Adapter <PizzaRecipeAdapter.PizzaReciclerViewViewHolder>{
    private ArrayList<PizzaRecipe>arrayListPizza;

    @NonNull
    @Override
    public PizzaReciclerViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PizzaReciclerViewViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return arrayListPizza.size();
    }

    class PizzaReciclerViewViewHolder extends RecyclerView.ViewHolder{
private ImageView imageView;
private TextView textViewTitle;
private  TextView textViewDesc;
        public PizzaReciclerViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView);
            textViewTitle=itemView.findViewById(R.id.textViewTitle);
            textViewDesc=itemView.findViewById(R.id.textViewDesc);
        }
    }

    public PizzaRecipeAdapter(ArrayList<PizzaRecipe> arrayListPizza) {
        this.arrayListPizza = arrayListPizza;
    }

}
