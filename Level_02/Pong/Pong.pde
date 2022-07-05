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

Sprite ball = new Sprite(imgBall);

void setup() {
  // places a ball in center of the screen
  ball.x = width / 2;
  ball.y = height / 2;
}

void draw() {

 
}
