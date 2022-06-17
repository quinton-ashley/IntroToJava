# Level 09 A

## Loading and Playing Sounds

Example code for playing a jump sound when the player jumps:

```java
SoundFile jumpSound; // class variable

void preload() {
	// QuintOS.dir is the game folder
	jumpSound = loadSound(QuintOS.dir + "/sounds/jumpSound_92.mp3");
	jumpSound.setVolume(0.3); // 0.0-1.0
}

void keyPressed() {
	if (key == ' ') {
		jumpSound.play();
	}
}
```

## overlap

You can disable collisions between sprites by using the overlap function.

```java
spriteA.overlap(spriteB);
spriteA.overlap(spriteC);
```

spriteB will still collide with spriteC.

## collide/overlap with callback

You can add a callback function to `collide` and `overlap` that gets run when a sprite collides or overlaps with another sprite.

```java
ball.collide(paddle, () -> {
	System.out.println("ball bounced!");
});
```

# Level 09 B

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
