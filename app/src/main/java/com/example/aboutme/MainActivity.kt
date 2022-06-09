package com.example.aboutme

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
private lateinit var btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.button)
        btn.setOnClickListener{
            addNickName(it)
        }
    }
    private fun addNickName(view :View){

        val nick_name = findViewById<EditText>(R.id.nickname)
        val add_Nickname = findViewById<TextView>(R.id.Nickname_Show)
        if(nick_name.text.isEmpty() ){

            Toast.makeText(this,"Nickname not entered",Toast.LENGTH_SHORT).show();
        }
        else {
            add_Nickname.text = nick_name.text;
            nick_name.visibility = View.GONE;
            view.visibility = View.GONE
            add_Nickname.visibility = View.VISIBLE
        }


    }
}