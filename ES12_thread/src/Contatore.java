public class Contatore {
    // classe usata per creare un oggetto condiviso tra i thread

    // Non creare l'oggetto condiviso dentro alla classe per creare
    // i thread altrimenti non creerete un oggetto condiviso
    // ma più oggetti diversi
    public int cont;

    public Contatore(int cont) {
        //imposto il valore iniziale del contatore
        this.cont = cont;
    }

    //metodo per incrementare il contatore di n
    public void incrementa(int n) {
        this.cont = this.cont + n;
    }

    //metodo per decrementare il contatore di n
    public void decrementa(int n) {
        this.cont = this.cont - n;
    }
}
