import java.util.concurrent.Semaphore;

public class Contatore {
    public int cont;
    public Semaphore s;
    //creo l'oggetto di tipo semaforo

    public Contatore(int cont) {
        this.cont = cont;
    }

    synchronized public void incrementa(int n) { //MONITOR
        //quando un thread tenta dieseguire
        //il metodo sincronizzato per poterlo fare
        //deve acquisire un lock sull'oggetto
        //se nessun altro thread possiede il lock
        //allora il thread considerato lo acquisisce

        //accade che 1 solo thread alla volta accede al metodo
        this.cont = this.cont + n;
        //quando il metodo termina il lock viene rilasciato
    }
    public void decrementa(int n) {
        synchronized (this){
            //inseriamo le istruzioni da sincronizzare nel blocco
            //synchronized devo passare come parametro l'ogetto rispetto
            //al quale acquisre il locj
        }
        this.cont = this.cont - n;

    }
}

