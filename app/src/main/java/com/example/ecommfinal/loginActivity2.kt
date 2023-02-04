package com.example.ecommfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class loginActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

        var final_login_button = findViewById<Button>(R.id.final_login_button)
        final_login_button.setOnClickListener {
            val intent = Intent(this, categoryActivity2::class.java)
            startActivity(intent)

        }

    }
}