# Level 02 A

![](https://elasticbeanstalk-us-east-2-651921832906.s3.us-east-2.amazonaws.com/QuintOS/bootScreen5.jpg)

## Creating functions 👷

How do we create our own functions? Use the `void` keyword to create a basic function that returns nothing. After `void` put the name of the function followed by the parenthesis. The function's code goes in the code block.

```java
// create the function
void sayHello() {
	System.out.println("hello!");
}

sayHello(); // run the function
```

The code inside a function is not run until the function is called/invoked by using its name and the parenthesis.

## What are Processing and p5play?

To make Pong we're going to use Processing Java, a 2D graphics library for creative coding!

Behind the scenes, QuintOS is actually using p5.js though, the JavaScript version of Processing. p5play is a JavaScript library for making games, that can be used in Java via the magic of QuintOS.

## Processing Basics

You need to make two functions, `setup` and `draw`, in your Processing programs.

The Processing `setup` function is run by Processing once at the start of the game and should contain code for creating all the sprites and setting their initial positions.

The Processing `draw` function should contain code for drawing an image (frame). Behind the scenes, Processing will run it 60 times per second, this is called the frame rate. This allows you to move objects on the screen by animating them, moving them a little bit when each new frame is drawn to the screen.

## Canvas

`new Canvas(width, height)` creates a new canvas, the visible area of the game. In QuintOS the canvas is created for you.

Note that `canvas.w` and `canvas.h` can be used to refer to the size of the screen in pixels.

## p5play Sprites

Sprites are characters or items in 2D video games that typically move above the background layer(s).

```java
Sprite sprite = new Sprite();
sprite.x = 5;
sprite.y = 12;
```

Sprite objects in Processing have attributes such as their x and y position. A sprite's x position is its horizontal position on the screen. A sprite's y position is its vertical position on the screen.

## Getting a Sprite's width and height

When you create a sprite using an image the width and height of the sprite is automatically assigned to the sprite based on the size of the image. These attributes can be accessed using `.width` and `.height` or with `.w` and `.h`

```java
System.out.println("size of the paddle: " + paddle.w + "x" + paddle.h);
```

## Moving a Sprite

One of the ways that sprites can be moved is by changing their direction and speed properties.

```java
ball.direction = 20;
ball.speed = 1;
```

## spriteArt

Processing has it's own `createImage` function, but it's a bit complicated. I created a simple `spriteArt` function for QuintOS that we can use to make sprites for our games very easily!

The first parameter to `spriteArt` is a String representing the color values of pixels.

```java
PImage img = spriteArt("wgw");
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

# Level 02 B

## sprite collider

By default when sprites collide both objects will move. That's because sprites have a dynamic collider by default.

There are two other types of colliders: `static` and `kinematic`. Sprites with static colliders can't be moved at all. Sprites with kinematic colliders can be moved programmatically, but not by other sprites.

```java
paddle.collider = "kinematic";
```

## Vectors

In Physics a vector is a direction in which something is moving and the magnitude of how fast it's moving there at a given interval of time.

In 2D (two dimensional) games, a sprite's vector can be stored as the velocity at which a sprite is moving along the x-axis and the velocity it's moving along the y-axis per frame. The ball's speed is the combination of these velocities.

```java
ball.velocity.x = 1;
ball.velocity.y = 1;
// you can also use "vel" instead of "velocity"
ball.vel.x = 1;
ball.vel.y = 1;
```

## Keyboard input

The `kb` object has a `pressing` function that can be used to check if a key is user is pressing a key.

```java
void draw() {
	if (kb.pressing("arrowLeft")) {
		player.vel.x = -2; // move the player left by 2 pixels each frame
	}
	if (kb.pressing("arrowRight")) {
		player.vel.x = 2; // move the player right by 2 pixels each frame
	}
}
```

# Level 02 C

## Drawing text to the screen

In QuintOS, text can be displayed at a specified row and column on the screen.

```java
// (text         , row, col)
txt("Hello World!", 10, 12);
```

Note that the (row, col) dimensions of the screen are different than its (x, y) pixel coordinates.

# Level 02 D

## Custom collision handling

In p5play it's easy to change what happens after two sprites collide using the `collided` function inside the p5.js draw function.

```java
if (laser.collided(shield)) {
	laser.direction = 20;
	laser.speed = 1;
}
```

In this example code, the laser gets deflected upward after hitting the shield.

## End of Level 02

## Computer History: ZX Spectrum

Excerpt from the last paragraph of Chapter 1 of "ZX81 BASIC PROGRAMMING" by Stephen Vickers:

"Whatever else you do, keep using the computer. If you have a question 'What does it do if I tell it such & such?' then the answer is easy:type it in & see. Whenever the manual tells you to type something in, always ask yourself, 'What could I type instead?' & try out your replies. The more of your own stuff you write, the better you will understand the ZX81. (This is called un-programmed learning.) Regardless of what you type in, you cannot damage the computer."

This level's computer is based on the ZX Spectrum, an 8-bit personal home computer developed by Sinclair Research. It was first released in the United Kingdom on the 23rd of April 1982 and went on to become Britain's best-selling microcomputer. Watch some of this video to hear what it was like for people to use the ZX Spectrum back then!

https://youtu.be/nRlmTiynbd8?t=242

- [Level 02 A](#level-02-a)
  - [Creating functions 👷](#creating-functions-)
  - [What are Processing and p5play?](#what-are-processing-and-p5play)
  - [Processing Basics](#processing-basics)
  - [Canvas](#canvas)
  - [p5play Sprites](#p5play-sprites)
  - [Getting a Sprite's width and height](#getting-a-sprites-width-and-height)
  - [Moving a Sprite](#moving-a-sprite)
  - [spriteArt](#spriteart)
  - [Making Strings with Triple Quotes](#making-strings-with-triple-quotes)
  - [spriteArt scaling](#spriteart-scaling)
  - [String.repeat(amount)](#stringrepeatamount)
- [Level 02 B](#level-02-b)
  - [sprite collider](#sprite-collider)
  - [Vectors](#vectors)
  - [Keyboard input](#keyboard-input)
- [Level 02 C](#level-02-c)
  - [Drawing text to the screen](#drawing-text-to-the-screen)
- [Level 02 D](#level-02-d)
  - [Custom collision handling](#custom-collision-handling)
  - [End of Level 02](#end-of-level-02)
  - [Computer History: ZX Spectrum](#computer-history-zx-spectrum)

```

```
