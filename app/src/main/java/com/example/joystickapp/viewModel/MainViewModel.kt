package com.example.joystickapp.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.joystickapp.model.FGPlayer


class MainViewModel : ViewModel() {

    var aileron: Double = 0.0
    var elevator: Double = 0.0
    var rudder: Double = 0.0
    var throttle: Double = 0.0


    val ip = MutableLiveData<String>()
    val port = MutableLiveData<String>()

    private val fg = FGPlayer()


    val editTextContentPort: MutableLiveData<String> = MutableLiveData<String>()

    fun onConnect() {
        val thread = Thread {
            fg.connect(ip.value, port.value )
        }
        thread.start()
    }

    fun VM_setAileron(double: Double) {
        aileron = double
        fg.setAileron(double)
    }
    fun VM_setElevator(double: Double) {
        elevator = double
        fg.setElevator(double)
    }
    fun VM_setRudder(double: Double) {
        rudder = double
        fg.setRudder(double)
    }
    fun VM_setThrottle(double: Double) {
        throttle = double
        fg.setThrottle(double)
    }

}
