package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"

		
		// 4. Otherwise say "wrong"

		String word = ""; 
		
		// 5. repeat the process for other words
		for(int i = 0; i<2; i++) {
			
			if(i == 0) {
				word ="mandlebrot";
			}
			else if(i == 1) {
				word ="hat";
			}
			speak(" Spell the " + word);
			
			// 2. Catch the user's answer in a String

			String answer = JOptionPane.showInputDialog(" tye your answer" );
			
			// 3. If the user spelled the word correctly, speak "correct"
			if(answer.contentEquals("mandlebrot")) {
				speak("correct");
			}
			else
			{
				speak("wrong");
			}
			
			
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


