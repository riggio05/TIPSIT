public class Concorrenza extends Thread{
    public Concorrenza(String nome) {
        super(nome);
    }
    public void run() {
        long start, stop;
        double tempo;
        //codice del run
        start = System.currentTimeMillis();
        System.out.println("inizio del thread " + getName());
        //double random = Math.random(); // numero casuale tra 0 compreso  e 1 escluso
        int n = (int)(Math.random()*1000); //numero casuale tra 0 compreso e 9
        try {
            Thread.sleep(n);
        } catch(Exception e) {}
        stop = System.currentTimeMillis();
        tempo = (double)(stop-start)/1000;
        System.out.println("fine del thread " + getName() + ", durata: " + tempo + "secondi");

    }

}
