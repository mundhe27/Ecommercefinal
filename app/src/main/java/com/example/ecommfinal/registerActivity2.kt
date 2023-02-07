package com.example.ecommfinal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthWeakPasswordException

class registerActivity2 : AppCompatActivity() {

    private lateinit var register_username_input: EditText
    private lateinit var register_email: EditText
    private lateinit var main_password: EditText
    private lateinit var register_sign_up_button: Button
    private lateinit var mAuth: FirebaseAuth

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register2)

        register_username_input = findViewById(R.id.register_username_input)
        register_email = findViewById(R.id.register_email)
        main_password = findViewById(R.id.main_password)
        register_sign_up_button = findViewById(R.id.register_sign_up_button)

        register_sign_up_button.setOnClickListener {
            val email = register_email.text.toString()
            val password = main_password.text.toString()

            login(email,password)

        }


        var register_sign_up_button = findViewById<Button>(R.id.register_sign_up_button)
        register_sign_up_button.setOnClickListener {
            val intent = Intent(this, categoryActivity2::class.java)
            startActivity(intent)
        }
    }

    private fun login(email: String,password: String){

        mAuth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {

                    val intent = Intent(this@registerActivity2, categoryActivity2::class.java)
                    startActivity(intent)


                } else {

                    Toast.makeText(this@registerActivity2," Some error occured", Toast.LENGTH_SHORT).show()

                }
            }

    }
}