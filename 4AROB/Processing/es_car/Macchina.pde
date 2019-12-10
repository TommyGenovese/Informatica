public class Macchina {
  private Rettangolo r;
  private Cerchio c;
  
  //var generali
  private float posx;
  private float posy;
  
  //var per carrozzeria
  private float h;   //altezza della carrozzeria
  private static final float D_H=200;
  private float ros;   //colorazione rossa della carrozzeria
  private static final float D_ros=150; //colorazione verde dello stelo di defoult
  private float l;   //larghezza dello stelo
  private static final float D_L=500;
  
  //var per ruote
  private float clruo;
  private static final float D_CRUOT=255;
  private float dr;   //dimensioni delle ruote
  private static final float D_DR=120;
 
 public Macchina(){
   car= new Rettangolo();
   ruo1= new Cerchio();
   ruo2= new Cerchio();
   posx=width/2;
   posy=height/2;
   
   h=D_H;
   ros=D_ros;
   l=D_L;
   dr=D_DR;
   
 }
 public void show(){
      //creazione stelo
      r.setColore(color(0,vs,0)); 
      r.setAlt(as);
      r.setLung(ls);
      r.setCordX((posx)-ls/2);
      r.setCordY(posy);
      r.show();  
      //creazione petali
      pr=pr+cr;
      pv=pv+cv;
      pb=pb+cb;
      if(pr>=255||pr<=0){
       cr=-cr;
     }
     if(pb>=255||pb<=0){
       cb=-cb;
     }
     if(pv>=255||pv<=0){
       cv=-cv;
     }
      c.setColore(color(pr,pv,pb));
      c.setDim(dp);
      for(int i=-1;i<2;i++){
        c.setCordX((posx)+(i*((dp/5)*3)));
        c.setCordY((posy)+(i*((dp/5)*3)));
        c.show();
      }
      for(int i=-1;i<2;i++){
        c.setCordX((posx)-(i*((dp/5)*3)));
        c.setCordY((posy)+(i*((dp/5)*3)));
        c.show();
      }
      for(int i=-1;i<2;i++){
        c.setCordX((posx));
        c.setCordY((posy)+(i*((dp/5)*4)));
        c.show();
      }
      for(int i=-1;i<2;i++){
        c.setCordX((posx)+(i*((dp/5)*4)));
        c.setCordY((posy));
        c.show();
      }
      //creazione centro
      c.setColore(color(rc, gc, bc));
      c.setDim(dc);
      c.setCordX((posx));
      c.setCordY((posy));
      c.show();
  }
  
}
