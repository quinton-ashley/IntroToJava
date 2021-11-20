# Level 02 A

![](https://elasticbeanstalk-us-east-2-651921832906.s3.us-east-2.amazonaws.com/QuintOS/bootScreen5.jpg)

## What is Processing?

To make Pong we're going to use 2D graphics instead of text based graphics. Processing is a Java graphics library for creative coding, with a focus on making coding accessible and inclusive for artists, designers, educators, beginners, and anyone else!

## Creating functions 👷

How do we create our own functions? Use the `void` keyword to create a function that returns nothing. After `void` put the name of the function followed by the parenthesis. The function's code goes in the code block.

```java
// create the function
void sayHello() {
	System.out.println('hello!');
}

sayHello(); // run the function
```

The code inside a function is not run until the function is called/invoked by using it's name and the parenthesis.

## Processing Basics

You need to make two functions, `setup` and `draw`, in your Processing programs.

The Processing `setup` function is run once at the start of the game and should contain code for setting up the game, such as setting the inital positions of everything in the game.

The Processing `draw` function should contain code for drawing an image (frame). It will be run 60 times per second, this is called the frame rate. To animate objects on screen simply change their position everytime the draw function is run.

## spriteArt

Processing has it's own `createImage` function, but it's a bit complicated. I created a simple `spriteArt` function for QuintOS that we can use to make sprites for our games very easily!

The first parameter to `spriteArt` is a string representing the color values of pixels.

```java
PImage img = spriteArt('w.w');
```

This example code would create an image with one white pixel, followed by a transparent pixel, and then another white pixel. You can also use spaces to indicate transparent pixels.

Here's the full color palette you can use for this game. They are the same colors as the real ZX Spectrum, which this level's computer is based on.

| letter |     color      |
| :----: | :------------: |
|   .    | transparent 🔳 |
|   b    |    Black ⬛    |
|   u    |    blUe 🟦     |
|   r    |     Red 🟥     |
|   m    |   Magenta 🔴   |
|   g    |    Green 🟩    |
|   c    |    Cyan 🔵     |
|   y    |   Yellow 🟨    |
|   w    |    White ⬜    |

## Making Strings with Triple Quotes

When triple quotes are used to create strings, the text inside them can go on multiple lines of code and retain these newlines without the use of the newline `\n` character.

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

It's a simple yellow and black smiley face image. 😃

Note that you don't have to complete the width of each line with transparent pixels, you can just leave it blank.

## Repeat

To more easily create large strings you can use a String function called repeat.

```java
String pattern = '><'.repeat(4);
// pattern -> '><><><><';
```

## p5.play Sprites

To make Pong you'll need to have the ball move and bounce off the paddles. To acheive this use sprites!

Sprite objects have attributes such as their x and y position.

```java
Sprite ball = createSprite(imgBall);
ball.x = width / 2;
ball.y = height / 2;
```

Note that `width` and `height` refer to the size of the screen in pixels.

When you create a sprite using an image the width and height of the sprite is automatically assigned to the sprite based on the size of the image. They can be accessed using `.w` and `.h`

```java
System.out.println("size of the ball: " + ball.w + "x" + ball.h);
```

## End of Level 02 A

Here's what you learned about in Level 2:

- Processing basics
- the `spriteArt` function
- the `repeat` string function
- how to create sprites and position them

# Level 02 B

# Level 02 B

Checking for intersections between the ball and paddle is harder because they are both moving objects.

## Vectors

To finish Pong, we'll have to use Math "in real life"! How exciting! 😄

In Physics a vector is a direction in which something is moving and the magnitude of how fast it's moving there at a given interval of time.

In 2D (two dimensional) games, a sprite's vector can be stored as the velocity at which a sprite is moving along the x-axis and the velocity it's moving along the y-axis per frame. The ball's speed is the combination of these velocities.

```java
ball.velocity.x = 1;
ball.velocity.y = 1;
```

## Bounces

You can easily check for bounces between sprites using the p5.play sprite bounce function.

```java
ball.bounce(paddle);
```

## Immovable objects

By default when sprites bounce of each other both objects will move. To prevent this, set the sprite to be immovable when another sprite bounces on it.

```java
sprite.immovable = true;
```

## colorPal

`colorPal` retreives the color associated with the given letter from the retro computer's color palette. Here's some example code for making a red background:

```java
background(colorPal("r"));
```

## End of Level 02 B

- vectors (x and y velocities)
- check for bounces
- colorPal

## Computer History: ZX Spectrum

This level's computer is based on the ZX Spectrum, an 8-bit personal home computer developed by Sinclair Research. It was first released in the United Kingdom on 23 April 1982 and went on to become Britain's best-selling microcomputer.

- [Level 02 A](#level-02-a)
	- [What is Processing?](#what-is-processing)
	- [Creating functions 👷](#creating-functions-)
	- [Processing Basics](#processing-basics)
	- [spriteArt](#spriteart)
	- [Making Strings with Triple Quotes](#making-strings-with-triple-quotes)
	- [Repeat](#repeat)
	- [p5.play Sprites](#p5play-sprites)
	- [End of Level 02 A](#end-of-level-02-a)
- [Level 02 B](#level-02-b)
- [Level 02 B](#level-02-b-1)
	- [Vectors](#vectors)
	- [Bounces](#bounces)
	- [Immovable objects](#immovable-objects)
	- [colorPal](#colorpal)
	- [End of Level 02 B](#end-of-level-02-b)
	- [Computer History: ZX Spectrum](#computer-history-zx-spectrum)
