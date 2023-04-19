import java.util.ArrayList;

public class Buffer {
    private ArrayList<Integer> buffer = new ArrayList<Integer>();
    private int max = 100;
    public void aggiungi(int n, String nome) {
        synchronized(this){
            while (buffer.size() == max) {
                try {
                    System.out.println("Thread " + nome + " in attesa");
                    wait();
                } catch (InterruptedException e) {}
            }
            buffer.add(n);
            notifyAll();
            System.out.println("Thread " + nome + " ha aggiunto il dato " + n);
        }
    }
    public int rimuovi(String nome) {
        synchronized (this) {
            while (buffer.size() == 0) {
                try {
                    System.out.println("Thread " + nome + " in attesa");
                    wait();
                } catch (InterruptedException e) {
                }
            }
            int n = buffer.get(0);
            buffer.remove(0);
            notifyAll();
            System.out.println("Thread " + nome + " ha prelevato dal buffer " + n);
            return n;
        }
    }
}