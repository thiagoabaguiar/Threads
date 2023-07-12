package cursojava.threadssync;

public class ThreadsSync {

    public static void main(String[] args) {

        try {
            Conta minhaConta = new Conta();
            System.out.println("Saldo atual: " + minhaConta.getSaldo());
            minhaConta.depositar(50f);
            System.out.println("Saldo atual: " + minhaConta.getSaldo());
            
            Thread t1 = new Thread(minhaConta);
            Thread t2 = new Thread(minhaConta);
            
            t1.start();
            t2.start();
            
            t1.join();
            t2.join();
            
            System.out.println("========================================");
            
            System.out.println("Saldo atual: " + minhaConta.getSaldo());
            System.out.println("Saldo atual: " + minhaConta.getSaldo());
        } catch (InterruptedException ex) {
            System.out.println("ERRO");
        }

    }
}
