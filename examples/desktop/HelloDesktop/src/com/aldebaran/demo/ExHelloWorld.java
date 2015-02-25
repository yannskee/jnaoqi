package com.aldebaran.demo;

import com.aldebaran.qimessaging.*;
import com.aldebaran.qimessaging.helpers.al.ALTextToSpeech;

import java.util.concurrent.TimeUnit;

/**
 * Created by epinault on 11/05/2014.
 */
public class ExHelloWorld {


    public static void main(String[] args) {
        Session session = new Session();
        try {
	        session.connect("tcp://"+RobotIP.ip+":"+RobotIP.port).get(3, TimeUnit.SECONDS);

	        ALTextToSpeech tts = new ALTextToSpeech(session);
	        Boolean pong = tts.ping();
	        if(pong)
                tts.say("Hello World");
	        else
		        System.out.println("Can't find ALTextToSpeech module");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}