package com.example.vera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.io.InputStream

class SpravkaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spravka)

        val fileName2 = intent.getStringExtra("file_name_")
        val inputStream2: InputStream = assets.open(fileName2.toString())
        val text2 = inputStream2.bufferedReader().use{it.readText()}
        val textView2: TextView = findViewById(R.id.spravka)
        textView2.text = text2
    }

}