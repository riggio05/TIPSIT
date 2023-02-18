public class Main {

    /*Il Proxy pattern fornisce una rappresentazione di un oggetto
    che può essere difficile da accedere o richiede un tempo significativo
    per la creazione o l'accesso. Il Proxy permette di posticipare l'accesso
    o la creazione dell'oggetto reale fino al momento in cui è effettivamente richiesto.
    In altre parole, il Proxy funge da intermediario tra il client e l'oggetto reale,
    ritardando l'accesso all'oggetto fino a quando non è necessario e migliorando così
    le prestazioni e l'efficienza del sistema complessivo.*/

   /* Il mio obiettivo era quello di sviluppare un algoritmo di download
    video il più efficace possibile. Per realizzare ciò dovevo fare in modo
    che il download di un video non venisse fatto più di una volta, poiché
    scaricare due volte lo stesso video sarebbe una perdita di tempo.*/
    public static void main(String[] args) {
        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("video1");
        videoDownloader.getVideo("video1");
        videoDownloader.getVideo("video2");
        videoDownloader.getVideo("video1");
    }
}