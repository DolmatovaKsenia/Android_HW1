package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var button: FloatingActionButton

    private val adapter = MyAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycler_view)
        button = findViewById(R.id.add_button)

        recyclerView.adapter = adapter

        button.setOnClickListener {
            adapter.add(adapter.itemCount + 1)
        }

        if (savedInstanceState != null) {
            val n = savedInstanceState.getInt("sizer")
            for (elem in 1 .. n) {
                adapter.add(elem)
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("sizer", adapter.itemCount)
    }
}