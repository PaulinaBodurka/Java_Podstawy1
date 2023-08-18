package Kurs;

public class TabliceZadania {
    public static void main(String[] args) {
        int[] tablica = new int[]{10, 20, 30, 40, 50};
        int wynikSuma = tablica[0] + tablica[1] + tablica[2] + tablica[3] + tablica[4];
        System.out.println("wynik suma: " + wynikSuma);
        double[][] tablicaDwa = new double[][]{{1.4, 2.5, 3.5, 4.4, 5.1}, {5.5, 6.5, 7.6, 8.7, 9.9}, {10.2, 11.1, 12.3, 13.4, 15.3}};
        double pierwszyWiersz = tablicaDwa[0][0] + tablicaDwa[0][1] + tablicaDwa[0][2] + tablicaDwa[0][3] + tablicaDwa[0][4];
        double drugiWiersz = tablicaDwa[1][0] + tablicaDwa[1][1] + tablicaDwa[1][2] + tablicaDwa[1][3] + tablicaDwa[1][4];
        double trzeciWiersz = tablicaDwa[2][0] + tablicaDwa[2][1] + tablicaDwa[2][2] + tablicaDwa[2][3] + tablicaDwa[2][4];
        System.out.println("pierwszyWiersz: " + pierwszyWiersz);
        System.out.println("drugiWiersz: " + drugiWiersz);
        System.out.println("trzeciWiersz: " + trzeciWiersz);
    }
}
