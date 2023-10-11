package Watki;

public class MainWatkiJoinIIsAlive {
    public static void main(String[]args){
        System.out.println("Start");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0; i< 3; i++){
                    System.out.println("Ciężka praca " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        });
        thread.start();
        System.out.println("Stop");

}
}
