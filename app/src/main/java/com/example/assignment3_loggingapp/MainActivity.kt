package com.example.assignment3_loggingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textStatus: TextView
    private lateinit var helloButton : Button
    private lateinit var textHello : TextView
    private lateinit var textEditHello : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        helloButton = findViewById<Button>(R.id.helloButton)
        textStatus = findViewById(R.id.textStatus)
        textHello = findViewById(R.id.textHello)
        textEditHello = findViewById(R.id.editTextHello)
        textStatus.append(getString(R.string.create) + "\n")
        helloButton.setOnClickListener{
            textEditHello.setText(getText(R.string.hello))
            textHello.text = getString(R.string.hello)
        }
    }

    override fun onStart() {
        super.onStart()
        textStatus.append(getString(R.string.start) + "\n")
    }

    override fun onResume() {
        super.onResume()
        textStatus.append(getString(R.string.resume) + "\n")
    }

    override fun onPause() {
        super.onPause()
        textStatus.append(getString(R.string.pause) + "\n")
    }

    override fun onStop() {
        super.onStop()
        textStatus.append(getString(R.string.stop) + "\n")
    }

    override fun onDestroy() {
        super.onDestroy()
        textStatus.append(getString(R.string.destroy) + "\n")
    }
}