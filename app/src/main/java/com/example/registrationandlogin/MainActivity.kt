package com.example.registrationandlogin


import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var emailInput:EditText
    lateinit var password:EditText
    lateinit var loginbtn : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        emailInput=findViewById(R.id.username_input)
        password=findViewById(R.id.password_input)
        loginbtn=findViewById(R.id.login_btn)

        loginbtn.setOnClickListener{
            val username = emailInput.text.toString()
             val password = password.text.toString()
            Log.i("Test Credentials", "Username: $username and Password: $password")

        }
    }
}