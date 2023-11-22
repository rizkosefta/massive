package com.example.massive

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnregisteruser: Button = findViewById(R.id.btnregisteruser)
        btnregisteruser.setOnClickListener(this)
        val Btnforgotuser: Button = findViewById(R.id.btnforgotuser)
        Btnforgotuser.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.btnregisteruser -> {
                val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
                startActivity(intent)
            }
        }
        when (v.id){
            R.id.btnforgotuser -> {
                val intent = Intent(this@LoginActivity, userForgotPassword::class.java)
                startActivity(intent)
            }
        }
    }

}