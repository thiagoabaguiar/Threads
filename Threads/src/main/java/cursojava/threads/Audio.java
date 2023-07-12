package cursojava.threads;

public class Audio implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 100; i++) {
            System.out.println("AUDIO");
        }

    }

}
