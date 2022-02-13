# Level 08 A

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

## delay

Use the `delay` function to delay the rate at which letters are displayed.

```java
// you need to make the function asynchronous to use await
void takeFive() {
	System.out.println("start!");
	delay(5000); // waits for a delay of 5000ms aka 5 seconds
	System.out.println("5 seconds passed");
}

takeFive();
```

# Level 08 B

What if you need to make an array but you don't know what it will store or how big it will be beforehand?

Normal arrays have a size limit for adding new items. To add items to an array that is already full, the contents of that array would have to be transferred to a new larger array. `ArrayList` does this behind the scenes so that new items can be added seamlessly!

Here's an example of a wedding guest book. When guests arrive their name is added to the guestBook ArrayList.

```java
ArrayList<String> guestBook = new ArrayList<String>();

void guestArrived(String name) {
	guestBook.add(name);
}
```

Get the names of the first and last guests to arrive at the wedding using the `get` function instead of `[]` used for primitive arrays.

```java
String firstGuest = guestBook.get(0);
String lastGuest = guestBook.get(guestBook.size() - 1);
```
