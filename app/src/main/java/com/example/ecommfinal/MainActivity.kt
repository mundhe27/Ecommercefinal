package com.example.ecommfinal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.ecommfinal.R.id.main_sign_up_button
import com.example.ecommfinal.R.id.main_login_button
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var main_email: EditText
    private lateinit var main_password: EditText
    private lateinit var main_login_button: Button
    private lateinit var main_sign_up_button: Button
    private lateinit var mAuth: FirebaseAuth



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mAuth = FirebaseAuth.getInstance()

        main_email = findViewById(R.id.main_email)
        main_password = findViewById(R.id.main_password)
        main_login_button = findViewById(R.id.main_login_button)
        main_sign_up_button = findViewById(R.id.main_sign_up_button)


        main_login_button.setOnClickListener {
            val email = main_email.text.toString()
            val password = main_password.text.toString()

            login(email,password);

        }



        var main_sign_up_button = findViewById<Button>(R.id.main_sign_up_button)
        main_sign_up_button.setOnClickListener {
            val intent = Intent(this, registerActivity2::class.java)
            startActivity(intent)
        }


    }
    private fun login(email: String, password: String){

        mAuth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {

                    val intent = Intent(this@MainActivity, registerActivity2::class.java)
                    startActivity(intent)


                }
                else {

                    Toast.makeText(this@MainActivity,"User does not exist", Toast.LENGTH_SHORT).show()

                }
            }


    }


}