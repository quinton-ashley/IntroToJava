# Level 00 A

## What is Computer Science?

Why is this field of study called "Computer Science" and not "Program Writing" or "Code Mathematics"? It's because coding requires experimentation! You'll often need to test your code, learn from unexpected problems, and make changes to get the results you want. Coding often requires research too, even professional programmers learn new things every day.

These lessons will teach you how to code in Java, which is required for the AP Computer Science A curriculum.

Since you're just starting out, you will have to memorize some vocabulary, "grammar", and syntax to learn this new language. Learning to code isn't what programming is all about though, just like learning to play scales isn't what being a musician is, putting on a costume and memorizing lines isn't what acting is. In these lessons you will not just learn to code but also how to think like a programmer! Programming is a skill you can develop over the course of your whole life.

As you may expect, programming will be really fun and interesting for you if you like abstract problem solving, in this way it is also similar to Math. Programming has a language arts aspect too. You will not only strive to write efficient code but also code that is easily understood by other programmers.

## What is QuintOS?

Issac Newton once said, "we stand on the shoulders of giants". To understand how software is developed today it's important to learn a bit about the history of computers.

If you signed up for this course you might want to know how video games work and how to make your own! If not, making games will hopefully be a fun way for you to learn how to code.

During each lesson you'll develop a QuintOS game that runs on virtual computers displayed in your web browser: Google Chrome, Firefox, or Opera. QuintOS is a retro game engine I created for this course and also for my own games. As you level up your coding skills, your virtual computer will get upgraded. So since you're just starting out, the first game you make will be for... a programmable calculator. 😜

