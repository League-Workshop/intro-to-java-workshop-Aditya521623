package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		Robot robo = new Robot();
		
		int num = 0;
		
		robo.setSpeed(200);
		
		robo.penDown();
		
		while(num <4) {
			robo.move(200);
			
			robo.turn(90);
			
			num++;
		}
		 
		
		
		
		
		 
	}
}
