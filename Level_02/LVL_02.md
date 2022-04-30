# Level 02 A

![](https://elasticbeanstalk-us-east-2-651921832906.s3.us-east-2.amazonaws.com/QuintOS/bootScreen5.jpg)

## What is Processing?

To make Pong we're going to use Processing, a 2D graphics library for creative coding!

## Creating functions 👷

How do we create our own functions? Use the `void` keyword to create a basic function that returns nothing. After `void` put the name of the function followed by the parenthesis. The function's code goes in the code block.

```java
// create the function
void sayHello() {
	System.out.println('hello!');
}

sayHello(); // run the function
```

The code inside a function is not run until the function is called/invoked by using its name and the parenthesis.

## Processing Basics

You need to make two functions, `setup` and `draw`, in your Processing programs.

The Processing `setup` function is run by Processing once at the start of the game and should contain code for creating all the sprites and setting their initial positions.

The p5.js `draw` function should contain code for drawing an image (frame). Behind the scenes, p5.js will run it 60 times per second, this is called the frame rate. This allows you to move objects on the screen by animating them, moving them a little bit when each new frame is drawn to the screen.

## p5.play Sprites

Sprites are characters or items in 2D video games that typically move above the background layer(s).

```java
Sprite sprite = createSprite(img);
sprite.x = 5;
sprite.y = 12
```

Sprite objects in Processing have attributes such as their x and y position. A sprite's x position is its horizontal position on the screen. A sprite's y position is its vertical position on the screen.

## spriteArt

Processing has it's own `createImage` function, but it's a bit complicated. I created a simple `spriteArt` function for QuintOS that we can use to make sprites for our games very easily!

The first parameter to `spriteArt` is a String representing the color values of pixels.

```java
PImage img = spriteArt('wgw');
```

This example code would create an image with one white pixel, followed by a green pixel, and then another white pixel.

Here's the limited color palette you can use for this game. They are the same colors as the real ZX Spectrum, which this level's computer is based on.

|   letter   |     color      |
| :--------: | :------------: |
| '.' or ' ' | transparent 🔳 |
|    'b'     |    Black ⬛    |
|    'u'     |    blUe 🟦     |
|    'r'     |     Red 🟥     |
|    'm'     |   Magenta 🔴   |
|    'g'     |    Green 🟩    |
|    'c'     |    Cyan 🔵     |
|    'y'     |   Yellow 🟨    |
|    'w'     |    White ⬜    |

## Making Strings with Triple Quotes

When triple quotes are used to create Strings, the text inside them can go on multiple lines of code and retain these newlines without the use of the newline `\n` character.

```java
String str = """
...yyyy
.yybyybyy
yyyyyyyyyy
yybyyyybyy
.yybbbbyy
...yyyy""";

PImage bigImg = spriteArt(str);
```

Can you tell what the image is?

...

It's a simple yellow and black smiley face image. 😃

## p5.js global variables

Note that p5.js adds a lot of variables to the global scope. Note that `width` and `height` refer to the size of the screen in pixels.

# Level 02 B

# Getting a Sprite's width and height

When you create a sprite using an image the width and height of the sprite is automatically assigned to the sprite based on the size of the image. These attributes can be accessed using `.width` and `.height` or with `.w` and `.h`

```java
System.out.println("size of the ball: " + ball.w + "x" + ball.h);
```

## spriteArt scaling

By default each character in the string will be one pixel in the resulting sprite art image. Yet, if you change the scale to 2 then each character in the string will be represented by 4 pixels! This is useful for making larger images.

```java
PImage face = spriteArt(str, 2);
```

The second input parameter to the `spriteArt` function is an optional scale value. Input parameters are separated by commas.

## String.repeat(amount)

To more easily create large Strings you can use a String function called [repeat](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html)

```java
String pattern = "><".repeat(4);
// pattern -> "><><><><";
```

## += operator

The `+=` operator can be used to add to the existing value of a variable.

```java
String story = "The cow";
story += " jumped over the moon.";
// story -> "The cow jumped over the moon"
```

You can use `+=` with numbers too!

````java
int x = 5;
x += 2;
System.out.println(x); // x -> 7
```

`-=`, `*=`, and `/=` operators can also be used with numbers.

## colorPal

`colorPal` retrieves the color associated with the given letter from the retro computer's color palette. Here's some example code for making a red background:

```java
background(colorPal('r'));
````

# Level 02 C

## Vectors

In Physics a vector is a direction in which something is moving and the magnitude of how fast it's moving there at a given interval of time.

In 2D (two dimensional) games, a sprite's vector can be stored as the velocity at which a sprite is moving along the x-axis and the velocity it's moving along the y-axis per frame. The ball's speed is the combination of these velocities.

```java
ball.velocity.x = 1;
ball.velocity.y = 1;
```

## Bounces

You can easily check for bounces between sprites using the p5.play sprite bounce function inside the `draw` function.

```java
ball.bounce(paddle);
```

## Immovable objects

By default when sprites bounce off each other both objects will move. To prevent this, set the sprite to be immovable when another sprite bounces on it.

```java
paddle.immovable = true;
```

# Level 02 D

## Respond to keyboard input

The `keyPressed` is a Processing function that is run whenever a key is pressed.

```java
void keyPressed() {
	if (key.equals("w")) {
		System.out.println("The 'w' key was pressed!");
	}
}
```

Implement `keyPressed` outside the `draw` function.

## Check if a key is held

```java
void draw() {
	if (isKeyDown("ArrowLeft")) {
		player.x -= 2; // move the player left by 2 pixels
	}
	if (isKeyDown("ArrowRight")) {
		player.x += 2; // move the player right by 2 pixels
	}
}
```

## Drawing text to the screen

Text can be displayed on screen at a given text row and column.

```java
//  (text         , row, col)
text("Hello World!", 10, 12);
```

## Level 02 E

## Processing Java fill, stroke, and rect

This example `draw` function draws a black background and then a blue rectangle with a red stroke (outline). The `colorPal` function can be use it inside p5.js functions like `background`, `fill`, and `stroke` that expect a color.

```java
void draw() {
	background(colorPal('b'));

	fill(colorPal('u'));
	stroke(colorPal('r'));

	//  ( x,  y,  w,  h)
	rect(10, 20, 15, 55);
}
```

## Computer History: ZX Spectrum

Excerpt from the last paragraph of Chapter 1 of "ZX81 BASIC PROGRAMMING" by Stephen Vickers:

"Whatever else you do, keep using the computer. If you have a question 'What does it do if I tell it such & such?' then the answer is easy:type it in & see. Whenever the manual tells you to type something in, always ask yourself, 'What could I type instead?' & try out your replies. The more of your own stuff you write, the better you will understand the ZX81. (This is called un-programmed learning.) Regardless of what you type in, you cannot damage the computer."

This level's computer is based on the ZX Spectrum, an 8-bit personal home computer developed by Sinclair Research. It was first released in the United Kingdom on the 23rd of April 1982 and went on to become Britain's best-selling microcomputer. Watch some of this video to hear what it was like for people to use the ZX Spectrum back then!

https://youtu.be/nRlmTiynbd8?t=242

- [Level 02 A](#level-02-a)
  - [What is Processing?](#what-is-processing)
  - [Creating functions 👷](#creating-functions-)
  - [Processing Basics](#processing-basics)
  - [p5.play Sprites](#p5play-sprites)
  - [spriteArt](#spriteart)
  - [Making Strings with Triple Quotes](#making-strings-with-triple-quotes)
  - [p5.js global variables](#p5js-global-variables)
- [Level 02 B](#level-02-b)
- [Getting a Sprite's width and height](#getting-a-sprites-width-and-height)
  - [spriteArt scaling](#spriteart-scaling)
  - [String.repeat(amount)](#stringrepeatamount)
  - [+= operator](#-operator)
  - [Bounces](#bounces)
  - [Immovable objects](#immovable-objects)
- [Level 02 D](#level-02-d)
  - [Respond to keyboard input](#respond-to-keyboard-input)
  - [Check if a key is held](#check-if-a-key-is-held)
  - [Drawing text to the screen](#drawing-text-to-the-screen)
  - [Level 02 E](#level-02-e)
  - [Processing Java fill, stroke, and rect](#processing-java-fill-stroke-and-rect)
  - [Computer History: ZX Spectrum](#computer-history-zx-spectrum)
