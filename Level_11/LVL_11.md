# Level 11 A

## Loading sounds

The `loadSound` function loads a sound file from a given path. A path is the location of a file on your computer. `QuintOS.dir` is the location of the game's folder (aka directory).

```java
SoundFile letterSoundA = loadSound(QuintOS.dir + "/sounds/letters/A.mp3");
```

# Level 11 B

## Working with Inputs directly

Up to this point whenever we worked with inputs we used `prompt()`, now we're going to be using inputs directly.

```java
Input inp = input(value, x, y, () -> {
		this.onSubmit();
	}, () -> {
		this.onChange();
	});
```

`inp` is the the `Input` object created, cursor blinking on the screen at position (x, y).

`value` is the initial text in the input, set to an empty String by default.

`onSubmit` called when the user presses the enter key.

`onChange` called when the user types any key that changes the input's value.

## Example use of Inputs

Here's the code for the Calculator that runs after you exit the GuessTheNumber game. Load the calculator and check it out.

```java
Input inp;

// value is the text the user entered in the input
void calculate(value) {
	// eval() is a global function that evaluates the String input value as
	// JavaScript code, for example if value is "5+3", result will be the number 8
	double result = eval(value); // evaluate what the user entered

	inp.erase(); // erase the old input

	// create new input with it's initial value set to result
	inp = input(result, 0, 0, () -> {
		this.calculate();
	}));
}

// create the input
inp = input('', 0, 0, calculate);
```

# Level 11 D

```java
void playAllLetters() {
	String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	for (int i = 0; i < 26; i++) {
		char letter = alphabet.charAt(i);
		play(letterSounds.get(letter));
	}
}
```

## Computer History: Speak and Spell

This level's computer is based on the classic children's toy from the 1980s, the electronic [Speak and Spell](<https://en.wikipedia.org/wiki/Speak_%26_Spell_(toy)>) made by Texas Instruments.

- [Level 11 A](#level-11-a)
	- [Loading sounds](#loading-sounds)
- [Level 11 B](#level-11-b)
	- [Working with Inputs directly](#working-with-inputs-directly)
	- [Example use of Inputs](#example-use-of-inputs)
- [Level 11 D](#level-11-d)
	- [Computer History: Speak and Spell](#computer-history-speak-and-spell)
