import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("inizio del processo principale");
        Concorrenza t1 = new Concorrenza("t1");
        Concorrenza t2 = new Concorrenza("t2");
        Concorrenza t3 = new Concorrenza("t3");

        //creo 3 oggetti della classe Concorrenza



        //creo 3 oggetti della classe Thread e passo al costruttore un oggetto
        //della classe Concorrenza
        //la classe Thread ha più costruttori: ad uno devo passare una stringa,
        //ad un altro devo passare un oggetto di una classe che implementa Runnable

        // il thread t1 per conoscere qual è il metodo run deve avere accesso all'oggetto th1
        //mando in esecuzione il thread

        t1.start();
        t2.start();
        t3.start();
        System.out.println("fine del processo principale");
        //non conosco a priori l'ordine in cui finiscono i thread

        //creo 100 thread con un ciclo for in maniera concorrente
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            new Concorrenza("t" + r.nextInt(100)).start();
        }
    }
}