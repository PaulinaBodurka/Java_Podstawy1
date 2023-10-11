package Interfejs_abstrakcja.Zadanie2;

public class Kolo implements Figury{
    private double r;

    public Kolo(double r){
        this.r = r;
    }
    @Override
    public double obwód() {
        return 2 * Math.PI * r;
    }

    @Override
    public double pole() {
        return Math.pow(r,2);
    }
}
