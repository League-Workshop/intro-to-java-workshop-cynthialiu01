package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot turtle = new Robot();
	turtle.setSpeed(240000000);
	turtle.move(100);
	turtle.sparkle();
	turtle.turn(360);
	turtle.turn(-360);	
	turtle.turn(360);	
	turtle.hide();
	turtle.miniaturize();
	
	
	}
}
