public class Test {
    public static void main(String[] args) {

        Lavoratore fra= new Lavoratore("tommy", 2, 1500);
        System.out.println(fra.toString());
        System.out.println(fra.stampaStipendio());
        LavoratoreconStraordinariPagati a1 = new LavoratoreconStraordinariPagati("a1", 2, 500);
        a1.setSalary(2300);
        System.out.println(a1.stampaStipendio());
        LavoratoreconStraordinariPagati a2 = new LavoratoreconStraordinariPagati("a2", -2, -5000, -5);
        Azienda b1=new Azienda("Tale");
        System.out.println(a2.toString());
        b1.addLavoratori(a1);
        b1.addLavoratori(a2);
        System.out.println(b1.toString());
    }
}