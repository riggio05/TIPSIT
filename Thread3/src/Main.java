public class Main {
    public static void main(String[] args) {

        long start, stop;

        double tempo; // tempo di esecuzione del processo

        System.out.println("inizio del processo principale");
        Concorrenza t1 = new Concorrenza("t1");
        Concorrenza t2 = new Concorrenza("t2");
        Concorrenza t3 = new Concorrenza("t3");

        start = System.currentTimeMillis();
        //restituisce un valore long.
        //conta i millisecondi passati dal 1 gennaio del 1970

        t1.start();
        t2.start();
        t3.start();

        //try e catch OBBLIGATORIO
        try {
            t1.join();
            //aspetta che t1 termini
            t2.join();
            t3.join();
        } catch (Exception e) {
        }
        //le istruzioni dopo i join sicuramente saranno eseguite solamente
        //dopo che i thread sono terminati
        stop = System.currentTimeMillis();
        tempo = (double)(stop-start)/1000;

        System.out.println("fine del processo principale" + ", durata: " +tempo + " secondi");
    }
}