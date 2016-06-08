
import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

	public static void main(String[] args) {
		Robot Bobby = new Robot();
		Bobby.setSpeed(10);
		// 3. ask the user what color they would like the Robot to draw
		for (int j = 0; j < 10; j++) {
			String Echo = JOptionPane.showInputDialog("What Color Do You Want\nGreen, Blue, Red, or Black");
			// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
			if (Echo.equals("Red") || Echo.equals("red")) {
				Bobby.setPenColor(204, 0, 34);

			} else if (Echo.equals("Blue") || Echo.equals("blue")) {
				Bobby.setPenColor(0, 0, 255);

			} else if (Echo.equals("Green") || Echo.equals("green")) {
				Bobby.setPenColor(0, 204, 34);

			} else if (Echo.equals("Black") || Echo.equals("black")) {
				Bobby.setPenColor(0, 0, 0);

			}

			// 2. set the pen width to 10
			Bobby.setPenWidth(10);
			Bobby.penDown();
			// 1. make the Robot draw a shape
			for (int i = 0; i < 4; i++) {
				Bobby.move(100);
				Bobby.turn(90);
			}

		}
	}
}