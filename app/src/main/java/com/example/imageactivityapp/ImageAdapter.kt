package com.example.imageactivityapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class ImageAdapter (val _context : Context, _imageObjects: Array<ImageObject>): BaseAdapter()
{
    val imageObjects = _imageObjects // array for image data (ID and description)
    val inflater = LayoutInflater.from(_context) // Instantiates layout XML into its views

    override fun getCount(): Int
    {
        return imageObjects.size
    }

    override fun getItem(position : Int) : Any
    {
        // return imageObjects.get(position)
        return imageObjects[position]
    }





}