class Test {
    public static void main(String[] args) {
        final int DIM = 2;
        Animale[] gabbia = new Animale[DIM];
        gabbia[0] = new Scoiattolo();
        gabbia[1] = new Cane();
        for(int k=0;k<DIM;k++){
            gabbia[k].verso();
            if(gabbia[k] instanceof Cane){
                ((Cane)gabbia[k]).ringhiare();
            }
        }
    }
}
