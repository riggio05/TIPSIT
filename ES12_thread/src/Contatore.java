import java.util.concurrent.Semaphore;

public class Contatore {
    // classe usata per creare un oggetto condiviso tra i thread

    // Non creare l'oggetto condiviso dentro alla classe per creare
    // i thread altrimenti non creerete un oggetto condiviso
    // ma più oggetti diversi
    public int cont;
    public Semaphore s;
    //creo l'oggetto di tipo semaforo

    public Contatore(int cont) {
        //imposto il valore iniziale del contatore
        this.cont = cont;
        this.s = new Semaphore(1);
        //assegno l'ohggetto di tipo semaforo e passo al
        // costruttore il valore 1 perchè voglio che 1 solo thread
        //alla volta acceda alla sezione critica
    }

    //metodo per incrementare il contatore di n
    public void incrementa(int n) {
        //la zona di codice tra i metodi acquire e realise
        //è chiamata zona critica
        try {
            this.s.acquire();
            this.cont = this.cont + n;
            this.s.release();
        } catch (InterruptedException e) {}

        //quando un thread chiama il metodo acquire
        //tenta di acquisire il lock sul semaforo
        //Se nessun altro thread detiene il lock
        //gli viene assegnato altrimenti resta in attesa
        //Nel caso acquisisca il lock può eseguire la sezione critica
        //in questo modo risolvo il problema di accesso
        //a una risorsa condivisa da parte di più thread
    }

    //metodo per decrementare il contatore di n
    public void decrementa(int n) {
        try {
            this.s.acquire();
            this.cont = this.cont - n;
            this.s.release();
        } catch (Exception e) {
        }
    }
}
