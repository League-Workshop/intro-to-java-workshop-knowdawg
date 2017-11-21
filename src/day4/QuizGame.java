package day4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		// 2. Ask the user a question
		String answer1 = JOptionPane
				.showInputDialog("There is a red door and a blue door. What door do you take? (do not include 'the')");
		// 3. Use an if statement to check if their answer is correct
		if (answer1.equals("purple door")) {
			JOptionPane.showMessageDialog(null, "Good thinking!");
			score += 20;
		} else {
			JOptionPane.showMessageDialog(null, "What a fail! Try again");
			score -= 5;
		}

		String answer2 = JOptionPane.showInputDialog("Is monny good? Yes or no?");
		// 3. Use an if statement to check if their answer is correct
		if (answer2.equals("meh")) {
			JOptionPane.showMessageDialog(null, "Wow! cant belive you got that one!");
			score += 50;
		} else {
			JOptionPane.showMessageDialog(null, "Mabye in YOUR opinion! Try again");
			score -= 5;
		}

		String answer3 = JOptionPane.showInputDialog("You fall down the stairs. Are you hurt?");
		// 3. Use an if statement to check if their answer is correct
		if (answer3.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Good thinking! That was a trick question!");
			score += 10;
		} else {
			JOptionPane.showMessageDialog(null, "Yeah right!! Try again");
			score -= 30;
		}
		JOptionPane.showMessageDialog(null, "Your score is " + score);

		// 4. if the user's answer is correct

		// -- add one to their score

		// 5. Create more questions by repeating steps 1, 2, and 3 below.

		// 6. After all the questions have been asked, print the user's score

	}
}