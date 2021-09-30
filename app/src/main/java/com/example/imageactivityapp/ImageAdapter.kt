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

class ImageAdapter (val _imageList : List<ImageObject>) : RecyclerView.Adapter<ImageAdapter.ImageHolder>()
{
    // var images = _imageList

    class ImageHolder(_imageView: View, /*onClick: (ImageObject) -> Unit*/) :
        RecyclerView.ViewHolder(_imageView)
    {
        var imageVal: ImageView

        init {
            imageVal = _imageView.findViewById(R.id.image)

                /* _imageView.setOnClickListener {
                current?.let { onClick(it) } */
            }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageAdapter.ImageHolder
    {
        val inflater : View = LayoutInflater.from(parent.context).inflate(R.layout.image_recycler, parent, false)
        return ImageHolder(inflater)
    }

    override fun onBindViewHolder(holder: ImageAdapter.ImageHolder, position: Int)
    {
        var imageInstance = _imageList[position]

        holder.imageVal.setImageResource(imageInstance.resourceID)
    }

    override fun getItemCount(): Int {
        return _imageList.size
    }


}
