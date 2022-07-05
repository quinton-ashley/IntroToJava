# Level 07 A

## ArrayList

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

Note that ArrayLists can not store primitive data types: int, float, double, and boolean. You will have to use Objects that store these primitive types: Integer, Float, Double, and Boolean.

## ArrayList remove

You can also easily removes items from an ArrayList using the `remove` method.

```java
guestBook.remove(name);
```

## Creating Classes

Classes in Java are like blueprints that can be used to create objects. A class defines all the properties and functions

Let's take a look at how we could use an object to store attributes about Gumball, a character from the Cartoon Network show The Amazing World of Gumball.

```java
class Student {
	String[] name;
	String species;
	int age;
	int grade;
	String studentID;

	Student(String[] name, String species, int age, int grade, String studentID) {
		this.name = name;
		this.species = species;
		this.age = age;
		this.grade = grade;
		this.studentID = studentID;
	}
}

Student gumball = new Student(new String[] {"Gumball", "Tristopher", "Watterson"},
	"cat", 12, 7, "000029083");
```

Properties can be accessed using the dot syntax.

```java
gumball.age; // -> 12

gumball.name[2]; // -> "Watterson"

// edit gumball's grade level
gumball.grade = 8;
```

This kind of programming is called object-oriented programming. Since this mode of thinking is similar to how us humans perceive objects in real life it makes it easier to use them when coding.
