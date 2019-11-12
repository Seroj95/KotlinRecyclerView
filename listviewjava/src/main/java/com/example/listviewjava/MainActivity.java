package com.example.listviewjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
ArrayList<String > posts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        posts=new ArrayList<>();

            posts.add("Chelsia ");
            posts.add("Liverpool ");
            posts.add("Arsenal ");
            posts.add("City ");
            posts.add("United ");

        ArrayAdapter<String>arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,posts);
listView.setAdapter(arrayAdapter);
listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Toast.makeText(MainActivity.this, "Cloub"+position +" - " + posts.get(position), Toast.LENGTH_SHORT).show();
    }
});
    }
}
