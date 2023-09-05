package Dziedziczenie;

public class Main {
    public static void main(String[] args){
        KlasaPodstawowaDziedzicz klasaPodstawowa = new KlasaPodstawowaDziedzicz();
        klasaPodstawowa.metodaDruga();
        klasaPodstawowa.metodaPierwsza();
        KlasaRozszerzonaDziedzicz klasaRozszerzona = new KlasaRozszerzonaDziedzicz();
        klasaRozszerzona.metodaPierwsza();
        klasaRozszerzona.metodaRozszerzona();
        KlasaBardziejRozszerzona klasaBardziejRozszerzona = new KlasaBardziejRozszerzona();
        klasaBardziejRozszerzona.metodaRozszerzona();


    }
}
