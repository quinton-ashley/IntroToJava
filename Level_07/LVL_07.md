# Level 07 A

## toUpperCase and toLowerCase String

```java
String str = 'Hello!';
String up = str.toUpperCase(); // up -> 'HELLO!'
String low = str.toLowerCase(); // low -> 'hello!'
```

These functions do not change the original value of the string.

# Level 07 B

## File Paths in Java

You can read the data from a file in Java by using a Scanner object.

```java
File file = new File("games_java/Game/file.txt");

Scanner fileScanner;
try {
	fileScanner = new Scanner(file);
} catch (FileNotFoundException e) {
	e.printStackTrace();
	return;
}

String data = "";

while (fileScanner.hasNextLine()) {
	data += fileScanner.nextLine();
}

fileScanner.close();
```

Use `Scanner` with a `File` object to read the file.

# Level 07 C

## Return variables from a function

functions can return a variable (only one). What will the value of `upHigh` be?

```java
int gimmeFive() {
	return 5;
}

int upHigh = gimmeFive() + gimmeFive();
```

Note that the function's return type is `int`.

## Creating functions with input parameters

function with input parameters x and y, returns the value of x^2 \* y^2

```java
int doMyMathHomework(int x, int y) {
	return x * x * y * y;
}

int result0 = doMyMathHomework(1, 3); // returns 9
int result1 = doMyMathHomework(2, 5); // what does this return?
```

## Coding Philosophy: Using functions effectively

Try not to rewrite the same lines of code in different places, put that code in a function instead. If you have a chunk of code and you need to do something only slightly different at another point in your program, sometimes you should make a function with input parameters for the thing(s) that are different. Typically functions should only contain code that is related to the name/description you gave that function, move unrelated code into its own function.
