public class Test {
    public static void main(String[] args) {
        Telecomando t;

        t= new Telecomando();

        t.premiOnOff();

        System.out.println(t.isAcceso());
        System.out.println(t.setgetCanale(5));
        System.out.println(t.getVolume());

        t.canaleGiu();
        t.volumeGiu();

        System.out.println(t.setgetCanale());
        System.out.println(t.getVolume());

        t.volumeSu();
        t.canaleSu();

        System.out.println(t.setgetCanale());
        System.out.println(t.getVolume());

        t.muto();

        System.out.println(t.getVolume());
    }
}