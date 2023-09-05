package Klasy;

public class TablicaZadanie {
    public static void main(String[] args) {
    }

    private int[] tablica;

    public TablicaZadanie(int[] podajTablice) {
        tablica = podajTablice;
    }

    public int suma() {
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma += tablica[i];
        }
        return suma;
    }

    public int średnia() {
        int średnia = suma() / tablica.length;
        return średnia;
    }

    public int min() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] < min) {
                min = tablica[i];
            }
        }
        return min;

    }

    public int max() {
        int max = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < tablica.length; i++) {
            if (tablica[i] > max) {
                max = tablica[i];
            }
        }
            return max;
        }

    }

