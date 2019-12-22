class Snow {
  float x; 
  float y;
  float dissolvence;
  float diameter;
  float vel = random(0.50, 5.00);
  float descentX;

  //randomizza il punto di spown della neve (non ho lasciato fissa la neve in x altrimenti non compariva più sul grattacielo)
  Snow (float tempD) {
    x = random(0, width);
    y = random(0,40);
    diameter = tempD;
  }
  
  void spreadY(int i) {
    y = y - i*3;
  }
  
  void display() {
    dissolvence = map(y, 0, height, 255, 10); //dissolvenza della neve, fa in modo che man mano che la neve scenda scompaia
    noStroke();
    fill(255, dissolvence);
    ellipse(x, y, diameter, diameter);
    y = y + vel;
    x = x + descentX;
  }

  void bounce(){
    y = y - vel; 
  }
}
