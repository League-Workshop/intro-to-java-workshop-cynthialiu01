package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("Spell mandlebrot.");
		// 2. Catch the user's answer in a String
		String spelling = JOptionPane.showInputDialog("");
		// 3. If the user spelled the word correctly, speak "correct"
		if(spelling.equalsIgnoreCase("mandlebrot")){
		speak("correct");
		speak("Spell tchotchke.");
		// 2. Catch the user's answer in a String
		String word = JOptionPane.showInputDialog("");
		// 3. If the user spelled the word correctly, speak "correct"
		if(word.equalsIgnoreCase("tchotchke")){
		speak("correct");
		speak("Spell pneumonoultramicroscopicsilicovolcanoconiosis.");
		// 2. Catch the user's answer in a String
		String Ω = JOptionPane.showInputDialog("");
		// 3. If the user spelled the word correctly, speak "correct"
		if(Ω.equalsIgnoreCase("pneumonoultramicroscopicsilicovolcanoconiosis")){
		speak("correct");
		speak("Spell  Otorhinolaryngologist");
		// 2. Catch the user's answer in a String
		String ribbit = JOptionPane.showInputDialog("");
		// 3. If the user spelled the word correctly, speak "correct"
		if(ribbit.equalsIgnoreCase(" Otorhinolaryngologist")){
		speak("correct");
		}else {
			speak("you lose");}

		}else {
			speak("you lose");}
		}else {
			speak("You lose");}
		
		}else {
			speak("You lose");
		}
		
		
		
		
		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words
		
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


