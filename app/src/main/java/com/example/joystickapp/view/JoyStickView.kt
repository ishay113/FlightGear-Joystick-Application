package com.example.joystickapp.view

import android.content.Context
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Point
import android.graphics.PointF
import android.util.AttributeSet
import android.view.View

class JoyStickView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    private val paint = Paint().apply{
        style = Paint.Style.STROKE
        color = Color.parseColor("#FFC107")
        isAntiAlias = true
    }
    private var radius: Float = 0f
    private var center: PointF = PointF()
}