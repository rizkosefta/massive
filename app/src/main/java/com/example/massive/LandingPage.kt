package com.example.massive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LandingPage : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page)

        val btncontinue: Button =findViewById(R.id.btn_continue)
        btncontinue.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id){
        R.id.btn_continue -> {
            val intent = Intent(this@LandingPage, LoginSebagai::class.java)
            startActivity(intent)
        }
        }
    }
}