# Level 09 A

## Loading and Playing Sounds

Example code for playing a jump sound when the player jumps:

```java
void preload() {
	SoundFile jumpSound = loadSound('/sounds/jumpSound_92.mp3');
}

void keyPressed() {
	if (key == ' ') {
		jumpSound.play();
	}
}
```

## bounce callback

You can make a callback function for when a sprite bounces off another sprite.

```java
ball.bounce(paddle, () -> {
	System.out.println("ball bounced!");
});
```

# Level 09 B

## Adding properties to an existing object

Adding properties to an existing object is super easy, just give it a value as if the property already exisited!

```java
ball.active = true;
```

## Skip iterations of a for loop

Use `continue` to skip an iteration of a for loop but continue looping. Unlike `break` which is for exiting the loop early.

```java
for (int i = 0; i < 8; i++) {
	if (i == 2) {
		continue;
	}
	if (i > 5) {
		break;
	}
	System.out.println(i);
}
```

Console Output:

```txt
0
1
3
4
5
```
