package com.example.joystickapp.model

import java.io.DataOutputStream
import java.io.PrintWriter
import java.net.Socket

class FGPlayer {

    private lateinit var out: PrintWriter

    fun connect(_ip: String?, _port: String?) {
        System.out.println(_ip)
        System.out.println(_port)

        val ip: String = _ip!!
        val port: String = _port!!

        System.out.println("1")
        val fg = Socket(ip, port.toInt())
        System.out.println("Connected to ip  $ip port $port")
        out = PrintWriter(fg.getOutputStream(), true)
        System.out.println("3")

    }

    fun setAileron(double: Double) {
        val thread = Thread {
            try {

                out.print("set /controls/flight/aileron ${double}\r\n")
                out.flush()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        thread.start()

    }

    fun setElevator(double: Double) {
        val thread = Thread {
            try {
                out.print("set /controls/flight/elevator ${double}\r\n")
//                System.out.print("set /controls/flight/elevator ${double}\r\n")
                out.flush()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        thread.start()

    }

    fun setRudder(double: Double) {
        val thread = Thread {
            try {
                out.print("set /controls/flight/rudder ${double}\r\n")
                out.flush()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        thread.start()


    }

    fun setThrottle(double: Double) {

        val thread = Thread {
            try {
                out.print("set /controls/engines/current-engine/throttle $double\r\n")
//                System.out.print("set /controls/engines/current-engine/throttle $double\r\n")
                out.flush()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        thread.start()

    }

}