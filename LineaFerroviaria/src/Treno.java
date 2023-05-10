import java.util.concurrent.Semaphore;

public class Treno implements Runnable {
    private int stPartenza;
    private int stArrivo;
    private Semaphore scambio;
    private Semaphore stazionePartenza;
    private Semaphore stazioneArrivo;
    public Treno(int stPartenza, int stArrivo, Semaphore scambio, Semaphore stazionePartenza, Semaphore stazioneArrivo) {
        this.stPartenza = stPartenza;
        this.stArrivo = stArrivo;
        this.scambio = scambio;
        this.stazionePartenza = stazionePartenza;
        this.stazioneArrivo = stazioneArrivo;
    }
    public void run() {
        while (true) {
            try {
                stazionePartenza.acquire();
                System.out.println("La partenza è prevista dalla stazione " + stPartenza);
                stazionePartenza.release();
                if (scambio != null) {
                    scambio.acquire();
                    stazionePartenza.acquire();
                    System.out.println("Il treno si trova sulla tratta " + stPartenza + "-" + stArrivo + "(passaggio allo scambio)");
                    stazionePartenza.release();
                    Thread.sleep(1000); // simulazione del tempo di passaggio allo scambio
                    stazioneArrivo.acquire();
                    System.out.println("Il treno si trova sulla tratta " + stPartenza + "-" + stArrivo + "(passaggio allo scambio)");
                    System.out.println("L'arrivo è previsto alla stazione " + stArrivo);
                    stazioneArrivo.release();
                    scambio.release();
                } else {
                    stazioneArrivo.acquire();
                    System.out.println("Il treno si trova sulla tratta " + stPartenza + "-" + stArrivo);
                    System.out.println("L'arrivo è previsto alla stazione " + stArrivo);
                    stazioneArrivo.release();
                }
                break;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
