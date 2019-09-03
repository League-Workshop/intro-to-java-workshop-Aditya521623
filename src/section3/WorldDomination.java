package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		
		String input =JOptionPane.showInputDialog("do you know how to code?");
		
		// 2. If they say "yes", tell them they will rule the world.
		
		if(input.contentEquals("yes")) {
			
			JOptionPane.showMessageDialog(null, "whoo hoo! you're going to rule the world");
		}
		else
		{ 
			JOptionPane.showMessageDialog(null, "well, good luck washing the dishes.");
		}
		// 3. Otherwise, wish them good luck washing dishes.

	}
}

