//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _02_methods._1_animal_farm;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {
	
	public static void main(String[] args) {
			
		/* 1. Ask the user which animal they want, then play the sound of that animal. */			 
			for (int i = 0; i < 1000; i++) {
				String animal = JOptionPane.showInputDialog("Do you want to hear the sound of \n a llama, a cat, a duck, a dog, or a cow? \n Answer with one word. No spaces"); 
		/* 2. Make it so that the user can keep entering new animals. */
				if (animal.equalsIgnoreCase("llama")) {
					playNoise(llamaFile); 
				}
				else if (animal.equalsIgnoreCase("cat")) {
					playNoise(meowFile);
				}
				else if (animal.equalsIgnoreCase("duck") ) {
					playNoise(quackFile); 
				}
				else if (animal.equalsIgnoreCase("dog")) {
					playNoise(woofFile);
				}
				else {
					playNoise(mooFile); 
				}
			}
	}

	static void playMoo() {
		playNoise(mooFile);
	}

	static void playQuack() {
		playNoise(quackFile);
	}

	static void playWoof() {
		playNoise(woofFile);
	}
	
	static void playMeow() {
		playNoise(meowFile);
	}
	
	static void playLlama() {
		playNoise(llamaFile);
	}

	static String quackFile = "quack.wav";
	static String mooFile = "moo.wav";
	static String woofFile = "woof.wav";
	static String meowFile = "meow.wav";
	static String llamaFile = "llama.wav";

	/* Ignore this stuff */
	
	public static void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(AnimalFarm.class.getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}