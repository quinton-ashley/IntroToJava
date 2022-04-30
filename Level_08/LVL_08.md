# Level 08 A

## Coding Philosophy: How to approach complex problems

Solve complex problems by thinking algorithmically! That means breaking problems down step by step. "A journey of a thousand miles begins with a single step". If you get stuck on a problem you may be overcomplicating it. Keep things as simple as possible at first and test often after adding new code! Doing this will help prevent you from getting stuck.

# Level 08 B

## eraseRect

```java
eraseRect(row, col, w, h);
```

Erases text within the specified rectangle.

## textRect

Make boxes using `textRect(row, col, w, h)` around the blank spaces and letters just like in the Wheel of Fortune TV show.

```java
textRect(5, 5, 3, 3); // make a 3x3 rect at row 5 column 5 (5,5)
text("w", 6, 6); // make letter 'w' at row 6 column 6 (6,6)
```

Use `for` loops to make all the boxes for the phrase!

```txt
┌─┐┌─┐┌─┐┌─┐┌─┐
│W││h││e││e││ │
└─┘└─┘└─┘└─┘└─┘
```

# Level 08 C

## delay

Use the `sleep` function of the `Thread` class to delay the rate at which letters are displayed.

```java
// you need to make the function asynchronous to use await
void takeFive() {
	System.out.println("start!");
	try {
			// waits for a delay of 5000ms aka 5 seconds
			Thread.sleep(1000);
	} catch (InterruptedException e) {
		System.err.println("delay failed");
	}
	System.out.println("5 seconds passed");
}

takeFive();
```

## toUpperCase and toLowerCase String

```java
String str = 'Hello!';
String up = str.toUpperCase(); // up -> "HELLO!"
String low = str.toLowerCase(); // low -> "hello!"
```

These functions do not change the original value of the string.

## replace String

```java
String str = 'The cat jumped over the moon. The cat meowed.';
String result = str.replace("cat", "dog");
System.out.println(result);
// -> "The dog jumped over the moon. The cat meowed."
```

This function takes two input parameters, the first input parameter is replaced in the string by the second. Note that it only does one replacement.

This function does not change the original value of the string.

## substring String

```java
str.substring(start, end);
```

This function returns a subsection of the string, starting at the start index and ending and the end index. It does not change the original value of the string. The `end` index is optional.

# Level 08 D

## ArrayList remove

You can also easily removes items from an ArrayList using the `remove` method.

```java
guestBook.remove(name);
```
