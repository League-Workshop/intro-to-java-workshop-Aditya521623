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
		
		if(answer.equals("50") ) {
			JOptionPane.showMessageDialog(null, "Great Job");
			
			userScore =  1;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Nice Try");
			userScore = -1;
		}
		
	
		
		String answer2 =JOptionPane.showInputDialog( "What is 15 times 5?");
		
		if(answer2.equals("75") ) {
			JOptionPane.showMessageDialog(null, "Great Job");
			
			userScore = userScore + 1 ;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Nice Try");
			userScore = userScore-1;
		}
		
		String answer3 =JOptionPane.showInputDialog( " What is the meaning of life?");
		
		if(answer3.equals("Oreos") ) {
			JOptionPane.showMessageDialog(null, "Great Job, You have found the meaning of your life. ");
			
			userScore = userScore + 10000;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "You have failed to know the meaing of life and you will never be able to taste the greatness of OREOS.");
			userScore = userScore-1000000000;
			
			
		}
		JOptionPane.showMessageDialog(null, " Here are yor results: " + userScore );
		
		
		if(userScore<1) {
			
			JOptionPane.showMessageDialog(null, " You failed. BYE!! " );
			
		}
		else
		{
			
			JOptionPane.showMessageDialog(null, " You passed. BYE!! " );
			
		}
 
		
	}
}
