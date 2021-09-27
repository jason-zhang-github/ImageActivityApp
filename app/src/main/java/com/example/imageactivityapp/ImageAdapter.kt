package com.example.imageactivityapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class ImageAdapter(val _context: Context, val _images : Array<ImageObject>) : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{
    val images = _images // image dataset
    val inflater = LayoutInflater.from(_context)

    override fun getItemCount(): Int
    {
        return images.size
    }

    fun getItem(position : Int) : Any
    {
        return images.get(position)
    }

    override fun getItemId(position: Int) : Long
    {
        return position.toLong()
    }


    fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View
    {
        var layout : View

        layout = convertView

        if (convertView is ConstraintLayout)
        {
            layout = convertView
        }

        else
        {
            layout = inflater.inflate(R.layout.activity_main, null)
        }

        val description = layout.findViewById<TextView>(R.id.textView)
        val imageView = layout.findViewById<ImageView>(R.id.imageView)

        imageView.setImageResource(images[position].resourceID)
        description.text = images[position].description

        return layout
    }





}

/* Doesn't inherit from RecyclerView.Adapter
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
*/