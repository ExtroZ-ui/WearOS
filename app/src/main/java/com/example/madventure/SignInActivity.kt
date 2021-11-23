package com.example.madventure

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.EditText
import java.util.regex.Pattern

class SignInActivity : Activity() {
    lateinit var email:EditText
    lateinit var passwrd:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        email = findViewById(R.id.email)
        passwrd = findViewById(R.id.password)
    }

    fun signin(view: android.view.View){
        if (email.text.isNotEmpty() && passwrd.text.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email.text).matches()){
            startActivity(Intent(this@SignInActivity,ResultActivity::class.java))
        }
    }
}