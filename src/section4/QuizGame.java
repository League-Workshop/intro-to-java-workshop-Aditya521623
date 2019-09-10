package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		
		int userScore = 0;
		
		int answer1 = 50;
		
		
		
		// 2.  Ask the user a question 
		
		String answer = JOptionPane.showInputDialog("What is 5 times 10?");
		
		int num = Integer.parseInt(answer);
		
		// 3.  Use an if statement to check if their answer is correct
		
		// 4.  if the user's answer was correct, add one to their score 
		
		
		if(userScore<1) {
			
			JOptionPane.showMessageDialog(null, " You failed. BYE!! " );
			
		}
		else
		{
			
			JOptionPane.showMessageDialog(null, " You passed. BYE!! " );
			
		}
 
		
	}
}
