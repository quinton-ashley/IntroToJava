# Level 13 A

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
