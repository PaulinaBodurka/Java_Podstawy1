package Kurs;

import java.io.PrintStream;

public class StringZadania {
    public static void main(String[] args) {
        String imie = "Paulina";
        String nazwisko = "Bodurka";
        String imieInazwisko = "Paulina Bodurka";
        PrintStream var10000 = System.out;
        int var10001 = imie.length();
        var10000.println("imie znaki: " + var10001 + " nazwisko znaki: " + nazwisko.length() + " imię i nazwisko znaki: " + (imieInazwisko.length() - 1));
        String imieAlicja = "Alicja";
        System.out.println(imie.equals(imieAlicja));
        System.out.println(nazwisko.toUpperCase());
        System.out.println(nazwisko.replace('a', 'e'));
        System.out.println("Zadanie 2");
        String zdanie = "Potrafie coraz wiecej z progrramowania";

        int i;
        for(i = 0; i < zdanie.length(); ++i) {
            System.out.println(zdanie.charAt(i));
        }

        System.out.println("Zadanie 3");

        for(i = zdanie.length() - 1; i >= 0; --i) {
            System.out.println(zdanie.charAt(i));
        }

    }
}
