package com.example.massive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class userForgotPassword : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_forgot_password)

        var Klik: Button = findViewById(R.id.Btnsubmit)
        Klik.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.Btnsubmit -> {
                var Pencet = Intent(this@userForgotPassword, userconfirmcode::class.java)
                startActivity(Pencet)
            }
        }
    }
}