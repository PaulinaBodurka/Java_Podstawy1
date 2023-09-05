package Klasy;

public class Programista {

    private String imię = "Paulina";
    private String nazwisko = "Bo";
    private String język = "grecki";
    private int zarobki = 8000;


    public Programista(String imię, String nazwisko, String język, int zarobki) {
        this.imię =imię;
        this.nazwisko = nazwisko;
        this.język =język;
        this.zarobki = zarobki;
    }

    public String getImię() {
        return imię;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getJęzyk() {
        return język;
    }

    public int getZarobki() {
        return zarobki;
    }
}
