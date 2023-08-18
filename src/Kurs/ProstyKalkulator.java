package Kurs;

public class ProstyKalkulator {
    public static void main(String[] args) {

        double liczba = 20.0;
        double liczba2 = 5.0;
        double wynik = 0.0;
        char znak = '/';
        switch (znak) {
            case 42:
                wynik = liczba * liczba2;
                System.out.println("mnożenie:" + wynik);
                break;
            case 43:
                wynik = liczba + liczba2;
                System.out.println("dodawanie:" + wynik);
            case 44:
            case 46:
            default:
                break;
            case 45:
                wynik = liczba - liczba2;
                System.out.println("odejmowanie:" + wynik);
                break;
            case 47:
                wynik = liczba / liczba2;
                System.out.println("dzielenie:" + wynik);
        }

    }
}
