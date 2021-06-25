package com.example.joystickapp.view

import android.os.Bundle
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.joystickapp.R
import com.example.joystickapp.databinding.ActivityMainBinding
import com.example.joystickapp.viewModel.MainViewModel
import com.jackandphantom.joystickview.JoyStickView
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewmodel = MainViewModel()

        val joyStickView = binding.joyStick
        joyStickView.setOnMoveListener(object : JoyStickView.OnMoveListener {
            override fun onMove(angle: Double, strength: Float) {
                val x = cos(angle * PI / 180) * strength / 100
                val y = sin(angle * PI / 180) * strength / 100


                binding.viewmodel?.VM_setAileron(x)
                binding.viewmodel?.VM_setElevator(y)

            }
        })
        val seekBarVertical = binding.vertical
        seekBarVertical.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                val x: Double = (seekBarVertical.progress).toDouble() / 100
                System.out.println(x)
                binding.viewmodel?.VM_setThrottle(x)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
//                System.out.println("working2")
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                System.out.println("working3")
            }


        })
        val seekBarRudder = binding.horizontal
        seekBarRudder.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                val x: Double = ((seekBarRudder.progress).toDouble() / 50) - 1
                System.out.println(x)
                binding.viewmodel?.VM_setRudder(x)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
//                System.out.println("working2")
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
//                System.out.println("working3")
            }
        })


    }
}