![](https://elasticbeanstalk-us-east-2-651921832906.s3.us-east-2.amazonaws.com/QuintOS/bootScreen0.jpg)

This first lesson will require you to learn a lot of information before we can even make a simple game. It may be a bit overwhelming for you but don't worry! You'll get a lot of practice with these concepts so that you will fully understand them. Let's get started! 🥳

## Creating Variables 🔡

First of all, what is a variable? Variables in Java store data in your computer's memory.

```java
int a = 0;
```

In the example code `a` is the names of the variable. `a` is assigned the number `0`.

Use a semicolon `;` to end each line of code. 👁👅👁

### Changing a variable's value

Don't create variables twice!

```java
int x = 10;
int x = 5; // ERROR! x already exists
```

Here's how to change the value of the variable `x`

```java
int x = 10;
x = 5; // good :)
```

Double slash `//` is for making a comment, any text behind it on the same line will not be considered part of the code's instructions.

## Types of Variables 🔡

### Numbers

```java
int x = 2;
float y = -49.8;
double z = 9504.159392000393888;
```

`int` is for whole numbers. `float` is for decimal numbers. `double` should be used when a higher degree of percision is needed for decimal numbers. All of these types of numbers can be positive or negative.

### Boolean

Booleans are either `true` or `false`

```java
boolean codingIsFun = true;
```

### Characters

```java
char letter = 'a';
```

The variable `letter` stores the single character `a`.

### String

Strings are text, stored as lists of characters. You can think of them like lettered beads on a charm bracelet string. They are defined using quotes " "

```java
String story = "The dog went to the dog park on 3rd Avenue.";
```

If you don't use quotes, Java will think the words are variables!

```java
String story = The dog went to the dog park on 3rd Avenue.; // ERROR!
```

## Camel Case 🐫

Variables in Java can't have spaces, 🙅‍♂️ so for variables that have multiple words, the first letter of the words after the first word are capitalized. This naming convention is called camel case because the capitalized letters are like the humps on a camel.

```java
String apple = "🍎";
String applePie = "🍎 π";
String applePieIceCream = "🍎 π 🍨";
```

## Mathematical operators 🔢

```txt
Addition:       +
Subtraction:    -
Multiplication: *
Division:       /
```

The multiplication symbol is the asterisk, NOT the letter `x`!

```java
int x = 5 * 8; // x -> 40
```

## Checking Equivalence ✅

Single equals `=` is for assigning values to variables. Double equals `==` is a boolean operator used for checking equivalence.

`if` statements use a boolean condition, which goes in parenthesis after the keyword `if`. If the boolean condition is `true`, the code block `{}`, whatever's inside the squiggly brackets, is run.

`else if` and `else` are used after if statements, they form a chain of different paths the code can take if the previous if statements were false.

Take a look at the example below which assigns the name of the coin to the variable `coin` based on the value of `value`.

```java
String coin; // variables can be created without a value assigned to them

if (value == 1.00) {
  coin = "Dollar";
} else if (value == 0.50) {
  coin = "Half-Dollar";
} else if (value == 0.25) {
  coin = "Quarter";
} else if (value == 0.10) {
  coin = "Dime";
} else if (value == 0.05) {
  coin = "Nickel";
} else if (value == 0.01) {
  coin = "Penny";
} else {
  coin = "Unknown";
}
```

## Boolean operators 🐰

```txt
Equivalence:              ==
Not equal:                !=
Less than:                <
Less than or equal to:    <=
Greater than:             >
Greater than or equal to: >=
```

Use boolean (true/false) operators in the boolean conditions (inside the parenthesis) of `if` and `else if` statements.

### functions

functions are a reference to other sections of code which you can run using the parenthesis. Input parameters to a function go in the parenthesis.

```java
powerOn();
turn("left");
moveForward(10);
turn("right");
moveForward(2);
```

This code for a robot remote control makes the robot power on, turn to the left, then move forward ten steps, turn to the right, then move forward two steps.

## Globals 🌐

Globals are special variables that are already available for you to use. You can also create global variables yourself but we'll learn how to do that later.

## System

`System` is an important global variable. Use `System.out.println()` to display text to the user. Usually this would make text appear in the console but with QuintOS the text will appear in an alert window.

## Scanner

Scanner can be used for user interaction with `System.in` for user input.

```java
// create a new Scanner of the system input
Scanner sc = new Scanner(System.in);

// waits for the user to type something and press enter
// the user's response to the prompt is assigned to favColor
System.out.println("What's your favorite color?");
String favColor = sc.nextLine();

System.out.println(favColor + " is my favorite color too!");
```

With QuintOS, printing to the console using `System.out` and then using a Scanner object to get user input will cause a prompt window to appear.

## End of Level 00 A

That was a LOT of information! Here's a summary of everything we learned about:

- types of variables: numbers, booleans, characters, Strings and functions
- making boolean conditions to test if something is `true` or `false`
- using double equals to `==` check for equivalence
- `if`, `else if`, and `else` statements
- globals like `System`

Now you're ready to start making your first game! 🥳 [Click here for the GuessTheNumber instructions.](https://github.com/quinton-ashley/IntroToJava/blob/main/Level_00/GuessTheNumber.md)

# Level 00 B

Did you complete `GuessTheNumber` part A and are ready to learn more? To complete the game you'll need to learn how to make a loop.

## while loops

Need to loop some code? Use a while loop! The code in the code block `{}` will be looped as long as the while loop condition remains true.

While a toaster is ON the heating elements change in temperature and get hotter. Pretend `getTemperature()` is a function that gets the temperature from the toaster's temperature sensor.

```java
int toastLevel = 70; // default amount before toasting

// more heat is required to toast frozen bread
if (defrost == true) {
	toastLevel = 0;
}

turnToasterOn();
// loops while toastLevel is below 1000
while (toastLevel < 1000) {
	int heat = getTemperature();
	toastLevel = toastLevel + heat; // add additional heat to toastLevel
}

System.out.println("Toast is ready!");
turnToasterOff();
```

## Checking for Inequivalence

Not equals `!=` checks if something is not equal to something else.

```java
if (value != 0) {
	// check to see if value is not 0
}
```

## Scopes

Note that if you declare a variable in a code block it will only be available from the beginning to the end of the block. This is the scope of a variable.

```java
if (orderNumber == 163) {
	String message = orderNumber + " your order is ready!";
}

System.out.println(message); // ERROR: message is not defined
```

Fix this by initializing `message` outside of the if statement.

```java
String message;
if (orderNumber == 163) {
	message = orderNumber + " your order is ready!";
}

System.out.println(message); // good!
```

## End of Level 00 B

Here's a summary of everything we learned about:

- while loops
- more about code blocks/scopes `{}`

## Computer History: Casio FX-720P

This level's computer was inspired by the Casio FX-720P, which could run programs in a programming language called BASIC. Portable programmable calculators were limited by their small button keyboards and display limitations, but when slotted into a dock that had little printer, they could be used to print out graphs and many lines of text. The calculator could also load programs from tape cassettes.

<https://youtu.be/d3NIe1jTZMc?t=760>

- [Level 00 A](#level-00-a)
  - [What is Computer Science?](#what-is-computer-science)
  - [What is QuintOS?](#what-is-quintos)
  - [Creating Variables 🔡](#creating-variables-)
    - [Changing a variable's value](#changing-a-variables-value)
  - [Types of Variables 🔡](#types-of-variables-)
    - [Numbers](#numbers)
    - [Boolean](#boolean)
    - [Characters](#characters)
    - [String](#string)
  - [Camel Case 🐫](#camel-case-)
  - [Mathematical operators 🔢](#mathematical-operators-)
  - [Checking Equivalence ✅](#checking-equivalence-)
  - [Boolean operators 🐰](#boolean-operators-)
    - [functions](#functions)
  - [Globals 🌐](#globals-)
  - [System](#system)
  - [Scanner](#scanner)
  - [End of Level 00 A](#end-of-level-00-a)
- [Level 00 B](#level-00-b)
  - [while loops](#while-loops)
  - [Checking for Inequivalence](#checking-for-inequivalence)
  - [Scopes](#scopes)
  - [End of Level 00 B](#end-of-level-00-b)
  - [Computer History: Casio FX-720P](#computer-history-casio-fx-720p)
