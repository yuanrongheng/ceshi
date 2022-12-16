package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity3 : AppCompatActivity() {
    private lateinit var tu : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        tu=findViewById(R.id.tupian)
        Glide.with(this).load("https://qulian-prod.oss-cn-hangzhou.aliyuncs.com/room/bubble/kuaile2.png").into(tu);
    }
}