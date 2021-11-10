# Level 03 A

![](https://elasticbeanstalk-us-east-2-651921832906.s3.us-east-2.amazonaws.com/QuintOS/bootScreen2.jpg)

## string.split(seperator)

Strings have a lot of useful functions we can use. MDN, the Mozilla Developer Network, is a really great resource for learning JS. Documentation for the String class can be found here:

<https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String>

`.split(char)` splits a string by a pattern creating an array of strings

```js
// split by ' ' to get an array of words
'the red fox'.split(' ');
// -> ['the', 'red', 'fox']
```

## array.join(separator)

The Array `join` function creates a string by joining each element in the array together, inserting an optional seperator string between each item.

```js
names.join(' ~ ');
// -> 'Amy ~ Ellie ~ Max'
```

## End of Level 03 A

We learned how to:

- make while loops with a counter variable
- split strings
- get a character at a specific index in a string

# Level 02 B

## Accessing items in an Array

The `[]` square brackets are used to create arrays and are also used to access items in an array.

```js
names[0]; // is 'Amy'
nums[1]; // is 21
```

Items in an array can also be edited using `[]` (aka sub).

```js
names[2] = 'Ben';
// edits the list: ['Amy', 'Ellie', 'Ben'];
nums[1] = 36;
// edits the list: [50, 36, 42, 83]
```

## Accessing characters in a String

To access characters in a string you can use `[]` but note that you can't edit them like you can with arrays.

```js
let fox = 'the red fox';
fox[4]; // is 'r'
fox[8] = 'b'; // error
// will not change fox string to 'the red box'
```

Strings are immutable, meaning individual characters in the string can not be changed.

## Counting with while loops

The number of loops a while loop does can be counted with a variable.

```js
let names = ['Jake', 'Ali', 'Ben'];

let i = 0; // initialize i to 0

// loop while i is less than names.length which is 3
while (i < names.length) {
	// print the next name in the list
	console.log(i + '. ' + names[i]);

	i = i + 1;
} // in this loop i goes up from 0 to 1 to 2
```

The code above prints out a numbered list of names in the JS console.

```txt
0. Jake
1. Ali
2. Ben
```

## Breaking out of a loop early

If you need to exit a while loop early, use the `break` keyword.

```js
break;
```

## End of Level 03 B

## Level 03 C

## String equals

Unfortunately in Java, Strings can't be checked if one is equal to another using double equals `==`. Only primitive types like `int` can be compared directly with the `==`. In Java, Objects like Strings must be compared using the Object's `.equals()` method.

Take a look at the example below which assigns a color to the variable `fruitColor` based on the name of the `fruit`.

```java
String fruitColor;

// if the fruit is a banana
if (fruit.equals("banana")) {
	// set the fruitColor to yellow
	fruitColor = "yellow";
} else if (fruit.equals("pear")) {
	// else if the fruit is a pear, set the fruitColor to green
	fruitColor = "green";
} else if (fruit.equals("orange")) {
	fruitColor = "orange";
} else if (fruit.equals("grape")) {
	fruitColor = "purple";
} else {
	// else the fruit was not a banana, pear, orange, or grape
	// the fruitColor is unknown
	fruitColor = "unknown";
}
```

## Computer History: Apple II

This level's computer was inspired by the [Apple II](https://www.youtube.com/watch?v=CxJwy8NsXFs)

- [Level 03 A](#level-03-a)
  - [string.split(seperator)](#stringsplitseperator)
  - [array.join(separator)](#arrayjoinseparator)
  - [End of Level 03 A](#end-of-level-03-a)
- [Level 02 B](#level-02-b)
  - [Accessing items in an Array](#accessing-items-in-an-array)
  - [Accessing characters in a String](#accessing-characters-in-a-string)
  - [Counting with while loops](#counting-with-while-loops)
  - [Breaking out of a loop early](#breaking-out-of-a-loop-early)
  - [End of Level 03 B](#end-of-level-03-b)
  - [Level 03 C](#level-03-c)
  - [String equals](#string-equals)
  - [Computer History: Apple II](#computer-history-apple-ii)
