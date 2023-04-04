import java.util.concurrent.Semaphore;

public class Treno implements Runnable{
    private int stPartenza;
    private int stArrivo;
    private Semaphore s; //binario che collega le due stazioni
    public Treno(int stPartenza, int stArrivo, Semaphore s){
        this.stPartenza=stPartenza;
        this.stArrivo=stArrivo;
        this.s=s;
    }
    public void run(){
        while(true){
            System.out.println("La partenza è prevista dalla stazione "+stPartenza);
            try{
                s.acquire();
                System.out.println("Il treno si trova sulla tratta "+stPartenza+"-"+stArrivo);
                System.out.println("L'arrivo è previsto alla stazione "+stArrivo);
                s.release();
                break;
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
