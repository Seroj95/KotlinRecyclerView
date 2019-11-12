package com.example.recyclerviewjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<RecyclerViewItems>recyclerViewItems;
private RecyclerView recyclerView;
private RecyclerView.Adapter adapter;
private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
recyclerViewItems=new ArrayList<>();
recyclerViewItems.add(new RecyclerViewItems(R.drawable.ic_android_black_24dp,Utils.TEXT_VIEW_1,Utils.TEXT_VIEW_2));
recyclerViewItems.add(new RecyclerViewItems(R.drawable.ic_android_black_24dp,Utils.TEXT_VIEW_1,Utils.TEXT_VIEW_2));
recyclerViewItems.add(new RecyclerViewItems(R.drawable.ic_android_black_24dp,Utils.TEXT_VIEW_1,Utils.TEXT_VIEW_2));
recyclerViewItems.add(new RecyclerViewItems(R.drawable.ic_android_black_24dp,Utils.TEXT_VIEW_1,Utils.TEXT_VIEW_2));
recyclerViewItems.add(new RecyclerViewItems(R.drawable.ic_android_black_24dp,Utils.TEXT_VIEW_1,Utils.TEXT_VIEW_2));
recyclerView=findViewById(R.id.recyclerView);
recyclerView.setHasFixedSize(true);
adapter=new RecyclerViewAdapter(recyclerViewItems);
layoutManager= new LinearLayoutManager(this);
recyclerView.setAdapter(adapter);
recyclerView.setLayoutManager(layoutManager);
    }
}
