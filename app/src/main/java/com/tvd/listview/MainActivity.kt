package com.tvd.listview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.intellij.lang.annotations.Language

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val language: Array<String> = resources.getStringArray(R.array.technology_list)
        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,language)

        listview.adapter = arrayAdapter
        listview.onItemClickListener = AdapterView.OnItemClickListener{adapterView, view, position, id ->
            val selectedItem = adapterView.getItemAtPosition(position) as String
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(applicationContext, "clicked item $selectedItem and position $itemIdAtPos", Toast.LENGTH_SHORT).show()
        }
    }
}
