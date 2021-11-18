# Level 16 A

## Node.js and npm

Node.js is a Javascript runtime based on Chrome's V8 Javascript engine that lets you interact with your computer's file system, among other things that you can't do with Javascript inside a web browser due to the security risk these features pose.

npm is the nodejs package manager. Javascript developers have posted a lot of Javascript packages on there.

## Creating your own QuintOS project!

Up until this point you've been remaking famous games to understand them on a deeper level and improve your coding skills. Now that you have reached the end of my Introduction to JavaScript course, I want to assist you in developing your own original game, program, or interactive art piece!

Check out the games I've made with QuintOS: PigeonSimulator and CosmicDebris.

Your game doesn't need to be super complex or have a lot of artwork or a massive story, but it does need to be unique and fun!

# Level 16 B

There remains only a few more notable bits of Javascript syntax you should learn about this point!

## Getters

Let's say you wanted to make a calculated property like area that could change if the box changes size.

```js
console.log('The area of box 0 is ' + box0.w * box0.h); // 20!
```

To get a calculated property like area, you can use a getter.

```js
class Rectangle {
	constructor(width, height) {
		this.x = 0;
		this.y = 0;
		this.w = width;
		this.h = height;
	}

	draw() {
		rect(this.x, this.y, this.w, this.h);
	}

	get area() {
		return this.w * this.h;
	}
}

let box0 = new Rectangle(5, 4);
console.log('The area is ' + box0.area); // 20
box0.w = 6; // change width to 6
console.log('Now the area is ' + box0.area); // 24
```

This example shows how the area will still be calculated correctly even after the width of the box changes.

## Switch statements

You will rarely need to use a switch statement instead of an if + else if chain, but in some cases they are useful.

```js
if (lbl == 'up' || lbl == 'down' || lbl == 'left' || lbl == 'right') {
	await this.move(lbl);
} else if (
	lbl == 'a' ||
	lbl == 'b' ||
	lbl == 'x' ||
	lbl == 'y' ||
	lbl == 'l' ||
	lbl == 'r' ||
	lbl == 'lt' ||
	lbl == 'rt' ||
	lbl == 'select' ||
	lbl == 'start'
) {
	await this.doAction(lbl);
} else {
	if (this.opt.v) log('cui: button does nothing');
	return;
}
```

This looks horrible

```js
switch (lbl) {
	case 'up':
	case 'down':
	case 'left':
	case 'right':
		await this.move(lbl);
		break;
	case 'a':
	case 'b':
	case 'x':
	case 'y':
	case 'l':
	case 'r':
	case 'lt':
	case 'rt':
	case 'select':
	case 'start':
		await this.doAction(lbl);
		break;
	default:
		if (this.opt.v) log('cui: button does nothing');
		return;
}
```

This example below will give the same results as the code above but uses array includes and regex instead of a switch statement. It is more compact, using 100 less characters but it is executed slower than using a switch statement.

```js
if (['up', 'down', 'left', 'right'].includes(lbl)) {
	await this.move(lbl);
} else if (/^(a|b|x|y|l|r|lt|rt|select|start)$/.test(lbl)) {
	await this.doAction(lbl);
} else {
	if (this.opt.v) log('cui: button does nothing');
	return;
}
```

```js
let directionalBtns = ['up', 'down', 'left', 'right'];
let otherBtns = ['a', 'b', 'x', 'y', 'l', 'r', 'lt', 'rt', 'select', 'start'];

if (directionalBtns.includes(lbl)) {
	await this.move(lbl);
} else if (otherBtns.includes(lbl)) {
	await this.doAction(lbl);
} else {
	if (this.opt.v) log('cui: button does nothing');
	return;
}
```

Most of the time you should just use

## Javascript's memory

https://codeburst.io/explaining-value-vs-reference-in-javascript-647a975e12a0

# Level 16 C

Congratulations you've almost completed my IntroToJS course! There are a few more things I think you should know about before you continue on to learn more advanced stuff.

## Google's zx

[zx](https://github.com/google/zx) which makes node.js scripting on your computer easier.

## Electron

Electron is a desktop app library that lets you create apps using HTML+CSS+JS!

## ReactJS

With ReactJS you can create mobile apps using HTML+CSS+JS.

## Other resources of potential interest

[Article: More about JavaScript](https://github.com/MarcoWorms/learn.js)
[Video: How spritesheet animation works](https://www.youtube.com/watch?v=CY0HE277IBM)
[Video: Aseprite Animation Beginner Tutorial](https://www.youtube.com/watch?v=N4Z4MdZ1KWY)
[Tutorials: Make 3D games with Babylon](https://doc.babylonjs.com/start)
[Course: freeCodeCamp](https://github.com/mcturner1995/freeCodeCamp)
[Video: Explanation of what .exe files are and how computer processors execute assembly](https://www.youtube.com/watch?v=hhgxsrAFyz8)
[Video: AI Sudoku solver in python](https://www.youtube.com/watch?v=G_UYXzGuqvM)

- [Level 16 A](#level-16-a)
  - [Node.js and npm](#nodejs-and-npm)
  - [Creating your own QuintOS project!](#creating-your-own-quintos-project)
- [Level 16 B](#level-16-b)
  - [Getters](#getters)
  - [Switch statements](#switch-statements)
  - [Javascript's memory](#javascripts-memory)
- [Level 16 C](#level-16-c)
  - [Google's zx](#googles-zx)
  - [Electron](#electron)
  - [ReactJS](#reactjs)
  - [Other resources of potential interest](#other-resources-of-potential-interest)

```

```
