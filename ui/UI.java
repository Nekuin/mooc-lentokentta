/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lentokentta.ui;

import java.util.Scanner;

/**
 *
 * @author Nekuin
 */
public class UI {
    
    public UI() {
        
    }
    
    public void printLentokenttaWelcome(){
        System.out.println("Lentokentän hallinta");
        System.out.println("--------------------");
        System.out.println();

    }
    
    public void printLentokenttaUI(){
        System.out.println("Valitse toiminto:");
        System.out.println("[1] Lisää lentokone");
        System.out.println("[2] Lisää lento");
        System.out.println("[x] Poistu hallintamoodista");
        System.out.print("> ");
    }
    
    public void printLentopalveluWelcome(){
        System.out.println("Lentopalvelu");
        System.out.println("------------");
        System.out.println();

    }
    
    public void printLentopalveluUI(){
        System.out.println("Valitse toiminto:");
        System.out.println("[1] Tulosta lentokoneet");
        System.out.println("[2] Tulosta lennot");
        System.out.println("[3] Tulosta lentokoneen tiedot");
        System.out.println("[x] Lopeta");
        System.out.print("> ");
    }
}
