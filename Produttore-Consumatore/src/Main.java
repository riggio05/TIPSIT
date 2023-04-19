public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Produttore produttore = new Produttore("p1", buffer);
        Consumatore consumatore = new Consumatore("c1", buffer);
        System.out.println("Inizio processo principale");
        consumatore.start();
        produttore.start();
        try{
            produttore.join();
            consumatore.join();
        } catch (InterruptedException e) {}
        System.out.println("Fine processo principale");

    }
}