package Klasy;

public class MainKlasy {
    public static void main(String[] args){
        Programista programista = new Programista( "Anna", "Bell", "grecki", 10000);
        System.out.println("imię:" + programista.getImię() + " nazwisko: "+programista.getNazwisko()+ " język: " + programista.getJęzyk() +" zarobki: "+programista.getZarobki());


        int[] tablica ={ 5,1,199,200,4,7};
        TablicaZadanie tablicaZadanie = new TablicaZadanie(tablica);
        System.out.println("Suma:" + tablicaZadanie.suma());
        System.out.println("Średnia:" + tablicaZadanie.średnia());
        System.out.println("Min:" + tablicaZadanie.min());
        System.out.println("Max:" + tablicaZadanie.max());

        System.out.println("Obwod koła:" + MatmaZadanie.obwodKola(4));
        System.out.println("Pole koła:" + MatmaZadanie.poleKola(4));
        System.out.println("Obwod prostokąta:" + MatmaZadanie.obwodProstokata(4,2));
        System.out.println("Pole prostokąta:" + MatmaZadanie.poleProstokata(4,2));

    }



}
