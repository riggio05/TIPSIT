public class Consumatore extends Thread{
    public Buffer b; //è condiviso

    public Consumatore(String nome, Buffer b){
        super(nome);
        this.b = b;
    }
    public void run(){
        System.out.println("Partenza del consumatore "+ getName());
        for (int i = 0; i < 500; i++) {
            b.rimuovi(getName());
        }
        System.out.println("Fine del consumatore "+ getName());
    }
}
