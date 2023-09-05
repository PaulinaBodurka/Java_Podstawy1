package Klasy;

public class MatmaZadanie {
    public static double PI = 3.14;

    public static double obwodKola(double r){
     //   double wynik = 0;
     //   wynik = 2* pi * r;
        return 2*PI*r;
    }
    public static double poleKola(double r){
        return PI* r*r;
    }
    public static double obwodProstokata(double a,double b){
       return 2*(a+b);
    }
    public static double poleProstokata(double a, double b){
        return a*b;
    }
}
