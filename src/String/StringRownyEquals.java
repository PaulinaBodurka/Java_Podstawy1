package String;

public class StringRownyEquals {
    public StringRownyEquals() {
    }

    public static void main(String[] args) {
        String literal1 = "tekst";
        String literal2 = "tekst";
        boolean wynik = literal1 == literal2;
        System.out.println("literal1==literal2 " + wynik);
        String object1 = new String("tekst inny");
        String object2 = new String("tekst");
        wynik = object1 == object2;
        System.out.println("object1==object2: " + wynik);
        wynik = object1 == literal1;
        System.out.println("object1 ==litera1 " + wynik);
        wynik = literal1.equals(literal2);
        System.out.println("equals literal:" + wynik);
        wynik = literal1.equals(object1);
        System.out.println("equals object literal: " + wynik);
    }
}
