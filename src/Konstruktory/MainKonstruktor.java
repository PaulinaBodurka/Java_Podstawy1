package Konstruktory;

public class MainKonstruktor {
    public MainKonstruktor() {
    }

    public static void main(String[] args) {
        KlasaKonstruktor klasaKonstruktor = new KlasaKonstruktor(20);
        System.out.println(klasaKonstruktor.pierwszePole);
        System.out.println(klasaKonstruktor.drugiePole);
        new KlasaDwa();
        KlasaKonstruktor klasaKon = new KlasaKonstruktor();
        System.out.println(klasaKon.pierwszePole);
        System.out.println(klasaKon.drugiePole);
    }
}
