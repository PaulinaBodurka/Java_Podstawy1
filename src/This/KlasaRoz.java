package This;

public class KlasaRoz {
    int x;
    int y;
    int z;
    int v;

    KlasaRoz() {
        System.out.println("Konstruktor z klasa rozszerzona");
    }

    KlasaRoz(int a) {
        x=a;
        System.out.println("Konstruktor z klasa rozszerzona z parametrem: " + a);
    }

    KlasaRoz(int a, int b) {
        this(a);
        y=b;
        System.out.println("Konstruktor z klasa rozszerzona z parametrami: " + a + " " + b);
    }
    void metodaZTejKlasy(){}

    void metodaZParametrami(int a, int b, int c, int d){


    }

}
