public class Test {
    public static void main(String[] args) {
        Telecomando tel = new Telecomando();
        System.out.println(tel.toString());

        tel.setAcceso("si");
        System.out.println(tel.toString());

        tel.setCanaleDown();
        System.out.println("Canale: " + tel.getCanale());
        tel.setCanaleDown();

        System.out.println("Canale: " + tel.getCanale());
        tel.setCanale(-1);

        System.out.println("Canale: " + tel.getCanale());
        tel.setCanale(5);

        System.out.println("Canale: "+ tel.getCanale());
        tel.setCanale(50);

        System.out.println("Canale: "+ tel.getCanale());

        tel.setVolumeDown();

        System.out.println("Volume: "+ tel.getVolume());
        tel.setVolumeDown();

        System.out.println("Volume: "+ tel.getVolume());
        tel.setVolumeUp();

        System.out.println("Volume: "+ tel.getVolume());
        tel.setVolumeUp();

        System.out.println("Volume: "+ tel.getVolume());
        tel.setVolumeUp();

        System.out.println("Volume: "+ tel.getVolume());

        System.out.println(tel.toString());

        tel.setAcceso("no");
        System.out.println(tel.toString());

    }
}