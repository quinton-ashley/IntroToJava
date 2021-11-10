package games_java.PickAPath;

import java.util.Scanner;

public class PickAPath {
	public static void main(String[] args) {
		// create the user input scanner object
		Scanner sc = new Scanner(System.in);
		// your code goes here! below this line

		int choice = -1; // initialize choice to -1, user has not made any choice yet

		while (choice != 0) {
			String msg = ""; // initialize message to empty string

			if (choice == -1) {
				/* PART A0: Start your story! */
				msg = "It's a dark October night. You're staying up late coding but suddenly you hear a knock at your door!\n\n\t"
						+ "1: Ask \"Who is it?\"\n\t" + "2: Ignore it and keep coding\n\t" + "3: Try to go to sleep";
			} else if (choice == 1) {
				/* PART A1: continue the story */
				msg = "Continue the story, each choice will lead to another path, you can reuse the same options though and have paths converge.\n\t"
						+ "4: another option\n\t" + "5: another option";
			}

			// prompt the player to make choices
			System.out.println(msg);
			choice = sc.nextInt();

			/* PART B1: check if the player made a valid choice, reject invalid choices */

		}

		sc.close();
		System.exit(0); // exit the program
	}
}
