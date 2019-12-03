public class test {
    public static void main(String[] arg){
        Libro b;
        b = new Libro(3);
        b.pageMessage();

        Libro a = new Libro(200);
        a.pageMessage();

        Vocabolario Zanichelli = new Vocabolario(20000, 1230);
        Zanichelli.definitionMessage();

    }

}
