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

/**/

class ImageAdapter (val _imageList : ArrayList<ImageObject>, val click : (ImageObject) -> Unit) : RecyclerView.Adapter<ImageAdapter.ImageHolder>() {

    // public ImageAdapter.MyViewHolder onCreateViewHolder

    class ImageHolder(_imageView: View, val onClick: (ImageObject) -> Unit) :
        RecyclerView.ViewHolder(_imageView) {
        val imageTextView = _imageView.findViewById<TextView>(R.id.textView)
        val imageimageView = _imageView.findViewById<ImageView>(R.id.imageView)
        var current: ImageObject? = null

        init {
            _imageView.setOnClickListener {
                current?.let { onClick(it) }
            }
        }


    fun bind(image: ImageObject) {
        current = image

        imageTextView.text = image.description

    }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageAdapter.ImageHolder {
        TODO("Not yet implemented")

        val inflater : View = LayoutInflater.from(parent?.context).inflate(R.layout.recycler_layout)
        return ImageHolder(inflater)
    }

    override fun onBindViewHolder(holder: ImageAdapter.ImageHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return _imageList.size
    }

    // val images = _images // image dataset
   // val inflater = LayoutInflater.from(_context)
    /*
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
    {
        val imageView = ImageView(parent.context)
                return ImageViewHolder(imageView)
            //.inflate(R.layout.recycler_layout, parent, false)

        return ViewHolder(imageView)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int)
    {
        // viewHolder.imageView = _images[position]
    }

    override fun getItemCount() = _images.size

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
    */


}
