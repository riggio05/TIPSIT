import java.util.concurrent.Semaphore;
public class Main {
    public static void main(String[] args) {
        Semaphore scambio1 = new Semaphore(1);
        Semaphore scambio2 = new Semaphore(1);
        Semaphore stazione1 = new Semaphore(1);
        Semaphore stazione2 = new Semaphore(1);
        Semaphore stazione3 = new Semaphore(1);
        Treno t1 = new Treno(1, 2, scambio1, stazione1, stazione2);
        Treno t2 = new Treno(2, 3, scambio2, stazione2, stazione3);
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
    }
}