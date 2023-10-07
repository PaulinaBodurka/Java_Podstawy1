package Wyjątki;

public class Wyjątki {
    static String str = new String();

    public static void main(String[] args) {

   //     str ="przypiszę coś";
   //     try {
   //         System.out.println("nie ma nullpointer " + str.isEmpty());
   //     } catch (NullPointerException wyjątek) {
   //     }
   //     System.out.println("Na koniec programu wypisz coś");

        int[] tablica = new int[2];

        try{
            tablica[0] = 101;
            tablica[1] = 202;
            tablica[2] = 303;
            System.out.println("Wszystko poszło ok");
        }catch(NullPointerException wyjątek) {
            System.out.println("Hej, hej utwórz tablicę co najmniej dwóch elementów");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("stop, jesteś poza zakresem tablicy");
        }
        System.out.println("Na koniec programu wypisz to coś");

    }


    public static class Wyjątki2 {
        static String str = "tekstowo";
        public static void main(String[] args){
            try{
                System.out.println("WSZYSTKO WIELKĄ LITERĄ " + str.toUpperCase());
            }catch(NullPointerException | StringIndexOutOfBoundsException e) {
                System.out.println("poszedł null");
            }finally{
                System.out.println("Ja i tak zawsze się wykonam");
            }

        }
    }
}
