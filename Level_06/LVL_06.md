# Level 06 A

Before you can start working on the `TicTacToe` game, you'll have to prove your skills in Java.

// TODO

After you complete those challenges you can upgrade to level 6! 🥳

![](https://elasticbeanstalk-us-east-2-651921832906.s3.us-east-2.amazonaws.com/QuintOS/bootScreen4.jpg)

## Coding Philosophy: Part 1

Good code should be easy for other programmers (humans) to read and efficient for your computer to run. Here are some guidelines for how to write good code!

Above all, it's important to put effort into thinking of GOOD names for your variables. Good variable names in Javascript are short and concise descriptors. Write sufficiently detailed comments in your code too.

Try not to rewrite the same exact lines of code in different places, put that code chunk in a function and use that function instead. Likewise if you have a chunk of code and you want to do something only slightly different at another point in your program, make a function with input parameters for the thing(s) that make it different. If you have a code chunk inside a function that is unrelated to the name/description you gave that function, move that code into its own function.

## Return variables from a function

functions can return a variable (only one). What will the value of `upHigh` be?

```java
int gimmeFive() {
	return 5;
}

int upHigh = gimmeFive() + gimmeFive();
```

## Creating functions with input parameters

function with input parameters x and y, returns the value of x^2 \* y^2

```java
int doMyMathHomework(x, y) {
	return x * x * y * y;
}

doMyMathHomework(1, 3); // returns 9
doMyMathHomework(2, 5); // what does this return?
```

## Two Dimensional Arrays

A two dimensional array (aka 2D array) is an array of arrays.

```java
// red and black checkers on a checkerboard
char[][] board = new char[]{
	new char[]{' ', ' ', ' ', 'r', ' ', 'B', ' ', ' '},
	new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
	new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' ', 'r'},
	new char[]{' ', ' ', ' ', ' ', 'r', ' ', ' ', ' '},
	new char[]{' ', 'B', ' ', ' ', ' ', ' ', ' ', 'b'},
	new char[]{' ', ' ', 'b', ' ', ' ', ' ', 'b', ' '},
	new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
	new char[]{' ', ' ', ' ', ' ', 'b', ' ', 'b', ' '}
};
```

Two dimensional data, such as checker board piece positions, can be stored in two dimensional arrays. In the example `"r"` represents a single red piece, uppercase `"R"` represents a king (two stacked red pieces).

How could we access the red piece on the top row?

```java
board[0][3]; // row is 0, column is 3
```

`board[0]` gets the first row in board array and the `[3]` after that gets us the piece at column 3 in that row array. How could we access the red peice in the middle of the board?

## Nested for loops

A for loop inside a for loop? FORLOOPCEPTION! 😮

```java
for (int i = 0; i < rows; i++) {
	for (int j = 0; j < columns; j++) {
		// nested for loop
	}
}
```

How could we use a nested for loop to clear the board of all the pieces by assigning a blank space ' ' to every element in the `board` array?

## End of Level 06 A

- 2d Arrays
- nested for loops

- [Level 06 A](#level-06-a)
	- [Coding Philosophy: Part 1](#coding-philosophy-part-1)
	- [Return variables from a function](#return-variables-from-a-function)
	- [Creating functions with input parameters](#creating-functions-with-input-parameters)
	- [Two Dimensional Arrays](#two-dimensional-arrays)
	- [Nested for loops](#nested-for-loops)
	- [End of Level 06 A](#end-of-level-06-a)
