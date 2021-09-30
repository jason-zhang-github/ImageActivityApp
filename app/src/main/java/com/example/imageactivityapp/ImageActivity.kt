package com.example.imageactivityapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.content.Context
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.GridLayoutManager

/* */
class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.recyclerView) // initialize the recyclerview
        // Set recyclerview's layout manager to a GridlayoutManager with 2 columns (?)
        recycler.layoutManager = GridLayoutManager(this, 2, RecyclerView.VERTICAL, false)

        // Initialize the TextView and the ImageView

        recycler.adapter = ImageAdapter(getData())

    }

    fun getData(): List<ImageObject> // return method that creates ImageObject Array to be displayed
    {

        val imageArray : MutableList<ImageObject> = ArrayList<ImageObject>()


        imageArray.add(ImageObject("Jordan 1", R.drawable.jordan_1))
        imageArray.add(ImageObject("Jordan 2", R.drawable.jordan_2))
        imageArray.add(ImageObject("Jordan 3", R.drawable.jordan_3))
        imageArray.add(ImageObject("Jordan 4", R.drawable.jordan_4))
        imageArray.add(ImageObject("Jordan 5", R.drawable.jordan_5))
        imageArray.add(ImageObject("Jordan 6", R.drawable.jordan_6))
        imageArray.add(ImageObject("Jordan 7", R.drawable.jordan_7))
        imageArray.add(ImageObject("Jordan 7", R.drawable.jordan_7))
        imageArray.add(ImageObject("Jordan 8", R.drawable.jordan_8))
        imageArray.add(ImageObject("Jordan 9", R.drawable.jordan_9))
        imageArray.add(ImageObject("Jordan 10", R.drawable.jordan_10))

        return imageArray
    }
}

