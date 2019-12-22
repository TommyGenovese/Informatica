float x, y;

//inizializzazione dell'applicativo
void setup(){
  size(1080, 800);
  background(200);
  fill(255,0,0);
  x=0;
  y=0;
}

//Creazione della frase
PFont f;
f= createFont("Arial.ttf", 24, true);
textFont(f,36);
fill(255);
text("Buon Natale a tutti!!");

/*
//aggiornamenti dei frame nella finestra
void draw(){
  
  background(200);
  rect(x,y,100,33);
  x=x+0.5;
  y=y+0.3;
}*/
