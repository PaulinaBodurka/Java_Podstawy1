package Kurs;

public class InsWarZadania {
    public static void main(String[] args) {
        int a = 60;
        if (a % 2 == 0) {
            System.out.println("liczba parzysta:" + a);
        } else {
            System.out.println("liczba jest nieparzysta");
        }

        double wynagrodzenie = -500.0;
        double podatekPoniżejProgu;
        double podatekPowyżejProgu;
        double podatek1;
        if (wynagrodzenie < 0.0) {
            System.out.println("nie muszisz płacić podatku");
        } else if (wynagrodzenie <= 85528.0) {
            podatekPoniżejProgu = wynagrodzenie * 0.17;
            System.out.println("podatek dla nowego programisty: " + podatekPoniżejProgu);
        } else if (wynagrodzenie > 85528.0) {
            podatekPoniżejProgu = wynagrodzenie * 0.17;
            podatekPowyżejProgu = (wynagrodzenie - 85528.0) * 0.32;
            podatek1 = podatekPowyżejProgu + podatekPoniżejProgu;
            System.out.println("podatek powyżej progu: " + podatek1);
        }

        podatekPoniżejProgu = 2.0;
        podatekPowyżejProgu = 5.0;
        podatek1 = 0.0;
        char znak = 43;
        double var10000;
        switch (znak) {
            case 42:
                var10000 = podatekPoniżejProgu * podatekPowyżejProgu;
                break;
            case 43:
                var10000 = podatekPoniżejProgu + podatekPowyżejProgu;
            case 44:
            case 46:
            default:
                break;
            case 45:
                var10000 = podatekPoniżejProgu - podatekPowyżejProgu;
                break;
            case 47:
                var10000 = podatekPoniżejProgu / podatekPowyżejProgu;
        }

    }


    }
