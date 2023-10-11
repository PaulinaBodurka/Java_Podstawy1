package Interfejs_abstrakcja.Zadanie3;

public class Zadanie3 {
    public static void main(String[] args) {
        Info infoAnonimowe = new Info(){
            @Override
            public void wyswietlInfo() {
                System.out.println("wyswietl przeslonieta metode");

            }
        };

    }

    interface Info {
        void wyswietlInfo();

    };
}



