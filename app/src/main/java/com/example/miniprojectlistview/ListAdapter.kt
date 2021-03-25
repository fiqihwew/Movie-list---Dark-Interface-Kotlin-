package com.example.miniprojectlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class ListAdapter(private val context: Context, var image: Array<Int>, var name: Array<String>): BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.list_item, null, true)

        view.findViewById<ImageView>(R.id.img).setImageResource(image[position])
        view.findViewById<TextView>(R.id.name).text = name[position]

        return view
    }

    override fun getItem(position: Int): Any {
        return position
    }

    /** atau bisa di bikin single expresion fuction seperti ini
    override fun getItem(position: Int): Any = position */


    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return image.size
    }
}