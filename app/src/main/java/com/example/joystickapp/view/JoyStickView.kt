package com.example.joystickapp.view

import android.content.Context
import android.util.AttributeSet
import com.jackandphantom.joystickview.JoyStickView
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

class JoystickView(context: Context, attrs: AttributeSet?, defStyleAttr: Int) :
    JoyStickView(context, attrs, defStyleAttr) {

    override fun onMove(angle: Double, strength: Float) {
        val x = cos(angle * PI / 180) * strength / 100
        val y = sin(angle * PI / 180) * strength / 100

    }

}