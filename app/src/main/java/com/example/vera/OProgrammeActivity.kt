package com.example.vera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.io.InputStream

class OProgrammeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oprogramme)

        val fileName2 = intent.getStringExtra("file_name")
        val inputStream2: InputStream = assets.open(fileName2.toString())
        val text2 = inputStream2.bufferedReader().use{it.readText()}
        val textView2: TextView = findViewById(R.id.oprogramme)
        textView2.text = text2
    }

}