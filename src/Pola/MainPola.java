package Pola;

public class MainPola {
    public MainPola() {
    }
    public static void main(String[] args) {
        KlasaZPolami obiekt = new KlasaZPolami();
        obiekt.liczbaCalkowita = 15;
        System.out.println(obiekt.liczbaCalkowita);
        obiekt.ustawWartoscPola(101);
        obiekt.zwrocWartoscPola();
        obiekt.ustawWartoscPola(202);
        int zmienna = obiekt.zwrocWartoscPolaZMetody();
        System.out.println("zmienna" + zmienna);
    }
}

