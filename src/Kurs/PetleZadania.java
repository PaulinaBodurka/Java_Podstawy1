package Kurs;

public class PetleZadania {
    public PetleZadania() {
    }

    public static void main(String[] args) {
        int i;
        for(i = 0; i <= 30; ++i) {
            System.out.print("" + i + " ");
        }

        for(i = 30; i >= 0; --i) {
            System.out.println("" + i + " ");
        }

        System.out.println("zadanie 2");

        for(i = 0; i <= 30; ++i) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("zadanie 3");
        int a = 0;
        int b = 30;

        for(int mok = a; mok <= b; ++mok) {
            System.out.println("" + mok + " ");
        }

        System.out.println("zadanie 4 ");
        int[] tab = new int[]{44, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int suma;
        for(suma = 0; suma <= 9; ++suma) {
            System.out.println(tab[suma] + " ");
        }

        for(suma = 9; suma >= 0; --suma) {
            System.out.println(tab[suma]);
        }

        System.out.println("zadanie 5 ");
        suma = 0;

        for(int j = 0; i < tab.length; ++j) {
            suma += tab[j];
        }

        System.out.println(suma);
        System.out.println("zadanie 6 ");
        int liczba = 5;
        int wynikSilnia = 1;

        for(int n = liczba; n >= 1; --n) {
            wynikSilnia *= n;
        }

        System.out.println("wynik silnia: " + wynikSilnia);
        System.out.println("zadanie 7 ");
        int n = 5;
        int liczbaGwiazdek = 1;

        int liczbaGwiazdekLustrzanych;
        int j;
        for(liczbaGwiazdekLustrzanych = 1; liczbaGwiazdekLustrzanych <= n; ++liczbaGwiazdekLustrzanych) {
            for(j = 1; j <= liczbaGwiazdek; ++j) {
                System.out.print("*");
            }

            System.out.println();
            ++liczbaGwiazdek;
        }

        System.out.println("zadanie 8 ");
        liczbaGwiazdekLustrzanych = 1;
        j = n - 1;

        for(int m = 1; m <= n; ++m) {

            for(j = 1; j <= n - 1; ++j) {
                System.out.print(" ");
            }

            for(j = 1; j <= i; ++j) {
                System.out.print("*");
            }

            System.out.println();
            --j;
            ++liczbaGwiazdekLustrzanych;
        }

    }
}
