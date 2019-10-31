import java.sql.SQLOutput;

public class Test {
    public static  void main(String[] arg){
        Data d;
        d= new Data(18, 10, 2019);
        System.out.println(d.toString());

        Voto v1 = new Voto(d, 7f, 0.5f, 's');
        Voto v2 = new Voto(new Data(24, 10, 2019), 9f, 1f, 'o');

        System.out.println(v1.toString());
        System.out.println(v2);
    }
}
