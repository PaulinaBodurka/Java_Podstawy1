package Konstruktory;

public class KlasaKonstruktor {
    int pierwszePole;
    int drugiePole;

    KlasaKonstruktor() {
        System.out.println("jestem w konstuktorze");
        this.pierwszePole = 123;
        this.drugiePole = 22;
    }

    KlasaKonstruktor(int wartoscPierwsza) {
        this.pierwszePole = wartoscPierwsza;
        this.drugiePole = 55;
    }

    KlasaKonstruktor(int wartoscPierwsza, int wartoscDruga) {
        System.out.println("jestem w konstruktorze z dwoma parametrami");
        this.pierwszePole = wartoscPierwsza;
        this.drugiePole = wartoscDruga;
    }
}
