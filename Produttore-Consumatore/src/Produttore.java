public class Produttore extends Thread {
    public Buffer b; // è condiviso
    public Produttore(String nome, Buffer b){
        super(nome);
        this.b = b;
    }

    public void run(){
        System.out.println("Partenza del produttore " +getName());
        for (int i = 0; i < 500; i++) {
            int n = (int)(Math.random()*10);
            b.aggiungi(n, getName());
        }
        System.out.println("Fine del produttore " +getName());
    }
}
