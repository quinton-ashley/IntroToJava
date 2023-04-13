// screen resolution is 256x192

PImage imgBall = spriteArt("""
..wwww
.ww..ww
ww....ww
w......w
w......w
ww....ww
.ww..ww
..wwww""");

PImage imgPaddle = spriteArt(".wwwwww.\nwwwwwwww\n" + "www..www\nww.ww.ww\n".repeat(21) + "wwwwwwww\n.wwwwww.");

Sprite ball;

void setup() {
  ball = new Sprite();
  ball.image = imgBall;
	ball.x = canvas.w / 2;
	ball.y = canvas.h / 2;
	ball.diameter = 8;
	ball.bounciness = 1; // full bounciness
	ball.friction = 0; // no friction

  /* Part A: add the paddles */
  // your code here!
}

void draw() {

 
}
