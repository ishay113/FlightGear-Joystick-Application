# FLIGHT SIMULATOR - Joystick Androaid App
Advanced Programing 2 - assignment 3 - remote contorller for flight simulator.
On this assignment we created an androaid app that manipulate and control a flight in the FligtGear simulator. We implemented the app using Kotlin.

## Presentation Video
In this video, we explain our work and present the app we made. We also show an example of usage and a demo-flight using the FlightGear simulator. The video can be found [here](https://youtu.be/2CmC4FTG8PE).

## Installation and Running the App
- Download FlightGear simulator. Open the app -> go to setting page -> connect to your WiFi local IP adress
- FlightGear Configuration: ```telnet=socket,in,10.127.0.0.1,6400,tcp```
- Run the Androiad app directly from your AndroidStudio and fill the form
- Start the flight on your FlightGear simulator. 
- Click the 'Connect' button in order to connect the FlightGear Server. You can now control your flight using the Controller on your app.


## Features
Joystick - controls the steering wheel of the plane and its movement. Note that the usage of the airplane's wheel is tricky, and you probably want to try it a little before going up to the sky :)
Two Seekbars - one of them controls the acceleration of the plane, and the other controls the tail of the plane (and will help us to control the direction of the plane).
![photo5963246020013962887](https://user-images.githubusercontent.com/64550565/123527388-c83a8580-d6e7-11eb-9a4c-449118c634d4.jpg)



## App Architecture
The application is built according to the MVVM architecture (as required). The UML diagram is as following:
![umljpg](https://user-images.githubusercontent.com/64550565/123527349-4fd3c480-d6e7-11eb-92b2-70ed32570c98.jpg)

Enjoy your flight! :airplane:
