package Kurs;

public class InsWarunkoweSwitch {
    public InsWarunkoweSwitch() {
    }

    public static void main(String[] args) {
        int wiek = 15;
        boolean przszedlRodzic = false;
        boolean przyszedlZMama = false;
        if (wiek >= 18) {
            System.out.println("pozwól na zakup");
        } else if (przszedlRodzic) {
            System.out.println("podaj");
        } else if (wiek < 18 && !przyszedlZMama) {
            System.out.println("pozwol na zakup");
        } else {
            System.out.println("nie pozwól na zakup");
        }

        int zmienna = 5;
        switch (zmienna) {
            case 1:
                System.out.println("jeden");
                break;
            case 2:
                System.out.println("dwa");
                break;
            case 3:
                System.out.println("trzy");
                break;
            case 4:
            default:
                System.out.println("nie spełniono zadnego przypadku powyższego");
                break;
            case 5:
                System.out.println("pięć");
        }

        char pojedynczyZnak = 98;
        switch (pojedynczyZnak) {
            case 65:
                System.out.println("podałeś duży znak");
                break;
            case 97:
                System.out.println("podałeś maly znak");
                break;
            default:
                System.out.println("nie znam tego znaku");
        }

        switch (zmienna) {
            case 1:
                System.out.println("jeden");
                break;
            case 2:
                System.out.println("dwa");
                break;
            case 3:
                System.out.println("trzy");
                break;
            case 4:
            default:
                System.out.println("nie znam tej liczby");
                break;
            case 5:
                System.out.println("pięć");
        }

    }
}
