package section3;

import javax.swing.JOptionPane;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		String answer = JOptionPane.showInputDialog("I ____ Frogs + Turtles?");
		
		for(int i=0; i<10; i++) {
		JOptionPane.showMessageDialog(null, "You " + answer + " turtles and frogs");
		}
	}
}
