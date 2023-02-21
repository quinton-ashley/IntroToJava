# Level 04 A

Do the GuessTheNumber challenge section before starting level 04!

![](https://elasticbeanstalk-us-east-2-651921832906.s3.us-east-2.amazonaws.com/QuintOS/bootScreen3.jpg)

## package

```java
package parent_folder.ExampleClass;
```

The first line of a Java file declares the package (aka folder) that the Java file is in relative to where it is being run. In package declarations, the path to the file is separated by `.` dots instead of slashes.

For example, you are running your Java files from the `quintos-games` folder. So the package of this game is: `games_java.QuickClicks`

## imports

Not all Java classes are available by default. To keep the size of a compiled Java program small, developers are required to import only the classes necessary for the program to run. For example, `Scanner` is not available as part of the Java language by default, it must be imported into your project.

```java
import java.util.Scanner;
```

QuintOS must also be imported. It is a static import, meaning you can use QuintOS methods without referencing the QuintOS class first like you must do with `Math.random()`.

```java
import static games_java.QuintOS.*;
```

## Classes in Java

When making a simple game you can put all the game's code in the main method, but if you want to make a more complex games with multiple methods then you will need to know how to create a class.

This example shows the start of a student's implementation of the game Chess in Java.

```java
package Chess;

import java.util.Scanner;

public class Chess {
	Scanner sc;
	String white;
	String black;

	void takeTurn() {
		System.out.println("Which position would you like to move to?");
		String position = sc.nextLine();
		// TODO: update game board
	}

	void startGame() {
		sc = new Scanner(System.in);

		System.out.println("Who will move the white pieces?");
		white = sc.nextLine();
		System.out.println("Who will move the black pieces?");
		white = sc.nextLine();

		System.out.println(white + " it is your turn.");
		takeTurn();
	}

	// class constructor
	public Chess() {
		startGame();
	}

	public static void main(String[] args) {
		new Chess();
	}
}
```

The class constructor is a function that is run when an Object of that class is created. Objects can be created using the keyword `new` followed by the class constructor function. From inside the class constructor you can call other methods of that class.

A class is like a blueprint for an Object. A class for a game is like the rules of the game, the game board, and all the pieces. An Object made using that game class is one particular instance of playing the game. Object variables for a chess game should store things like the names of the players, the position of pieces on the board, the game clock if the game is timed, etc. These variables (also called properties of the object) are available to use in any of the object's methods.

## substring String

```java
String str = "hello".substring(1);
log(str); // -> "ello"
```

`substring` returns a part of the original string which starts at the index provided as the first input parameter.

## Create a Button

Buttons glow when hovered over and are clickable. The `button` function is quite similar to the `text` function.

```java
//    (text, row, col)
button("Yes", 5, 5);
button("No", 5, 9);
```

# Level 04 B

## Respond to button clicks

You can add a fourth input parameter to the `button` function, a callback function that gets run when the button is clicked.

```java
void btnClick() {
	System.out.println("You clicked the button!");
}

//    (text,     row, col, function)
button("Click me!", 5, 5, () -> {
	btnClick();
});
```

This example uses the lambda arrow function syntax: `() -> { }`

## Recursion

In the past few lessons you've learned about `for` loops and `while` loops. Recursion is another way to loop code. It is simply a function that calls itself inside its own definition.

```java
void doRecursion() {
	doRecursion(); // infinite loop! OH NO!
}
```

Here's a more practical example of a recursion loop that ends when the player losses all their health points.

```java
int health = 100; // initial health

void gameLoop() {
	//
	// ... game code here ...
	//
	if (health > 0) {
		gameLoop();
	} else {
		gameOver();
	}
}
```

# Level 04 C

## Erase

```java
erase();
```

Use erase to remove all text and buttons from the screen.

## prompts and alerts

In previous lessons you've used `System.out.println` to create alert windows and a scanner `sc.next` to create prompt windows. You can also use the QuintOS functions `prompt` and `alert` directly.

```java
// waits for the user to type something and press enter
String favColor = prompt("What is your favorite color?");
// the user's response to the prompt is assigned to favColor

// waits for user to read the message in the alert and press enter
alert(favColor + " is my favorite color too!"); // show message to user
```

In a standard Java program `System.out.println` is used to print to the Java console, which is just a line by line text output. Boring!

## Changing the positions of prompts and alerts

The position of prompt and alert windows can be changed by defining their row and column values just like with the `text` function.

```java
//   (text           , row, col, w)
alert("I can move too!", 5, 20, 16);
```

A fourth input parameter can be used to restrict the width of the window. Text that is longer than the specified width will be put on new lines. This width limiter can be used with the `text`, `alert`, and `prompt` functions.

If row, column, and width are not defined, default position values are used, which are different for each of the QuintOS virtual computers.

# Level 04 D

## Callbacks

Callbacks are non-linear, so they are good for handling events (like button clicks) that in some cases we wouldn't want our program to wait for. For example if you gave the user a choice between clicking a "Yes" or "No" button you wouldn't want the program to wait for them to click "Yes" because they might click "No". A separate callback function is needed to handle each response.

## Creating Arrays of defined length

The following example asks the user security questions and records their answers. Since we already know there are three questions there will be three answers. However we don't know what the answers will be, so they can't be defined when we create the array. Instead, the amount of items the array will store can be defined in the `[]` square brackets. Then you can add the values by assigning them to positions in the array.

```java
String[] questions = new String[] {
	"What was your first pet's name?",
	"What's your mother's maiden name?",
	"In what city or town did your parents meet?"
};
String[] answers = new String[3];

for (int i = 0; i < 3; i++) {
	System.out.println(questions[i]);
	answers[i] = sc.nextLine();
}
```

## Instant

Take a look at the Java documentation for the [Instant](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html) class.

```java
long time = Instant.now().toEpochMilli();
```

`time` is set to the current time in milliseconds since the epoch of January 1, 1970 at midnight. `long` is a Java type used to store numbers which are too big to be stored as `int`.

# Level 04 E

## modulo operator

The modulo operator `%` gets the gets the remainder of a division.

```java
// true if x is even (divisible by 2)
if (x % 2 == 0) {
	System.out.println("x is even!");
}

// true if y is divisible by 5
if (y % 5 == 0) {
	System.out.println(y + " is a multiple of 5");
}
```

Here's how modulo can be used for alternation.

```java
for (int i = 0; i < 10; i++) {
	if (i % 2 == 0) {
		txt("even", i);
	} else {
		txt("odd", i);
	}
}
```

## for loops with non-standard increments

This code does the same kind of alternation.

```java
for (int i = 0; i < 10; i+=2) {
	txt("even", i);
	txt("odd", i+1);
}
```

## Computer History: GRiD Compass

This level's computer is based on the GRiD Compass 1101. The following description is from http://oldcomputers.net/grid1101.html

![](http://oldcomputers.net/pics/grid1101-right.jpg)

Designed to be the ultimate portable computer, the clamshell-style GRiD Compass 1101 is the grand-daddy of all present-day laptop computers.

The Compass is very high-tech, with its flat-black, die-cast magnesium-alloy case, and bright, sharp electroluminescent display (ELD). No other system packed so much speed and power in as small a case, and none had such a unique and large, easy-to-read screen, allowing full 80x24 text.

Of course, all of these great features raised the price significantly. At $8150, the GRiD Compass 1101 was the most expensive personal computer on the market.

Originally developed for business executives, GRiDs were also used by the U.S. military 'in the field', and by NASA on the Space Shuttles during the 1980's and 90's. It's even been said that the US President's "nuclear football" at one time included a GRiD computer.

- [Level 04 A](#level-04-a)
  - [package](#package)
  - [imports](#imports)
  - [Classes in Java](#classes-in-java)
  - [substring String](#substring-string)
  - [Create a Button](#create-a-button)
- [Level 04 B](#level-04-b)
  - [Respond to button clicks](#respond-to-button-clicks)
  - [Recursion](#recursion)
- [Level 04 C](#level-04-c)
  - [Erase](#erase)
  - [prompts and alerts](#prompts-and-alerts)
  - [Changing the positions of prompts and alerts](#changing-the-positions-of-prompts-and-alerts)
- [Level 04 D](#level-04-d)
  - [Callbacks](#callbacks)
  - [Creating Arrays of defined length](#creating-arrays-of-defined-length)
  - [Instant](#instant)
- [Level 04 E](#level-04-e)
  - [modulo operator](#modulo-operator)
  - [for loops with non-standard increments](#for-loops-with-non-standard-increments)
  - [Computer History: GRiD Compass](#computer-history-grid-compass)
