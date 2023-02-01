public class Concorrenza extends Thread {
    //implemento l'interfaccia Runnable
    public Concorrenza(String nome) {
        //costruttore
        super(nome);
    }
    public void run(){
        //codice del thread
        System.out.println("inizio del thread " + super.getName());
        System.out.println("fine del thread " + super.getName());
    }
    // quando Concorrenza estende già una classe allora per creare i thread
    // devo per forza implementare runnable
}
