package day3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class StephenHawking {
<<<<<<< HEAD
	public static void main(String[] args) {
		String sentence;
		sentence = JOptionPane.showInputDialog("Write a sentence?");
		speak (sentence);
		for(int i=0;i<50;i++);
	}
=======

>>>>>>> origin/master
	// 1. make a main method and put steps 2, 3 & 4 inside it
	public static void main(String[] args) {

		// 2. ask the user for a sentence
		String sentence = JOptionPane.showInputDialog(" ARRG! GIVE ME A SENTENCE! NOW!");
		// 3. call the speak method below and send it the sentence
		for (int i = 0; i < 100; i++) {
			speak(sentence);
			// 4. repeat steps 2 and 3 a lot of times
		}
	}

	/* Don’t change this…. */
	static void speak(String words) {
		Voice voice = VoiceManager.getInstance().getVoice("kevin16");
		voice.allocate();
		voice.speak(words);
		voice.deallocate();
	}

}
