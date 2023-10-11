package KlasyAbstrakcyjne;

public class MainKlasaAnonimowa {
    public static void main(String[] args){

        ZwyklaKlasa obiektKlasyAnonimowej = new ZwyklaKlasa(){
            @Override
            public void metodaZwykla(){
                System.out.println("metoda wywołana z klasy anonimowej");
            }
        };
        obiektKlasyAnonimowej.metodaZwykla();

        ZwyklaKlasa zwyklaKlasa =  new ZwyklaKlasa();
        metodaTutaj(new ZwyklaKlasa(){
            @Override
            public void metodaZwykla(){
                System.out.println("Specjalnie dla");
            }

        });
    }

    public static void metodaTutaj(ZwyklaKlasa parametr){
        parametr.metodaZwykla();

    }

}
