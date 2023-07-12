package cursojava.threads;

public class Threads {

    public static void main(String[] args) {

        Letra letra = new Letra();
        Audio audio = new Audio();
        Luzes luzes = new Luzes();

        Thread threadLetra = new Thread(letra);
        Thread threadAudio = new Thread(audio);
        Thread threadLuzes = new Thread(luzes);
        
        threadLetra.start();
        threadAudio.start();
        threadLuzes.start();

    }
}
