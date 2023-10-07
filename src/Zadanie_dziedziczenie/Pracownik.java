package Zadanie_dziedziczenie;

public class Pracownik extends Osoba {
    protected String stanowisko;
    protected String nazwaFirmy;


    public Pracownik(String imie, String nazwisko, String stanowisko, String nazwaFirmy) {
        super(imie, nazwisko);
        this.stanowisko = stanowisko;
        this.nazwaFirmy = nazwaFirmy;
    }

    @Override
    public void przedstawSie() {
        System.out.println("Jestem " + imie + " i pracuję w firmie " + nazwaFirmy + " na stanowisku  " + stanowisko);
    }
}


