/**
 * Eric Nguyen, u1380461, Fall 2025
 * This file contains Activity 1 which handles the interaction of the 5 buttons
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
import com.example.assignment1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val binding = ActivityMainBinding.inflate(layoutInflater)
        val buttons = listOf(binding.button1, binding.button2, binding.button3, binding.button4, binding.button5)
        for (button in buttons) {

            // Add event listener to every button
            button.setOnClickListener {
                val intent = Intent(this, SecondActivity::class.java)
                val argsBundle = Bundle()
                argsBundle.putString("button_text", "${button.text}")
                intent.putExtras(argsBundle)
                startActivity(intent)
            }
        }

        setContentView(binding.root)
    }
}