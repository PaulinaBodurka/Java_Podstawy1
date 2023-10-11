package Interfejs_abstrakcja.Zadanie2;

public class Main {
    public static void main(String[] args){

        Kolo kolo = new Kolo(4);

        Prostokat prostokat = new Prostokat(4,6);

        System.out.println("Kolo obwód: "+ kolo.obwód() + " Kolo pole: " +kolo.pole());
        System.out.println("Prostokat obwód: "+ prostokat.obwód() + " Prostokat pole: " + prostokat.pole());

    }
}
