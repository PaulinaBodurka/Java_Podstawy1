package Watki;

public class Watki_Main {
    public static void main(String[] args) {

//        for (int i = 0; i < 100; i++) {
//            System.out.println("petla pierwsza:" + i);
//        }
//        for (int i = 0; i < 100; i++) {
//            System.out.println("petla druga:" + i);
//
//        }

        Thread watek1 = new PierwszyWatek();
        Thread watek2 = new DrugiWatek();
        watek1.start();
        watek2.start();

    }
}
