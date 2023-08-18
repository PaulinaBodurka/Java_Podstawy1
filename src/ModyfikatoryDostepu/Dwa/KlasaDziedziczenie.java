package ModyfikatoryDostepu.Dwa;

import ModyfikatoryDostepu.Jeden.KlasaA;

public class KlasaDziedziczenie extends KlasaA {
    public KlasaDziedziczenie() {
    }

    public void metoda() {
        this.poleDziedziczenie = 10;
        this.polePubliczne = 102;
        this.metodaPubliczna();
        this.metodaProtected();
    }
}
