private CerchioDinamico cd;

public void settings(){
  size(1920,1080);
}

public void setup(){
  cd = new CerchioDinamico();
  background(0, 177, 87);
}

public void draw(){
  
  cd.setDim(100);
  //randomizzo il colore 0..255
  cd.setColor(color(0, 100, 100));
   
  cd.show();
  cd.move();
  
  delay(10);
}
