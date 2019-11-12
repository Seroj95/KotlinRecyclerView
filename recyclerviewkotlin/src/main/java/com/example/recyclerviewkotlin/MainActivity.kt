package com.example.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView=findViewById(R.id.recivlerView)as RecyclerView
        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        val user=ArrayList<User>()
        user.add(User("Poxos","Pssfsf"))
        user.add(User("Poxos","Pssfsf"))
        user.add(User("Poxos","Pssfsf"))
        val adapter=CustyomAdapter(user)
        recyclerView.adapter=adapter
    }
}
