# Level 03 A

![](https://elasticbeanstalk-us-east-2-651921832906.s3.us-east-2.amazonaws.com/QuintOS/bootScreen2.jpg)

## Coding Philosophy: Naming variables

Good code should be easy for other programmers (humans) to read and efficient for your computer to run. Here are some guidelines for how to write good code!

Above all, it's important to put effort into thinking of GOOD names for your variables. Good variable names in Java are short and concise descriptors. Write sufficiently detailed comments in your code too.

## String.split(separator)

Strings have a lot of useful functions we can use. Oracle is a really great resource for learning Java. Documentation for the String class can be found here:

<https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html>

`.split(String regex)` splits a String by a pattern creating an array of Strings

```java
// split by " " to get an array of words
"the red fox".split(" ");
// -> ["the", "red", "fox"]
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

## Create an array with a fixed size

In Java, arrays must be created with a fixed size. This means you must know how many items you want to store in the array before you create it. You can't add more items to the array later.

```java
// create an array of 5 Strings
String[] names = new String[5];
```

# Level 03 C

## Accessing characters in a String

To access characters in a String you should use the `charAt` method. Note that you can't edit them like you can with arrays.

```java
String animal = "the red fox";
char c = animal.charAt(4);
System.out.println(c); // prints 'r'

animal[8] = 'b'; // ERROR: will not change fox String to 'the red box'
animal = "the red box"; // this will work!
```

Strings are immutable, meaning individual characters in the String can not be changed.

# Level 04 D

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

## Computer History: Apple II

This level's computer was inspired by the Apple II. Check out this video about it if you'd like!

https://www.youtube.com/watch?v=CxJwy8NsXFs

- [Level 03 A](#level-03-a)
  - [Coding Philosophy: Naming variables](#coding-philosophy-naming-variables)
  - [String.split(separator)](#stringsplitseparator)
  - [Getting String input from the user](#getting-string-input-from-the-user)
- [Level 02 B](#level-02-b)
  - [Getting the length of a String](#getting-the-length-of-a-string)
  - [Create an array with a fixed size](#create-an-array-with-a-fixed-size)
- [Level 03 C](#level-03-c)
  - [Accessing characters in a String](#accessing-characters-in-a-string)
- [Level 04 D](#level-04-d)
  - [String equals](#string-equals)
  - [Computer History: Apple II](#computer-history-apple-ii)
