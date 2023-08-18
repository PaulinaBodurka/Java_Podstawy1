package StaticFinal;


import java.io.PrintStream;
import java.util.Objects;

public class MainStaticFinal {
    public MainStaticFinal() {
    }

    public static void main(String[] args) {
        KlasaStaticFinal obiekt = new KlasaStaticFinal();
        obiekt.pole = 10;
        KlasaStaticFinal.poleStatic = 10;
        System.out.println("KLasa Static Final:" + KlasaStaticFinal.poleStatic);
        KlasaStaticFinal.metodaStatyczna();
        PrintStream var10000 = System.out;
        Objects.requireNonNull(obiekt);
        var10000.println("pole final:" + 150);
        System.out.println("Dowolny tekst");
    }
}
