package This;

public class MainThis {
    public static void main(String[] args) {
        KlasaRoz obiekt1 = new KlasaRoz();
        System.out.println("oddzielenie");
        KlasaRoz obiekt2 = new KlasaRoz(111);
        System.out.println("oddzielenie");
        KlasaRoz obiekt3 =new KlasaRoz(1,2);

        System.out.println(obiekt3.x);
        System.out.println(obiekt3.y);

    }

}
