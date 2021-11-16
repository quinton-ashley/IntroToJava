// screen resolution is 256x192

PImage imgBall = spriteArt(
"..wwww..\n" +
".ww..ww.\n" +
"ww....ww\n" +
"w......w\n" +
"w......w\n" +
"ww....ww\n" +
".ww..ww.\n" +
"..wwww..");

PImage imgPaddle = spriteArt(".wwwwww.\nwwwwwwww\n" + "www..www\nww.ww.ww\n".repeat(21) + "wwwwwwww\n.wwwwww.");

Sprite ball = createSprite(imgBall);

void setup() {
  size(256, 192);
  // places a ball in center of the screen
  ball.x = width / 2;
  ball.y = height / 2;
}

void draw() {

  drawSprites();
}
