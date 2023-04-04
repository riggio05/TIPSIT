import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        Semaphore binario=new Semaphore(1);
        Treno t1=new Treno(1,2,binario);
        Thread thread1=new Thread(t1);
        thread1.start();
    }
}