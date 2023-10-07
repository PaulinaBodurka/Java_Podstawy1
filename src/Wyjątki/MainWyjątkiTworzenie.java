package Wyjątki;

public class MainWyjątkiTworzenie {
    public static void main(String[]args) {
        Uzytkownik uzytkownik = new Uzytkownik();

        try {
            uzytkownik.wprowadzHaslo("tajne stowarzyszenie");
            System.out.println(("wszystko poszło ok"));
        } catch (NiezbytTajneHasloException e) {
            System.out.println("niezby tajne haslo");;

            uzytkownik.wprowadzMail("tralala");
        }

    }


}
