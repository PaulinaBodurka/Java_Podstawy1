package KlasyAbstrakcyjne;

public class ZwyklaKlasa extends PrzykladowaKlasaAbstrakcyjna{
    public void metodaZwykla(){
        System.out.println("tekst ze zwyklej klasy");
    }

    @Override
    public void metodaAbstrakcyjna() {
        System.out.println("wypisane z klasy zwyklej");

    }

    @Override
    public int metodaZParametrem(String z) {
        return 0;
    }
}
