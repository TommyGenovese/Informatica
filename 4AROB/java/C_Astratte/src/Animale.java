public abstract class Animale {
    public String nome;
    Animale(String nome){
        this.nome = nome;
    }
    public abstract String attività();
    public abstract String vive();
    public abstract String mangia();
    public void presentati(){
        System.out.println("Mi chiamo"+nome+"mi piace"+attività()+ "vivo"+ vive()+ "e mangio"+ mangia());
    }

}
