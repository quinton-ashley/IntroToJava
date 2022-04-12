package games_java.Wordle;

import static games_java.QuintOS.*;

import java.util.ArrayList;

public class Wordle {
	ArrayList<String> dictionary;
	ArrayList<String> words;
	String[] board;

	public Wordle() {
		setupGame();
	}

	void setupGame() {
		/* load the text files */

		startGame();
	}

	/* Display all the boxes for the letters */
	void displayBoxes() {
	}

	void startGame() {
		/* pick new word */

		displayBoxes();

		prompt("Guess the word!", 3, 18, 20);
	}

	public static void main(String[] args) {
		new Wordle();
	}
}
