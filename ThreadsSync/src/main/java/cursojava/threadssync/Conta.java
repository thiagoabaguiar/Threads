package cursojava.threadssync;

public class Conta implements Runnable {

    private float saldo;

    public float getSaldo() {
        return saldo;
    }

//    public void depositar(float valor) {
//        synchronized (this) {
//            this.saldo += valor;
//        }
//    }
    
    public synchronized void depositar(float valor){
        this.saldo += valor;
    }    

    @Override
    public void run() {
        this.depositar(10f);
    }

}
