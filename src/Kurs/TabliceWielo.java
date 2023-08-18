package Kurs;

public class TabliceWielo {
    public static void main(String[] args) {
        int[][] tablicaDwuwymiarowa = new int[10][10];
        tablicaDwuwymiarowa[0][1] = 123;
        tablicaDwuwymiarowa[4][8] = 190;
        System.out.println(tablicaDwuwymiarowa[4][8]);
        int[][] nowaTablica = new int[][]{{1, 2, 3, 11, 12, 15}, {4, 5, 6, 41, 56, 45}};
        System.out.println("[0][0]: " + nowaTablica[0][0]);
        System.out.println("[0][1]: " + nowaTablica[0][1]);
        System.out.println("[1][2]: " + nowaTablica[1][2]);
        System.out.println("[1][2]: " + nowaTablica[1][5]);
        System.out.println("rozmiar tablicy: " + nowaTablica.length);
        System.out.println("rozmiar kolumny 0 " + nowaTablica[0].length);
        System.out.println("rozmiar kolumny 0 " + nowaTablica[1].length);
    }
}
