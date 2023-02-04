package com.example.ecommfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class categoryActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category2)
        var t_shirt = findViewById<ImageButton>(R.id.t_shirt)
        t_shirt.setOnClickListener {
            val intent = Intent(this, allshirtsActivity2::class.java)
            startActivity(intent)
        }
    }
}