package Override;

import Dziedziczenie.KlasaPodstawowaDziedzicz;

public class PrzesłanianieMetod {
    public static void main(String[] args){
        KlasaPodstawowa klasaPodstawowa = new KlasaPodstawowa();
        KlasaRozszerzona klasaRozszerzona = new KlasaRozszerzona();

        klasaPodstawowa.metoda();
        klasaRozszerzona.metoda();
        }
    }


