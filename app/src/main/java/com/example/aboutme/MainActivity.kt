package com.example.aboutme

import android.content.Context
import android.hardware.input.InputManager
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
private lateinit var btn : Button
private lateinit var binding:ActivityMainBinding
private val mynameObj : MYName = MYName("About Me","Dee")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.myNameinla = mynameObj
        binding.button.setOnClickListener { addNickName(it) }

    }
    private fun addNickName(view :View){

        if(binding.nickname.text.isEmpty()){

            Toast.makeText(this,"Nickname not entered",Toast.LENGTH_SHORT).show();
        }
        else {
            binding.apply {
              myNameinla?.Nickname = binding.nickname.text.toString()
                nickname.visibility = View.GONE
                view.visibility = View.GONE
                NicknameShow.visibility  = View.VISIBLE
            }
        }
        val hidkeyb = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        hidkeyb.hideSoftInputFromWindow(view.windowToken,0)


    }
}