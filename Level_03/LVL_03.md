# Level 03 A

## Accessing items in an Array

The `[]` square brackets are used to create arrays and are also used to access items in an array.

```java
String[] names = new String[]{"Amy", "Ellie", "Max"};
int[] nums = new int[]{50, 21, 46, 83};

System.out.println(names[0]); // prints the String "Amy"
System.out.println(nums[1]); // prints the int 21
```

## Editing items in an Array

Items in an array can also be edited using `[]` (aka sub or at).

```java
names[2] = "Ben"; // edits the item at position 2 in the names array
// names -> ['Amy', 'Ellie', 'Ben']

nums[1] += 4; // edits the item at position 1 in the nums array
// num -> [50, 25, 42, 83]
```

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

# Level 03 B

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

When the for loop starts `i` is set to 0, then is check the condition. If the condition is true the for loop runs for the first time, this is called an iteration. When the for loop ends, the incrementation section of the for loop is run, in this case `i++` which increases the value of `i` by 1. The condition is checked again, if true the for loop will repeat again, doing another iteration. Until the condition is false the for loop will continue to repeat.

The code above prints out a numbered list of names in the Java console.

```txt
1. Jake
2. Ali
3. Ben
4. Cam
```
