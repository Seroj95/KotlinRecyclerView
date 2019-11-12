package com.example.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyCostumeAdapter extends BaseAdapter {
    public ArrayList<AdapterItems> listnewsDataAdapter;

    public MyCostumeAdapter(ArrayList<AdapterItems> listnewsDataAdapter) {
        this.listnewsDataAdapter = listnewsDataAdapter;
    }

    @Override
    public int getCount() {
        return listnewsDataAdapter.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//
//       LayoutInflater minflater=getLayoutInflater();
//       View myView=minflater.inflate(R.layout.layout_tikcet,null);
//       final AdapterItems s=listnewsDataAdapter.get(position);
//        TextView textJobTitle=myView.findViewById(R.id.textView2);
//        textJobTitle.setText(s.getJobTitle());
//        return myView;
        return null;
    }
}
