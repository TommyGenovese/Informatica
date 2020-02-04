import java.sql.SQLOutput;

public class test {
    public static void main(String[] args)  {
        carburante carConv = new carburante();
        //carConv.add(17.6f);

        //carConv.add(94.3f);


        System.out.println(carConv.toString());
        System.out.println(carConv.min());
        System.out.println(carConv.max());
        System.out.println(carConv.average());

    }
}
