package WyjątkiZadania;

public class Main {
    public static void main(String[] args) throws ArithmeticException{
      try {
          int a = 2;
          int b = 0;

          int wynik = a / b;

          System.out.println(wynik);
      }catch (ArithmeticException e){
          System.out.println("nie wolno dzielić przez zero");
      }
    }

}
