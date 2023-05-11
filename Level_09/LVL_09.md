# Level 09 A

Upgrade to level 9! 🥳

# Level 09 B

## Nested for loops

A `for` loop inside a `for` loop? FORLOOPCEPTION! 😮

```java
for (int i = 0; i < 5; i++) {
	for (int j = 0; j < 5; j++) {
		// nested for loop
	}
}
```

`i` is commonly used to represent the index of the outer loop and `j` is commonly used to represent the index of the inner loop.

Each time the code in the outer loop is run, the inner loop will run completely. In the example above, the inner loop will run 5 times for each time the outer loop runs. The inner loop will run 25 times in total.

# Level 09 C

## Two Dimensional Arrays

A two dimensional array (aka 2D array) is an array of arrays.

```java
// red and black checkers on a checkerboard
char[][] board = new char[][] {
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

## 2D array access

How could we access the red piece on the top row?

```java
board[0][3]; // row is 0, column is 3
```

`board[0]` gets the first row in board array and the `[3]` after that gets us the piece at column 3 in that row array. How could we access the red piece in the middle of the board?

## Using nested for loops with 2D arrays

How could we use a nested for loop to clear the board of all the pieces by assigning a blank space " " to every element in the `board` array?

```java
for (int i = 0; i < rows; i++) {
	for (int j = 0; j < columns; j++) {
		board[i][j] = ' ';
	}
}
```

- [Level 09 A](#level-09-a)
- [Level 09 B](#level-09-b)
  - [Nested for loops](#nested-for-loops)
- [Level 09 C](#level-09-c)
  - [Two Dimensional Arrays](#two-dimensional-arrays)
  - [2D array access](#2d-array-access)
  - [Using nested for loops with 2D arrays](#using-nested-for-loops-with-2d-arrays)
