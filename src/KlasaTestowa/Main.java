package KlasaTestowa;

import KlasaTestowa.KlasaTestowa;

public class Main {
    public static void main(String[] args) {

        KlasaTestowa klasaTestowa = new KlasaTestowa();
        klasaTestowa.print("Jacek", 15);

        klasaTestowa.print("Mikolaj",  18);


                                //4
        System.out.println(klasaTestowa.mnozenie(2,2));

        int c = klasaTestowa.mnozenie(4,4);
        System.out.println(c);
    }

}