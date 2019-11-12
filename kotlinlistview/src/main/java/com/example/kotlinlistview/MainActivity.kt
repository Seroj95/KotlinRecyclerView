package com.example.kotlinlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cloub= listOf("Chelsia","Liverpool","Arsenal","City","United")

        lvCloubs.adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,cloub)
        lvCloubs.setOnItemClickListener(AdapterView.OnItemClickListener { parent, view, position, id ->

            Toast.makeText(this,cloub[position],Toast.LENGTH_SHORT).show()

        })

    }
}
