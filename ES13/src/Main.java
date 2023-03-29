public class Main {
    public static void main(String[] args) {
        System.out.println("inzio del processo principale");
        //creo l'oggetto condiviso
        //e poi lo passo a tuttti i thread
        Contatore cont = new Contatore(0);
        Concorrenza t1 = new Concorrenza("t1", cont);
        Concorrenza t2 = new Concorrenza("t2", cont);
        Concorrenza t3 = new Concorrenza("t3", cont);
        Concorrenza t4 = new Concorrenza("t4", cont);
        Concorrenza t5 = new Concorrenza("t5", cont);
        Concorrenza t6 = new Concorrenza("t6", cont);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        //aspetto prima che i thread finiscano
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
        } catch (Exception e) {}
        System.out.println("valore finale del contatore " + cont.cont);
        System.out.println("fine del processo");
    }
}