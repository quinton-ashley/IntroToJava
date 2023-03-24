Sprite frog;
Group lilypads;

void preload() {
	frog = new Sprite();
	lilypads = new Group();
}

void setup() {
	world.gravity.y = 10;
	noStroke();

	frog.x = 0;
	frog.y = 80;
	frog.w = 10;
	frog.h = 8;

	lilypads.y = 90;
	lilypads.w = 10;
	lilypads.h = 2;
	lilypads.collider = "static";

	makeLilyPads();
}

void makeLilyPads() {
	// TODO: use a loop to make more lily pads
	Func ls = lilypads.Sprite;
	Sprite lily = new ls();
	lily.x = 0;
}

void draw() {
	background("0");
	fill("3");
	rect(0, 0, width, 90);

	if (kb.presses("up")) {
		// little jump
		frog.velocity.y = -1.4;
	} else if (kb.presses("right")) {
		// BIG jump!
		frog.velocity.y = -2;
	}

	camera.x = frog.x + 64;
}
