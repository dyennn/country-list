package com.example.countrylist

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countryList = listOf(
            "Chine", "India", "United States", "Indonesia", "Pakistan",
            "Brazil", "Nigeria", "Bangladesh", "Russia", "Mexico",
            "Japan", "Ethiopia", "Philippines", "Egypt", "Vietnam",
            "DR Congo", "Turkey", "Iran", "Germany", "Thailand"
        )

        // Find the ListView
        val listView: ListView = findViewById(R.id.countryListView)

        // Create an ArrayAdapter
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            countryList
        )

        // Set the adapter to the ListView
        listView.adapter = adapter
    }
}