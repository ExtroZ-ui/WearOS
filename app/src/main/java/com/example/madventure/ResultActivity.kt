package com.example.madventure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
    }

    fun take_result(view: android.view.View) {
        Toast.makeText(this,"sucess",Toast.LENGTH_SHORT).show()
    }
}