package section2;

import org.jointheleague.graphical.robot.Robot;

public class FlamingNinjaStar {
	
	public static void main(String[] args) {

		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms
		
		// 1. Make a new robot, and set it's pen down.
		Robot turtle = new Robot();
		turtle.penDown();
	
		

		// *14. Use the methods setX and setY to move the ninja star into the center of the screen
		turtle.setX(450);
		turtle.setY(230);
		// *15. Make some adjustments to see what other kinds of shapes you can make.

		// 12. Set the robot speed to 10
		turtle.setSpeed(10);
		// 13. Use a for loop to repeat all of the code below 25 times
for(int i=0; i<25; i++) {
			// 2. Turn the robot 1/8 of a circle
			turtle.turn(45);
			// 3. Move the robot 64 pixels
			turtle.move(64);
			// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
			turtle.turn(-40);
			// 5. Move the robot the distance in the variable flameSize
			turtle.setPenColor(255, 215, 0);
			turtle.move(flameSize);
			// 6. Turn the robot 170 degrees
			turtle.turn(170);
			// 7. Move the robot the distance in the variable flameSize (again)
			turtle.move(flameSize);
			// 8. Turn the robot 64 degrees to the right
			turtle.turn(64);
			// 9. Move the robot the distance in the variable baseSize
			turtle.setPenColor(0,0,0);
			turtle.move(baseSize);
			// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
			
			// 11. Color your ninja star like Figure 2.
}
	}

}


