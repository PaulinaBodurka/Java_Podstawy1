package Pola;

public class KlasaZPolami {
    int liczbaCalkowita;

    public KlasaZPolami() {
    }

    void zwrocWartoscPola() {
        System.out.println("zwrocona wartosc pola" + this.liczbaCalkowita);
    }

    void ustawWartoscPola(int wartosc) {
        this.liczbaCalkowita = wartosc;
    }

    int zwrocWartoscPolaZMetody() {
        return this.liczbaCalkowita;
    }
}
