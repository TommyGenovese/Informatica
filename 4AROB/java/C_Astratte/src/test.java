public class test {
    public static void main(String arg[]){
        Animale[] a = new Animale[3];
        a[0] = new Scoiattolo(" Cip ");
        a[2] = new Scoiattolo(" Ciop ");
        a[1] = new Leone(" Simba  ");

        for(int i=0; i<3; i++){
            a[i].presentati();
            if(a[i] instanceof Leone){
                System.out.println(((Leone)a[i]).ruggire());
            }
        }
    }
}
