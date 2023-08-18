package ModyfikatoryDostepu.Jeden;

public class KlasaBezNiczego {
    public KlasaBezNiczego() {
    }

    public void metoda() {
        KlasaA obiekt = new KlasaA();
        obiekt.metodaPubliczna();
        obiekt.metodaBezNiczego();
        obiekt.metodaProtected();
    }
}