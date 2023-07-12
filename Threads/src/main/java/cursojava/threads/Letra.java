package cursojava.threads;

public class Letra implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 100; i++) {
            System.out.println("      LETRA");
        }
    }

}
