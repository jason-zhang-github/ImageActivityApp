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

class ImageAdapterval (val _imageList : ArrayList<ImageObject>, val click : (ImageObject) -> Unit) : RecyclerView.Adapter<ImageAdapter.ImageHolder>()
{

    // public ImageAdapter.MyViewHolder onCreateViewHolder

    /* override fun ImageAdapter.MyViewHolder onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
        val itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_layout, parent, false)
        MyViewHolder holder = new MyViewHolder(itemView)
        return holder
    } */

    class ImageViewHolder(_imageView: View) : RecyclerView.ViewHolder(_imageView)
    {
        fun bind(imageOb : ImageObject, clickListener : (ImageObject) -> Unit)
        {
            _imageView.tv_part_item_name.text = imageOb.itemName
            _imageView.tv_part_id.text = imageOb.Id.toString()
            _imageView.setOnClickListener { clickListener(imageOb)}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageAdapter.ImageHolder {
        TODO("Not yet implemented")
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
