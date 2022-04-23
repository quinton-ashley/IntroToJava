package games_java.QuickClicks;

import static games_java.QuintOS.*;

public class QuickClicks {
	String target = " .d88b.\n.8P  Y8.\n88    88\n88    88\n'8b  d8'\n 'Y88P'";

	void makeTargets() {
		/*
		 * PART A0: change the values of row and col to be random, within the bounds of
		 * the screen.
		 */
		int row = 1;
		int col = 1;
		button(target, row, col);
	}

	public QuickClicks() {
		makeTargets();
	}

	public static void main(String[] args) {
		new QuickClicks();
	}
}
