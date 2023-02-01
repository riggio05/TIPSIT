public class Concorrenza extends Thread{
    //un thread è una porzione di codice che viene eseguita
    // in maniera concorrente agli altri thread concorrenti
    // (parallela: se avete più core e ognuno esegue
    //un thread diverso. Se avete 1 solo core i thread vengono eseguiti in maniera
    //alternata sull'ultimo core presente. Scaduto il timesslice la CPU viene assegnata
    //ad un altro thread.

    //estendi la classe Thread
    public Concorrenza(String nome) {
        super(nome);
        //chiamo il costruttore della superclasse Thread e passo il nome del thread
    }
    //overriding del metodo run
    public void run() {
        //codice del thread
        System.out.println("inizio del thread " + super.getName());
        //stampo il nome del thread
        System.out.println("fine del thread" + super.getName());
    }
}
