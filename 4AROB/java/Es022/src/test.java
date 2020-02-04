public class test {
    public static void main(String[] args) throws Eccezione_Num_non_Valido {
        boolean ok=true;
        VettoreInteri v1 = new;
        VettoreInteri v2 = new VettoreInteri(0);

        VettoreInteri v1 = new VettoreInteri("12|567|19|0");

        System.out.println(v1.toString());

        System.out.println(v1.getMin());
    }
}