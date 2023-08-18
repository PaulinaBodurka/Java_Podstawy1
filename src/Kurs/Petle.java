package Kurs;

public class Petle {
    public static void main(String[] args) {
        int liczenie;
        for(liczenie = 1; liczenie <= 10; ++liczenie) {
            System.out.println("tekst " + liczenie);
        }

        System.out.println("poza pętlą " + liczenie);

        int a;
        for(a = 1; a <= 10; ++a) {
            System.out.println("tekst" + a);
        }

        a = 1;

        do {
            System.out.println("Tekst z do while " + a);
            ++a;
        } while(a <= 10);

    }
}
