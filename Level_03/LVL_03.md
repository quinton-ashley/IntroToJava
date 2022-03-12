# Level 03 A

![](https://elasticbeanstalk-us-east-2-651921832906.s3.us-east-2.amazonaws.com/QuintOS/bootScreen2.jpg)

## Coding Philosophy: Naming variables

Good code should be easy for other programmers (humans) to read and efficient for your computer to run. Here are some guidelines for how to write good code!

Above all, it's important to put effort into thinking of GOOD names for your variables. Good variable names in Javascript are short and concise descriptors. Write sufficiently detailed comments in your code too.

## String.split(seperator)

Strings have a lot of useful functions we can use. Oracle is a really great resource for learning Java. Documentation for the String class can be found here:

<https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html>

`.split(String regex)` splits a String by a pattern creating an array of Strings

```java
// split by " " to get an array of words
"the red fox".split(" ");
// -> ["the", "red", "fox"]
```

## Accessing items in an Array

The `[]` square brackets are used to create arrays and are also used to access items in an array.

```java
String[] names = new String[]{"Amy", "Ellie", "Max"};
int[] nums = new int[]{50, 21, 46, 83};

System.out.println(names[0]); // prints "Amy"
System.out.println(nums[1]); // prints 21
```

Items in an array can also be edited using `[]` (aka sub or at).

```java
names[2] = "Ben";
// edits the list: "Amy", "Ellie", "Ben"
nums[1] = 36;
// edits the list: 50, 36, 42, 83
```

## Getting String input from the user

You can get a String from the user via the standard input, `System.in`, by using the `nextLine` method of the Scanner class.

```java
Scanner sc = new Scanner(System.in);

System.out.println("What's your name?");
String name = sc.nextLine();
```

# Level 02 B

## Getting the length of a String

`.length` is used to get the amount of items in an array but in Java you must use the `.length()` function to get the amount of characters in a String.

## Create an array of characters from a String

This example creates an array of characters from a String that contains the english alphabet.

```java
char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
```

# Level 03 C

## Accessing characters in a String

Remember that the data type `char` stores a single character but a String can store many characters.

To access characters in a String you should use the `charAt` method. Note that you can't edit them like you can with arrays.

```java
String animal = "the red fox";
char c = animal.charAt(4);
System.out.println(c); // prints 'r'

animal[8] = 'b'; // ERROR: will not change fox String to 'the red box'
animal = "the red box"; // this will work!
```

Strings are immutable, meaning individual characters in the String can not be changed.

## Counting with while loops

The number of loops a while loop does can be counted with a variable.

```java
String[] names = new String[]{"Jake", "Ali", "Ben", "Cam"};

int i = 0; // initialize i to 0

// loop while i is less than names.length which is 4
while (i < names.length) {
	// print the next name in the list
	System.out.println(i + '. ' + names[i]);

	i = i + 1;
} // in this loop i goes up from 0 to 1 to 3
```

The code above prints out a numbered list of names in the Java console.

```txt
0. Jake
1. Ali
2. Ben
3. Cam
```

# Level 03 D

## for loops

Scroll up and take another look at the example of the while loop with a counter variable, then check out this for loop! It does the same thing but all the steps related to the index variable are written as one line. The order of their operation is still the same.

```java
String[] names = new String[]{"Jake", "Ali", "Ben", "Cam"};

// (INITIALIZER; CONDITION; INCREMENATION)
for (int i = 0; i < names.length; i++) {
	// print the next name in the list
	System.out.println(i + '. ' + names[i]);
}
```

When the for loop starts `i` is set to 0, then is check the condtion. If the condition is true the for loop runs for the first time, this is called an iteration. When the for loop ends, the incrementor section of the for loop is run, in this case `i++` which increases the value of `i` by 1. The condition is checked again, if true the for loop will repeat again, doing another iteration. Until the condition is false the for loop will continue to repeat.

The code above prints out a numbered list of names in the Java console.

```txt
1. Jake
2. Ali
3. Ben
4. Cam
```

# Level 04 E

## String equals

Unfortunately in Java, Strings can't be checked if one is equal to another using double equals `==`. Only primitive types like `int` can be compared directly with the `==`. In Java, Objects like Strings must be compared using the Object's `.equals()` method.

Take a look at the example below which assigns a color to the variable `fruitColor` based on the name of the `fruit`.

```java
String fruitColor;

// if the fruit is a banana
if (fruit.equals("banana")) {
	// set the fruitColor to yellow
	fruitColor = "yellow";
}
```

## Breaking out of a loop early

Take a look at this example code that searches for the Ace of Spades in a deck of cards.

```java
String card; // no card picked yet

while (card != "Ace of Spades") {
	card = pickACard();
}

System.out.println("Found the Ace of Spades!");
```

If there are no cards left in the deck, the Ace of Spades can not be found. The while loop would keep looping infinitely! Let's imagine the `pickACard` function would return `null`, a special value that means none if there are no cards left in the deck. The while loop condition would remain true forever, so the loop must be exited early by using the `break` keyword.

```java
String card;

while (!card.equals("Ace of Spades")) {
	card = pickACard();

	if (card == null) {
		break; // exit the while loop
	}
}

if (card.equals("Ace of Spades")) {
	System.out.println("Found the Ace of Spades!");
} else {
	System.out.println("The Ace of Spades was not in the deck!");
}
```

## Computer History: Apple II

This level's computer was inspired by the Apple II. Check out this video about it if you'd like!

https://www.youtube.com/watch?v=CxJwy8NsXFs

- [Level 03 A](#level-03-a)
	- [Coding Philosophy: Naming variables](#coding-philosophy-naming-variables)
	- [String.split(seperator)](#stringsplitseperator)
	- [Accessing items in an Array](#accessing-items-in-an-array)
	- [Getting String input from the user](#getting-string-input-from-the-user)
- [Level 02 B](#level-02-b)
	- [Getting the length of a String](#getting-the-length-of-a-string)
	- [Create an array of characters from a String](#create-an-array-of-characters-from-a-string)
- [Level 03 C](#level-03-c)
	- [Accessing characters in a String](#accessing-characters-in-a-string)
	- [Counting with while loops](#counting-with-while-loops)
- [Level 03 D](#level-03-d)
	- [for loops](#for-loops)
- [Level 04 E](#level-04-e)
	- [String equals](#string-equals)
	- [Breaking out of a loop early](#breaking-out-of-a-loop-early)
	- [Computer History: Apple II](#computer-history-apple-ii)
