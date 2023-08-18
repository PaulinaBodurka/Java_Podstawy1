package String;

public class StringMetody {
    public StringMetody() {
    }

    public static void main(String[] args) {
        String tekst = "Jakiś tekst";
        System.out.println("dlugosc: " + tekst.length());
        System.out.println("is empty: " + tekst.isEmpty());
        char pojZank = tekst.charAt(tekst.length() - 1);
        System.out.println("char " + pojZank);
        System.out.println("substring:" + tekst.substring(6));
        String substring = tekst.substring(3, 9);
        System.out.println("substring:" + substring);
        String nowyString = "   skala dlaczego     ";
        System.out.println("." + nowyString + ".");
        System.out.println("trim: ." + nowyString.trim() + ".");
        String różneWielkosci = "różne LITERY małe I DUŻE";
        System.out.println(różneWielkosci.toLowerCase());
        System.out.println(różneWielkosci.toUpperCase());
        String czyZawiera = "czy zawiera jakis tekst";
        System.out.println("startsWith: " + czyZawiera.startsWith("czy"));
        String czyZawieraKoncowke = "jakiś tekst";
        System.out.println("endsWith: " + czyZawieraKoncowke.endsWith("et"));
        System.out.println("Czy zawiera" + czyZawiera.contains("jakis"));
        System.out.println("replace:" + czyZawieraKoncowke.replace("i", "k"));
    }
}

