/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lentokentta;

/**
 *
 * @author Nekuin
 */
public class Lento {

    private String lahtopaikka;
    private String kohdepaikka;
    private Lentokone lentokone;
    
    public Lento(String lahtopaikka, String kohdepaikka, Lentokone lentokone) {
        this.lahtopaikka = lahtopaikka;
        this.kohdepaikka = kohdepaikka;
        this.lentokone = lentokone;
    }
    
    public String getLahtopaikka(){
        return this.lahtopaikka;
    }
    
    public String getKohdepaikka(){
        return this.kohdepaikka;
    }
    
    public void lisaaLentokone(Lentokone lentokone){
        this.lentokone = lentokone;
    }
    
    @Override
    public String toString(){
        return lentokone.toString() + " (" + this.lahtopaikka + "-" + this.kohdepaikka + ")";
    }
    
}
