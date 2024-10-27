package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter() : RecyclerView.Adapter<MyViewHolder>() {
    val rectangles = ArrayList<Int>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false))
    }

    override fun getItemCount(): Int {
        return rectangles.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(rectangles[position])
    }

    fun add(item: Int) {
        rectangles.add(item)
        notifyDataSetChanged()
    }
}