public class test {
    public static void main(String[] args) {
        Giacca g = new Giacca("M", 99.99f, 1, TipoImbottitura.LEGGERA);
        Pantalone p = new Pantalone("L", 45.95f, 1, TipoTessuto.DI_LANA);


        Magazzino m = new Magazzino("Giavellus");

        m.addArticolo(g);
        m.addArticolo(p);
        m.addArticolo(new Pantalone("XL", 30, 3, TipoTessuto.JEANS));
        System.out.println(g);
        System.out.println(p);
    }
}
