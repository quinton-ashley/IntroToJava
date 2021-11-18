package games_java.QuickClicks;

import static games_java.QuintOS.*;

public class QuickClicks {
	String target = """
			 .d88b.
			.8P  Y8.
			88    88
			88    88
			'8b  d8'
			 'Y88P'""".substring(1);
	// substring removes the first character from the string
	// in this case I remove the new line at the beginning
	// so the first line of the button will be at the proper
	// row value

	public QuickClicks() {
		/* PART A0: change the values of row and col to be random */
		// screen size is 80 cols x 30 rows
		// target is 8w x 6h
		// drawing starts from top left corner
		// we want to draw the target within the bounds of the frame
		// 30 rows - 6 target height - 1 frame line = 23
		// 80 columns - 8 target width - 1 frame line = 71

		int row = 1;
		int col = 1;
		button(target, row, col);

		/* PART B: Use recursion to make a new button after clicking a button */

		/* PART C: Limit clicks to 20, calculate stats */

		/* PART D: Make a background pattern */
	}

	public static void main(String[] args) {
		new QuickClicks();
	}
}
