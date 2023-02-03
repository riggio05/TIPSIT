/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magazzinogui;

/**
 *
 * @author simone.riggio
 */
public class Prodotto {
    public String codice; //univoco per ogni prodotto
    public String nome;
    public int quantità;
    public double prezzo;
    public Prodotto(String codice, String nome, int quantità,double prezzo) {
            this.codice = codice;
            this.nome = nome;
            this.quantità = quantità;
            this.prezzo = prezzo;
        }
//GET
    public String getCodice(){
        return this.codice;
    }
    public String getNome(){
        return this.nome;
    }
    public int getQuantità(){
        return this.quantità;
    }
    public double getPrezzo(){
        return this.prezzo;
    }
//SET
    public void setCodice(String codice){
        this.codice=codice;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setQuantità(int quantità){
        this.quantità=quantità;
    }
    public void setPrezzo(double prezzo){
        this.prezzo=prezzo;
    }
    public void stampa(){
        System.out.println("codice :"+this.codice);
        System.out.println("nome :"+this.nome);
        System.out.println("quantità :"+this.quantità);
        System.out.println("prezzo :"+this.prezzo+"€");
    }   
}
