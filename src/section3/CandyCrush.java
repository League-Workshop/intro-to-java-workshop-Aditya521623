package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		
		
		String message = JOptionPane.showInputDialog("Who do you not like? AT ALL?");
		
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You totally have a crush on " + message + "!");
		// 3. Ask the user for the name of their best friend
		
		String message2= JOptionPane.showInputDialog("Whats the name of your best friend?");

		JOptionPane.showMessageDialog(null, message2 + " must be as sweet a candy! ");		
		
		// 4. Tell them their best friend is as sweet as candy

	} 
}



