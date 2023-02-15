package games_java.PickAPath;

import java.util.Arrays;
import java.util.Scanner;

public class PickAPath {
	public static void main(String[] args) {
		// create the user input scanner object
		Scanner sc = new Scanner(System.in);
		// your code goes here! below this line

		int path = 0; // initialize path to 0

		boolean gameOver = false;

		while (gameOver == false) {
			String msg = ""; // initialize message to empty String

			if (path == 0) {
				/* Part A0: Start your story! */
				msg = "This is the start of the story. Type one of the numbers and press enter.\n\n\t" +
						"1: your player could pick this choice\n\t" +
						"2: or maybe this path\n\t" +
						"3: or even this option";
			} else if (path == 1) {
				/* Part A1: continue the story */
				msg = "Continue the story, each choice could lead to a different path but you can also reuse choice numbers and have paths converge.\n\t"
						+
						"4: another path\n\t" +
						"5: an additional option";
			}

			// prompt the player to pick a path
			System.out.println(msg);
			path = sc.nextInt();

			/* Part B1: check if the player made a valid choice, reject invalid choices */

		}

		sc.close();
		System.exit(0); // exit the program
	}
}
