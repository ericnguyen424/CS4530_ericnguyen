/**
 * Eric Nguyen, u1380461, Fall 2025
 * This file contains the code that runs Activity 2 as specified in the assignment
 */
package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.assignment1.databinding.ActivityMain2Binding


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val args = intent.extras!!
        binding.buttonTextView.text = args.getString("button_text")

        binding.returnButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}