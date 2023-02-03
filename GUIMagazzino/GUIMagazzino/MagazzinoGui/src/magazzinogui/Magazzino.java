/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magazzinogui;
import java.util.ArrayList;
/**
 *
 * @author simone.riggio
 */
public class Magazzino {
    public ArrayList <Prodotto> v=new ArrayList<>();
public Magazzino(){
//all'inizio il magazzino è vuoto, non ho prodotti
}
// aggiungi prodotto, togli prodotto, restituisci prodotto, stampa tutti prodotti,
// ricerca prodotto, modifica prodotto
//aggiungi prodotto
//non ci possono essere due prodotti con lo stesso codice
//posso aggiungere se l'array non è pieno e se il prodotto non c'è.
public boolean aggiungi(String c, String n,int q, double p){
if((ricerca(c)==-1)){
//aggiungo il prodotto
Prodotto prodotto =new Prodotto(c,n,q,p);
v.add(prodotto);
return true;
}
else{
return false; //non aggiungo il prodotto
}
}
//ricerca di un prodotto, restituisce la posizione del prodotto nell'array,
// oppure -1 se non c'è
public int ricerca(String c) {
int i = 0;

while (i < v.size()) {
if (c.equals(v.get(i).codice)){
return i; //se l'ho trovato
}
i = i + 1;
}
return -1; //se non l'ho trovato
}
//stampa gli attributi di un prodotto che cerchiamo tramite il codice
public void stampaProdotto(String c){
int esitoRicerca=ricerca(c);
if(esitoRicerca!=-1){
//se l'ho trovato
v.get(esitoRicerca).stampa();
}
else{
//non l'ho trovato
System.out.println("il prodotto non esiste!!");
}
}
//stampa tutti i prodotti con i loro attributi
public void stampaTuttiProdotti(){
for (int i = 0; i < v.size(); i++) {
v.get(i).stampa();
System.out.println("---------------------");
}
}
//modifica la quantità del prodotto ricercato per codice
//se il prodotto non esiste restituisce false, altrimenti true
public boolean modificaQuantità(String c, int q){
int esitoRicerca=ricerca(c);
if(esitoRicerca!=-1){
//il prodotto c'è
v.get(esitoRicerca).setQuantità(q);
//modifico la quantità
return true;
}
else{
//il prodotto non c'è e quindi non riesco a modificare la quantità

return false;
}
}
//il metodo elimina un prodotto ricercato per codice
//restituisce false se il prodotto non esiste, altrimenti restituisce true
public boolean eliminaProdotto(String c) {

int esitoRicerca=ricerca(c);
if(esitoRicerca!=-1){
//il prodotto c'è e quindi devo eliminarlo
v.remove(esitoRicerca);
return true;
//funziona anche se c'è un solo elemento nell'array.
}
else{
//il prodotto non c'è
return false;
}
}
}
