package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import org.w3c.dom.Text

class MainActivity2 : AppCompatActivity() {
    private lateinit var t: Text
    private lateinit var bb:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        bb=findViewById(R.id.bbbb)
        bb.setOnClickListener {
            val intent =Intent(this@MainActivity2,MainActivity::class.java);
            startActivity(intent)
        }
    }
}