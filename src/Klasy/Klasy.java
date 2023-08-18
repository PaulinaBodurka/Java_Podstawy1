package Klasy;

public class Klasy {
    public Klasy() {
    }

    public static void main(String[] args) {
        KlasaDruga nazwa = new KlasaDruga();
        nazwa.metodaKtóraNieZwraca();
        nazwa.MetodaKróraPrzyjmujeArgument(33, 'd');
        nazwa.KolejnaMetoda(false, 100);
        int wynikDodawania = nazwa.dodawanie(10, 5);
        System.out.println(wynikDodawania);
        double wynikKolejnejMetody = nazwa.dadajCosPoPrzecinku(10.1);
        System.out.println("po przecinku: " + wynikKolejnejMetody);
        System.out.println("wartosc logiczna: " + nazwa.zamieńWartoscLogiczna(true));
        nazwa.przykladKolejnej();
        nazwa.voidKtoryZwraca(false);
    }
}