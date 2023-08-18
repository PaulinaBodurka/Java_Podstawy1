package Kurs;

public class OperatoryZmienneZadania {
    public OperatoryZmienneZadania() {
    }
    public static void main(String[] args) {
        int wiek = 30;
        double wzrost = 1.56;
        int waga = 50;
        System.out.println("wiek: " + wiek + " lat");
        System.out.println("wzrost: " + wzrost + " metrów");
        System.out.println("waga: " + waga + " kg");
        double bmi = (double)waga / Math.pow(wzrost, 2.0);
        System.out.println("bmi: " + bmi);
        bmi = (double)((int)bmi);
        System.out.println("int bmi: " + bmi);
        int a = 46;
        int b = 2;
        int c = 3;
        int d = 11;
        int wynik = a / b;
        int wynik2 = a / c;
        int wynik3 = a / d;
        int wynik4 = a % b;
        int wynik5 = a % c;
        int wynik6 = a % d;
        System.out.println("wynik a/b: " + wynik + " wynik a/c: " + wynik2 + " wynik a/d: " + wynik3);
        System.out.println("wynik4 a%b: " + wynik4 + " wynik5 a%c: " + wynik5 + " wynik6 a%d: " + wynik6);
        int xInt = 1000000000;
        int ab = Integer.MAX_VALUE;
        int pozaInt = xInt + xInt;
        System.out.println(ab);
    }
}