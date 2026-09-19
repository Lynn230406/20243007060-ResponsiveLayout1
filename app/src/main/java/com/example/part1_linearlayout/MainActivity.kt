package com.example.part1_linearlayout

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnChange: Button
    private lateinit var btnCancel: Button
    private lateinit var tvBlackText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_constraint)

        btnChange = findViewById<Button>(R.id.btn_change)
        btnCancel = findViewById<Button>(R.id.btn_cancel)
        tvBlackText = findViewById<TextView>(R.id.tv_black_text)


        btnChange.setOnClickListener {
            tvBlackText.text = "Text Changed!"
            tvBlackText.setTextColor(android.graphics.Color.GREEN)
        }

        // ========== 新增：Cancel按钮点击监听 ==========
        btnCancel.setOnClickListener {
            tvBlackText.text = "Android Application"
            tvBlackText.setTextColor(android.graphics.Color.WHITE)
        }
        }
    }