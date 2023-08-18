package Klasy;

public class KlasaDruga {
    public KlasaDruga() {
    }
    void metodaKtóraNieZwraca() {
        System.out.println("wypisz");
    }

    void MetodaKróraPrzyjmujeArgument(int liczba, char pojZnak) {
        System.out.println("wartość " + liczba + " " + pojZnak);
    }

    void KolejnaMetoda(boolean czyPokazać, int liczba) {
        if (czyPokazać) {
            System.out.println("liczba" + liczba);
        } else {
            System.out.println("nie pozwolono pokazać");
        }
    }

    int dodawanie(int a, int b) {
        int wynik = a + b;
        return wynik;
    }

    double dadajCosPoPrzecinku(double liczbaDouble) {
        double wynik = liczbaDouble + 0.55;
        return wynik;
    }

    boolean zamieńWartoscLogiczna(boolean wartoscLogiczna) {
        return !wartoscLogiczna;
    }

    int przykladKolejnej() {
        System.out.println("cos przed zwroceniem");
        return 100;
    }

    void voidKtoryZwraca(boolean czyZakonczyc) {
        if (!czyZakonczyc) {
            System.out.println("cos zakonczone");
        }
    }
}
