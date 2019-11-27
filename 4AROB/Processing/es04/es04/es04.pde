private Rettangolo c;

public void settings(){
  size(1920,1080);
}

public void setup(){
  c = new Rettangolo();
  background(100,100,100);
}

public void draw(){
  
  //randomizzo il colore 0..255
  c.setX(width/2 - 10); //randomizza la coordinata 0..width+1
  
  c.setY(height/2+50);
  
  c.setL(25);
  c.setH(250);
  c.show();
  delay(1000);
  
}
