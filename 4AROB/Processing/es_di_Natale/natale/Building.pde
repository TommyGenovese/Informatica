class Empire {
  float x = 300;
  float y = 900;
  int width = 85;
  int height = 65;
  void display() {
    stroke(255);
    strokeWeight(2);
    rectMode(RADIUS);
    
    //imposto le tipiche colorazioni natalizie dell'empire state building
    //(piglia rossa e cubo centrale verde)
    
    fill(124,252,0);
    rect(x+width/2, y-height*7.7, width/3, height/2);             //cubo verde
    
    fill(120);
    rect(x+width/2, y-height*8.2, width/4, height/4);             //cubo
    rect(x+width/2, y-height*8.5, width/6, height/6);             //cubo
    
    fill(255,0,0);
    rect(x+width/2, y-height*9, width/9.5, height/2);             //piglia rossa
    
    fill(120);
    line(x+width/2, y-height*9.5, x+width/2, y-height*11);        //amtenna macro
    
    
    //ciò che deve stare in primo piano
    rect(x+width/6+width*0.7, y-height*7, width/6, height/2);      //cubo destro alto
    rect(x+width/6, y-height*7, width/6, height/2);                //cubo sinistro alto
    rect(x+width/6, y-height*3, width*0.35, height*4);             //alto sinistro
    rect(x+width/6+width/1.4, y-height*3, width*0.35, height*4);
    rect(x+width/2, y+height/2, width*0.95, height*2);             // supporto centrale base
    rect(x-7, y, width/2+ width/10, height/2);                     //supporto sinistro
    rect(x+width+7, y, width/2 + width/10, height/2);              //supporto destro
  }
}
