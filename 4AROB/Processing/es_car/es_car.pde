  private Rettangolo r;
  private Macchina m;
  private Cerchio ruo1;
  private Cerchio ruo2;
  float v=0;  //colore verde per lo sfondo 
  float s=1.2;  //valore per cui varia la variabile di sfondo ogni ciclo
   
 //metodo per la definizione della dimensioen della finestra
public void settings(){
  size(700,700);  //dimensione finestra
  fullScreen();
}

//metodo eseguito una sola volta per le inizializzazioni
public void setup() {  
    r = new Rettangolo();
    m = new Macchina();
    ruo1= new Cerchio();
    ruo2= new Cerchio();
    
}
  
//metodo eseguito finchè non si chiude la finestra  
public void draw(){
    //colorazione sfondo
    
    background(125,125,255);
    //crazione macchina
    m.show();
    //crazione sfondo
    r.setColore(color(0,250,0)); 
    r.setAlt(height);
    r.setLung(width+10);
    r.setX(0);
    r.setY(height/2+200);
    r.show();
    //ruote
    ruo1.show();
    ruo2.show();
}






/*
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
  
  c.setL(500);
  c.setH(200);
  c.show();
  delay(1000);
  
}*/
