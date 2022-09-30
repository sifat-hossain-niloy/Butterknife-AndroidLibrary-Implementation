package com.example.butterknife

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick

class MainActivity : AppCompatActivity() {



    @BindView(R.id.button1)
    lateinit var button1: Button
    @BindView(R.id.button2)
    lateinit var button2: Button
    @BindView(R.id.button3)
    lateinit var button3: Button
    @BindView(R.id.imageView)
    lateinit var imageView: ImageView
    @BindView(R.id.textView)
    lateinit var textView: TextView
    @BindView(R.id.checkBox)
    lateinit var checkBox: CheckBox

//    var imageView: ImageView

    @OnClick(R.id.imageView)
    fun imagePressed()
    {
        Toast.makeText(this,"Image Presses", Toast.LENGTH_LONG).show()
    }
    @OnClick(R.id.checkBox)
    fun checkBoxPressed()
    {
        textView.text = "You are Honest"
    }

//    @OnClick(R.id.button3)
//    fun button3Pressed() {
//        Toast.makeText(this, "Button 3 pressed", Toast.LENGTH_SHORT).show()
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)

        imageView.setOnClickListener{
            Toast.makeText(this, "Image Pressed",Toast.LENGTH_LONG).show()
        }

        button1.setOnClickListener {
            Toast.makeText(this, "Button 1 pressed", Toast.LENGTH_LONG).show()
        }
        button2.setOnClickListener {
            Toast.makeText(this, "Button 2 pressed", Toast.LENGTH_SHORT).show()
        }

        //In the above code, we left the implementation for button3 out. This is intentional, as we’ll be using the second option to implement it.



    }
}