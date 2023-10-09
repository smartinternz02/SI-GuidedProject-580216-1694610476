package com.example.login_page

import android.widget.Button
import android.widget.EditText
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usernameEditText = findViewById<EditText>(R.id.usernameEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (username == "your_username" && password == "your_password") {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                // Display an error message if login fails.

            }
        }
    }
}