
/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. Tell them which year they were born. If they are over 30, tell them
 * they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("What is your age?");
		int newAge = Integer.parseInt(age);
		int year = 2016;
		int newNewAge = newAge;
		newAge = year - newAge;
		year = year - newNewAge - 1;
		JOptionPane.showMessageDialog(null, "You were born in " + newAge + " or in " + year);
		if (newNewAge == 30 || newNewAge > 30) {
			JOptionPane.showMessageDialog(null, "Wow you are too old to play this game");
		} else {
			JOptionPane.showMessageDialog(null, "Have a good day " + newNewAge + " dude!");
		}
	}
}
