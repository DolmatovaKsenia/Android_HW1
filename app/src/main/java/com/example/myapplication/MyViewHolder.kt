package com.example.myapplication

import android.graphics.Color
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val text_in_rec = view.findViewById<TextView>(R.id.rec_text)
    val image = view.findViewById<ImageView>(R.id.image_rectangle)

    fun bind(number: Int) {
        text_in_rec.text = number.toString()
        if (number % 2 == 0) {
            image.setBackgroundColor(Color.RED)
        } else {
            image.setBackgroundColor(Color.BLUE)
        }
    }
}