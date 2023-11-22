package com.example.massive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LoginSebagai : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_sebagai)

        val btnuser: Button = findViewById(R.id.Btnuser)
        btnuser.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.Btnuser -> {
                val intent = Intent(this@LoginSebagai, LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }
}