public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int[] b = {9,8,7,6,5,4,3,2,1};

        Vettore v = new Vettore(a,b);
        Concorrenza[] threads = new Concorrenza[a.length];
        for (int i = 0; i < a.length; i++) {
            Concorrenza t = new Concorrenza("" + i, v, i);
            t.start();
            threads[i] = t;
        }

        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < v.getC().length; i++) {
            System.out.println(v.getC()[i]);
        }

    }
}