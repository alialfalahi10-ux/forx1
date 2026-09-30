package com.example.forexbot

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(32, 40, 32, 32)
            gravity = Gravity.TOP
        }

        val title = TextView(this).apply {
            text = "بوت الفوركس"
            textSize = 28f
            setTextColor(Color.BLACK)
            gravity = Gravity.CENTER
        }

        val pair = TextView(this).apply {
            text = "EUR/USD"
            textSize = 22f
            gravity = Gravity.CENTER
            setPadding(0, 30, 0, 20)
        }

        val status = TextView(this).apply {
            text = "الحالة: تجريبي — لا توجد صفقات حقيقية"
            textSize = 17f
            gravity = Gravity.CENTER
            setPadding(0, 10, 0, 30)
        }

        val button = Button(this).apply {
            text = "بدء التحليل"

            setOnClickListener {
                status.text = "الحالة: يتم تحليل EUR/USD (تجريبي)"
            }
        }

        val note = TextView(this).apply {
            text = "هذا إصدار تجريبي. لا يتم تنفيذ صفقات حقيقية."
            textSize = 15f
            setPadding(0, 35, 0, 0)
        }

        root.addView(title)
        root.addView(pair)
        root.addView(status)
        root.addView(button)
        root.addView(note)

        setContentView(root)
    }
}
