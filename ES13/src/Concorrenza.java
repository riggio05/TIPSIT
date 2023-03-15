public class Concorrenza extends Thread{
    //creo un attributo che deve puntare all'oggetto
    public Contatore cont;
    //costruttore
    public Concorrenza(String nome, Contatore c) {
        //passo come parametro l'oggetto condiviso
        super(nome);
        this.cont = c;
        //assegno a cont l'oggetto condiviso
    }
    public void run()  {
        //il thread deve incrementare il contatore di un numero casuale
        System.out.println("inizio del thread" +getName());
        int n = (int)Math.random()*10; //numero casuale tra 0 e 9
        System.out.println("il thread " + getName() + " incrementa di " + n);
        this.cont.incrementa(n);
        System.out.println("fine del thread" + getName());
    }
}
