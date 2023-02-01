public class Vettore {

    private int[] a, b, c;

    Vettore(int[] a, int[] b) {
        this.a = a;
        this.b = b;
        this.c = new int[a.length];
    }

    public void sommaComponente(int indice) {
        c[indice] = a[indice] + b[indice];
    }

    public int[] getC() {
        return c;
    }
}
