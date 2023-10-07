package Wyjątki;

public class MainWyjątkiSuper {
    public static void main(String[] args){
        try {
            wyrzucKoniecznieJakisWyjątek();
        } catch (JakiśException e) {
            System.out.println("obsługuję wyjątki w catch, " + "a wiadomość wyjątku to " + e.getMessage());
        }

    }
    public static void wyrzucKoniecznieJakisWyjątek() throws JakiśException {
        throw new JakiśException("Specjalna wiadomość");
    }
}
