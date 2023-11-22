package com.example.massive

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.PopupWindow


class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        val btncreat: Button = findViewById(R.id.btncreat)
        btncreat.setOnClickListener{
            val window = PopupWindow(this)
            val button = layoutInflater.inflate(R.layout.layout_popup,null)
            window.contentView= View
            val button
        }
    }

//    override fun onClick(v: View) {
//        when (v.id){
//            R.id.btncreat -> {
//                val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
//                startActivity(intent)
//            }
//        }
//    }
}