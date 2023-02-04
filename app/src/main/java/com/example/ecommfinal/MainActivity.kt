package com.example.ecommfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.ecommfinal.R.id.join_now_button
import com.example.ecommfinal.R.id.login_button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var login_button = findViewById<Button>(R.id.login_button)
        login_button.setOnClickListener {
            val intent = Intent(this, loginActivity2::class.java)
            startActivity(intent)
        }

        var join_now_button = findViewById<Button>(R.id.join_now_button)
        join_now_button.setOnClickListener {
            val intent = Intent(this, registerActivity2::class.java)
            startActivity(intent)
        }
    }


}