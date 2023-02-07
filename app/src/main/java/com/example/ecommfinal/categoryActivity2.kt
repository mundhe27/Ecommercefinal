package com.example.ecommfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.ListView
import android.widget.SearchView
import com.example.ecommfinal.databinding.ActivityAllshirts2Binding
import com.example.ecommfinal.databinding.ActivityCategory2Binding

class categoryActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityCategory2Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategory2Binding.inflate(layoutInflater)

        setContentView(binding.root)



        val user= arrayOf("Shirts","Dresses","Sweaters","Glasses","Bags","Shoes","Headsets","Watches","Mobile")
        val userAdapter: ArrayAdapter<String> = ArrayAdapter(
            this,android.R.layout.simple_list_item_1,
            user
        )

        binding.listView.adapter=userAdapter;


        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(p0: String?): Boolean {
                binding.searchView.clearFocus()
                if (user.contains(p0)){
                    userAdapter.filter.filter(p0)
                }
                return false

            }

            override fun onQueryTextChange(p0: String?): Boolean {

               userAdapter.filter.filter(p0)
                return false
            }

        })


        var t_shirt = findViewById<ImageButton>(R.id.t_shirt)
        t_shirt.setOnClickListener {
            val intent = Intent(this, allshirtsActivity2::class.java)
            startActivity(intent)
        }


    }
}