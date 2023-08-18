package Kurs;

public class PetlaBreakContinous {
    public static void main(String[] args) {
        for(int zmienna = 1; zmienna <= 20; ++zmienna) {
            if (zmienna <= 18) {
                System.out.println("zmienna" + zmienna);
            }
        }

        int[] tab = new int[100];

        int i;
        for(i = 0; i < tab.length; tab[i] = i++) {
        }

        for(i = 0; i < tab.length - 1; ++i) {
            System.out.println("tab " + i + ": " + tab[i]);
        }
    }
}
