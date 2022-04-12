package games_java.WheelOfFortune;

import static games_java.QuintOS.*;

public class WheelOfFortune {
	// the category is "Fun and Games"
	String bigBuzzer = """
			|⎺|__  _   _ ___________ _ __
			| '_ \\| | | |_  /_  / _ \\ '__|
			| |_) | |_| |/ / / /  __/ |
			|_.__/ \\__,_/___/___\\___|_|""".substring(1);

	public WheelOfFortune() {
		setupGame();
	}

	void setupGame() {
		/*
		 * Make an array of phrases, pick a random phrase, and split pharse into an
		 * array of words
		 */

		/* Create the buzzer button */
		button(bigBuzzer, 18, 5, () -> {
			this.buzz();
		});
	}

	/* Display all the boxes for the phrase */
	void displayBoxes() {
	}

	void buzz() {
	}

	/* Add a letter to a random empty box */
	void addLetter() {
	}

	public static void main(String[] args) {
		new WheelOfFortune();
	}

}
