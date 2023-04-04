import java.util.concurrent.Semaphore;

public class Contatore {
    public int cont;
    public Semaphore s;
    //creo l'oggetto di tipo semaforo

    public Contatore(int cont) {
        this.cont = cont;
        this.s = new Semaphore(1);
    }

    synchronized public void incrementa(int n) {

        try{
            this.s.acquire();
            this.cont += n;
            this.s.release();
        } catch (InterruptedException e){}
    }
    public void decrementa(int n) {
        try{
            this.s.acquire();
            this.cont -= n;
            this.s.release();
        }catch (InterruptedException e) {}
    }
}

