package games_java.PickAPath;

import java.util.Arrays;
import java.util.Scanner;

public class PickAPath {
	public static void main(String[] args) {
		// create the user input scanner object
		Scanner sc = new Scanner(System.in);
		// your code goes here! below this line

		int choice = 0; // initialize choice to 0, user has not made any choice yet

		boolean gameOver = false;

		while (gameOver == false) {
			String msg = ""; // initialize message to empty String

			if (choice == 0) {
				/* Part A0: Start your story! */
				msg = "This is the start of the story. Type one of the numbers and press enter.\n\n\t" +
						"1: your player could pick this choice\n\t" +
						"2: or maybe this path\n\t" +
						"3: or even this option";
			} else if (choice == 1) {
				/* Part A1: continue the story */
				msg = "Continue the story, each choice could lead to a different path but you can also reuse choice numbers and have paths converge.\n\t"
						+
						"4: another path\n\t" +
						"5: an additional option";
			}

			// prompt the player to make choices
			System.out.println(msg);
			choice = sc.nextInt();

			/* Part B1: check if the player made a valid choice, reject invalid choices */

		}

		sc.close();
		System.exit(0); // exit the program
	}
}
