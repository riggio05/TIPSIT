import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long start, stop;
        double time;
        int[] a = {1, 2, 3, 4};
        int[] b = {9, 8, 7, 6};

        Vettore v = new Vettore(a, b);
        start = System.currentTimeMillis();
        System.out.println("inizio del processo principale");
        Concorrenza t1 = new Concorrenza("thread 1", v, 0);
        Concorrenza t2 = new Concorrenza("thread 2", v, 1);
        Concorrenza t3 = new Concorrenza("thread 3", v, 2);
        Concorrenza t4 = new Concorrenza("thread 4", v, -1);
        t1.run();
        t2.run();
        t3.run();
        t4.run();
        t4.join();
        System.out.println(Arrays.toString(v.getC())); //vettore c
        System.out.println("fine del processo principale");
        stop = System.currentTimeMillis();
        time = (double) (stop - start) / 1000;
        System.out.println("durata del processo principale: " + time + " s");
    }

}