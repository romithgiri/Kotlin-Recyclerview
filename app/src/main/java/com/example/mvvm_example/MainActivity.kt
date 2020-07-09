package com.example.mvvm_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val userDefineNumberList: ArrayList<String> = ArrayList()
    private lateinit var layoutManager: RecyclerView.LayoutManager
    private var i: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in 1..20){
            userDefineNumberList.add(i.toString())
        }

        layoutManager = LinearLayoutManager(this)
        numberRecyclerView.layoutManager = layoutManager
        numberRecyclerView.adapter = NumberAdapter(this, userDefineNumberList)

    }
}