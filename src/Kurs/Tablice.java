package Kurs;

public class Tablice {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        tablica[0] = 5;
        tablica[1] = 10;
        tablica[0] = 5;
        tablica[3] = 155;
        System.out.println(tablica[0]);
        double[] tablicaDouble = new double[]{12.5, 55.5, 111.1, 0.0, 0.0};
        System.out.println(tablicaDouble[4]);
        char[] tablicaChar = new char[100];
        System.out.println();
        int[] nowaTablica = new int[]{5, 10, 15, 155};
        System.out.println("nowaTablica[0]" + nowaTablica[0]);
        System.out.println("nowaTablica[1]" + nowaTablica[1]);
        System.out.println("nowaTablica[2]" + nowaTablica[2]);
        System.out.println("nowaTablica[3]" + nowaTablica[3]);
        System.out.println("tablica rozmiar: " + tablica.length);
        System.out.println("tablicaDouble rozmiar: " + tablicaDouble.length);
        System.out.println("tablicaChar rozmiar: " + tablicaChar.length);
        System.out.println("nowaTablica: " + nowaTablica.length);
    }
}
