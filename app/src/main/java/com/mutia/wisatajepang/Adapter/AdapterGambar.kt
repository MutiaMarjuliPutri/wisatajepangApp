package com.mutia.wisatajepang.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.mutia.wisatajepang.R


class AdapterGambar  (private val context: Context, private val images: Array<Int>,
                      private val judulnya: Array<String>, private val lokasinya: Array<String>
):
    BaseAdapter()
{
    override fun getCount(): Int {
        return images.size
        return judulnya.size
        return lokasinya.size
    }

    override fun getItem(position: Int): Any {
        return images[position]
        return judulnya[position]
        return lokasinya[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val imageView: ImageView
        val judul: TextView
        val loc: TextView

        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.itemberanda, parent, false)
            imageView = view.findViewById(R.id.imageView)
            judul = view.findViewById(R.id.JudulTempat)
            loc = view.findViewById(R.id.lokasi)
        } else {
            view = convertView
            imageView = view.findViewById(R.id.imageView)
            judul = view.findViewById(R.id.JudulTempat)
            loc = view.findViewById(R.id.lokasi)
        }
        imageView.setImageResource(images[position])
        judul.setText(judulnya[position])
        loc.setText(lokasinya[position])
        return view


    }

}
