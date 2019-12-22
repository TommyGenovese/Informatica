Snow[] fiocchi = new Snow[800];
Empire b;
PFont f;
float Yscritta=height/2 + 300;
float Xscritta=width+500;

void setup() {
  size (1250, 900);
  for (int i = 0; i<fiocchi.length; i++) { 
    fiocchi[i] = new Snow(random(2, 10));
    fiocchi[i].spreadY(i);
  }
  f= createFont("Browzko.ttf", 28);
}

void draw() {
  background(0, 0, 60); 
  b = new Empire();
  b.display();
  for (int i = 0; i < fiocchi.length; i++) {
    fiocchi[i] .display();
    if (fiocchi[i].x > 280 && fiocchi[i].y >445 && fiocchi[i].x<405) {
      fiocchi[i].bounce();
    }
    //neve piglia rossa
    if (fiocchi[i].x > 332 && fiocchi[i].y > 283 && fiocchi[i].x<350) {
      fiocchi[i].bounce();
    }

    //neve cubo verde
    if (fiocchi[i].x > 313 && fiocchi[i].y >365 && fiocchi[i].x<320) {
      fiocchi[i].bounce();
    }
    if (fiocchi[i].x > 365 && fiocchi[i].y >365 && fiocchi[i].x<372) {
      fiocchi[i].bounce();
    }

    //neve sui cubi grigi
    if (fiocchi[i].x > 360 && fiocchi[i].y >413 && fiocchi[i].x<390) {
      fiocchi[i].bounce();
    }
    if (fiocchi[i].x > 300 && fiocchi[i].y >413 && fiocchi[i].x<330) {
      fiocchi[i].bounce();
    }

    //neve sulla parte bassa
    if (fiocchi[i].x > 257 && fiocchi[i].y >height-100 && fiocchi[i].x<425) {
      fiocchi[i].bounce();
    }
    //neve sulla parte bassissima
    if (fiocchi[i].x > 240 && fiocchi[i].y >height-35 && fiocchi[i].x<442) {
      fiocchi[i].bounce();
    }
    
    
    //problema con il movimento della scritta e con il lag della neve
    textFont(f, 80);
    fill(255);
    if(Xscritta>width/2){
      Xscritta= Xscritta - 1;
    }
    text("Buon Natale", Xscritta, Yscritta);
    text("da New York!!", Xscritta, Yscritta+100);
  }
}
