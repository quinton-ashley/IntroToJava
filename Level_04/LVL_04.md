# Level 04 A

Do the GuessTheNumber challenge section before starting level 04!

![](https://elasticbeanstalk-us-east-2-651921832906.s3.us-east-2.amazonaws.com/QuintOS/bootScreen3.jpg)

## Creating a Button

Let's learn how to add a button. The `button` function is just like `text` but it also expects a fourth input parameter, a callback function that gets run when the button is clicked.

A callback function is a function passed as an input argument to a function that will run the callback function. This callback uses a lambda arrow function `() -> {}` to call `btnClick`. This is the more modern version of a Java Runnable.

```java
void btnClick() {
	System.out.println("You clicked the button!");
}

//    (text,     row, col, function)
button("Click me!", 5, 5, () -> {
	this.btnClick();
});
```

## Recursion

In the past few lessons you've learned about `for` loops and `while` loops. Recursion is another way to loop code. It is simply a function that calls itself inside its own defintion.

```java
void doRecursion() {
	doRecursion(); // infinite loop! OH NO!
}
```

Here's example of a recursion loop that ends when the player losses all their health points.

```js
player.health = 100; // initial health

function gameLoop() {
	//
	// ... game code here ...
	//
	if (enemy.attack(player) == true) {
		player.health -= enemy.damage;
	}
	//
	if (player.health > 0) {
		gameLoop();
	} else {
		gameOver();
	}
}
```

# Level 04 B

## Erasing a button

Remove buttons from the screen by using the erase function on them. You must store the button returned by `button` to use the `erase` function on it.

```java
Button btn = button("Click this!", 10, 10);
btn.erase();
```

## Implied boolean conditions

In this example, `playerIsDead` is a boolean varible.

```java
boolean playerIsDead = false;
```

If `playerIsDead` gets set to `true` while the user is playing a game, then tell the user "Game Over!".

```java
if (playerIsDead == true) {
	System.out.println("Game Over!");
}
```

In Java you don't have to use `== true` in boolean conditions because checking for equivalence to `true` is implied. You can just put the variable in a boolean condition on it's own.

```java
if (playerIsDead) {
	System.out.println("Game Over!");
}
```

## How to check if a variable is defined

In Java you can set variables to be `null` (nothing) before you give them a value.

```java
Robot robo = null; // robot created but not defined

// only have the robot shoot lasers if it is defined!
if (robo != null) {
	robo.shootLasers();
}
```

# Level 04 C

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

A fourth input paramter can be used to restrict the width of the window. Text that is longer than the specified width will be put on new lines. This width limiter can be used with the `text`, `alert`, and `prompt` functions.

If row, column, and width are not defined, default position values are used, which are different for each of the QuintOS virtual computers.

# Level 04 D

## Instant

Take a look at the Java documentation for the [Instant](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html) class.

```java
long time = Instant.now().toEpochMilli();
```

`time` is set to the current time in milliseconds since the epoch of January 1, 1970 at midnight. `long` is a Java type used to store numbers which are too big to be stored as `int`.

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

## Computer History: GRiD Compass

This level's computer is based on the GRiD Compass 1101. The following description is from http://oldcomputers.net/grid1101.html

![](http://oldcomputers.net/pics/grid1101-right.jpg)

Designed to be the ultimate portable computer, the clamshell-style GRiD Compass 1101 is the grand-daddy of all present-day laptop computers.

The Compass is very high-tech, with its flat-black, die-cast magnesium-alloy case, and bright, sharp electroluminescent display (ELD). No other system packed so much speed and power in as small a case, and none had such a unique and large, easy-to-read screen, allowing full 80x24 text.

Of course, all of these great features raised the price significantly. At $8150, the GRiD Compass 1101 was the most expensive personal computer on the market.

Originally developed for business executives, GRiDs were also used by the U.S. military 'in the field', and by NASA on the Space Shuttles during the 1980's and 90's. It's even been said that the US President's "nuclear football" at one time included a GRiD computer.

- [Level 04 A](#level-04-a)
	- [Creating a Button](#creating-a-button)
	- [Recursion](#recursion)
- [Level 04 B](#level-04-b)
	- [Erasing a button](#erasing-a-button)
	- [Implied boolean conditions](#implied-boolean-conditions)
	- [How to check if a variable is defined](#how-to-check-if-a-variable-is-defined)
- [Level 04 C](#level-04-c)
	- [prompts and alerts](#prompts-and-alerts)
	- [Changing the positions of prompts and alerts](#changing-the-positions-of-prompts-and-alerts)
- [Level 04 D](#level-04-d)
	- [Instant](#instant)
	- [Creating Arrays of defined length](#creating-arrays-of-defined-length)
- [Level 04 E](#level-04-e)
	- [modulo operator](#modulo-operator)
	- [Computer History: GRiD Compass](#computer-history-grid-compass)
