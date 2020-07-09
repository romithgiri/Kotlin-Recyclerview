package com.example.mvvm_example

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list.view.*

class NumberAdapter(
    private val context: MainActivity,
    private val userDefineNumberList: ArrayList<String>
) :
RecyclerView.Adapter<NumberAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_list, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return userDefineNumberList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.chapterName?.text = userDefineNumberList.get(position)
        holder.itemView.setOnClickListener {
            Toast.makeText(context, userDefineNumberList.get(position), Toast.LENGTH_LONG).show()
        }
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val chapterName = view.tvChapterName
    }
}
