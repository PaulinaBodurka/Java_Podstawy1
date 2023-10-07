package WyjątkiZadania;

public class Main2 {
    public static void main(String[] args){
        try {
            System.out.println(podziel(6,0));
        } catch (WyjątekWlasny e) {
            System.out.println(e.getMessage());
        }
    }

    public static int podziel(int a, int b) throws WyjątekWlasny {
        if(b==0){
            throw new WyjątekWlasny();
        }
        return a/b;
    }
}
