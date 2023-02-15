public class Main {
    public static void main(String[] args) {
        System.out.println("inzio del processo principale");
        //creo l'oggetto condiviso
        //e poi lo passo a tuttti i thread
        Contatore cont = new Contatore(0);
        Concorrenza t1 = new Concorrenza("t1", cont);
        Concorrenza t2 = new Concorrenza("t2", cont);
        Concorrenza t3 = new Concorrenza("t3", cont);
        t1.start();
        t2.start();
        t3.start();
        //aspetto prima che i thread finiscano
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {}
        System.out.println("valore finale del contatore " + cont.cont);
        System.out.println("fine del processo");
    }
}