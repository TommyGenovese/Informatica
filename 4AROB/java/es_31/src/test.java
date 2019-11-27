public class test {
    public static void main(String[] arg){
        Libro b;
        b = new Libro(3);
        Libro b.pageMessage();

        Libro a = new Libro(200);
        Libro a.pageMessage();

        Vocabolario Zanichelli = new Vocabolario(20000, 1230);
        Vocabolario Zanichelli.definitionMessage();

    }

}
