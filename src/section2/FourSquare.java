package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot rob = new Robot();

	void go() {
		rob.setSpeed(1000);

		rob.setPenWidth(5);
		
		rob.penDown();

		for(int num = 0;  num<4; num++) {
			
			rob.setRandomPenColor();
			
			drawSquare();
			
			rob.turn(90);
		}

			
	
			

	}

	
	void drawSquare() {
		//JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		
		
		
		
for(int num = 0;  num<4; num++) {
			
			
			
			rob.move(200);
			
			rob.turn(90);
		}
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



