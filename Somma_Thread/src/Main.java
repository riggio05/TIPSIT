public class Main {
    public static void main(String[] args) {
        //il main rappresenta il thread principale
        Concorrenza t1 = new Concorrenza("t1");
        Concorrenza t2 = new Concorrenza("t2");
        Concorrenza t3 = new Concorrenza("t3");
        //creo tre oggetti di tipo Concorrenza ma i thread
        //non sono ancora in esecuzione

        System.out.println("inizio del processo principale ");

        //adesso mando in esecuzione i 3 thread

        t1.start();
        t2.start();
        t3.start();     //non chiamare run
        System.out.println("fine del processo principale");
        //non conosciamo a priori l'ordine con cui i thread
        //terminano e anche il processo il processo principale

    }
}