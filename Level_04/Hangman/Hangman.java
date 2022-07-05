package games_java.Hangman;

import java.util.Scanner;

public class Hangman {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] hangman = new String[] { """
				  +---+
				  |   |
				      |
				      |
				      |
				      |
				=========""", """
				  +---+
				  |   |
				  O   |
				      |
				      |
				      |
				=========""", """
				  +---+
				  |   |
				  O   |
				  |   |
				      |
				      |
				=========""", """
				  +---+
				  |   |
				  O   |
				 /|   |
				      |
				      |
				=========""", """
				  +---+
				  |   |
				  O   |
				 /|\\  |
				      |
				      |
				=========""", """
				  +---+
				  |   |
				  O   |
				 /|\\  |
				 /    |
				      |
				=========""", """
				  +---+
				  |   |
				  O   |
				 /|\\  |
				 / \\  |
				      |
				=========""" };

		String wordsList = "abruptly absurd abyss affix askew avenue awkward axiom azure bagpipes bandwagon banjo bayou beekeeper bikini blitz blizzard boggle bookworm boxcar buckaroo buffalo buffoon buzzard buzzing buzzwords cobweb croquet crypt cycle disavow dizzying duplex dwarves embezzle equip espionage euouae exodus faking fishhook fixable fjord flapjack flopping fluffiness flyby foxglove frazzled frizzled funny gabby galaxy galvanize gazebo gizmo glow glyph gnarly gnostic gossip grogginess haiku haphazard hyphen icebox injury ivory ivy jackpot jawbreaker jaywalk jazzy jelly jigsaw jinx jiujitsu jockey jogging joking jovial joyful juicy jukebox jumbo kayak kazoo keyhole kilobyte kiosk kitsch kiwifruit klutz knapsack lengths lucky luxury marquee matrix megahertz microwave mnemonic mystify nightclub nowadays oxidize oxygen pajama phlegm pixel pizazz polka psyche puppy puzzling quartz queue quip quiz quizzes razzmatazz rhythm scratch snazzy squawk staff strength stretch stronghold stymie subway swivel syndrome thrift thumb topaz transcript transgress transplant twelfth unknown unzip vaporize voodoo vortex walkway waltz wave wavy waxy well whomever witch wizard wristwatch xylophone yacht youthful yummy zigzag zilch zipper zodiac zombie";

		/* Part A: split the words String into an array, choose a random word */

		/* Part B: make a char array with a line for each letter in the word */
		// Example word: 'quiz'
		// lines -> ['_', '_', '_', '_']

		/* Part C: show the lines for the word below the hangman art */
		System.out.println(hangman[0]);
		String guess = sc.nextLine();

		sc.close();
		System.exit(0);
	}
}
