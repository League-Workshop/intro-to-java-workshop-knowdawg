package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		String Answer;
		Answer = JOptionPane.showInputDialog("Do you know how to code?");
		
		if(Answer.equals("yes")) {
		JOptionPane.showMessageDialog(null, "You will rule the world.");
	
		if(Answer.equals("no")) {
		JOptionPane.showMessageDialog(null, "Good Luck washing dishes.");
		// 1. Ask the user if they know how to write code.

		// 2. If they say "yes", tell them they will rule the world.

		// 3. Otherwise, wish them good luck washing dishes.

	}
}
	}
}

