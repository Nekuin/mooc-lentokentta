package lentokentta;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import lentokentta.ui.*;

public class Main {

    private static List<Lentokone> lentokoneet;
    private static List<Lento> lennot;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        lentokoneet = new ArrayList<>();
        lennot = new ArrayList<>();
        UI ui = new UI();
        
        
        
        boolean lentokenttaHallinta = true;
        boolean lentopalvelu = false;
        
        ui.printLentokenttaWelcome();
        
        while(lentokenttaHallinta){
            ui.printLentokenttaUI();
            String input = scanner.nextLine();
            //System.out.println("");
            
            switch (input) {
                case "1":
                    lisaaLentokone(scanner);
                    break;
                case "2":
                    lisaaLento(scanner);
                    break;
                case "x":
                    lentokenttaHallinta = false;
                    break;
                default:
                    break;
            }
        }
        
        ui.printLentopalveluWelcome();
        lentopalvelu = true;
        while(lentopalvelu){
            ui.printLentopalveluUI();
            String input = scanner.nextLine();
            //System.out.println("");
            
            switch (input) {
                case "1":
                    
                    for(Lentokone lentokone : lentokoneet){
                        System.out.println(lentokone);
                    }
                    break;
                case "2":
                    for(Lento lento : lennot){
                        System.out.println(lento);
                    }
                    break;
                    
                case "3":
                    etsiKone(scanner);
                    break;
                case "x":
                    lentopalvelu = false;
                    break;
                
            }
        }
    }
    
    public static void lisaaLentokone(Scanner scanner){
        System.out.println("Anna lentokoneen tunnus: ");
        String tunnus = scanner.nextLine();
        System.out.println("Anna lentokoneen kapasiteetti: ");
        int kapasiteetti = Integer.parseInt(scanner.nextLine());
        lentokoneet.add(new Lentokone(tunnus, kapasiteetti));
    }
    
    public static void lisaaLento(Scanner scanner){
        System.out.println("Anna lentokoneen tunnus: ");
        String tunnus = scanner.nextLine();
        System.out.println("Anna lähtöpaikan tunnus: ");
        String lahtopaikka = scanner.nextLine();
        System.out.println("Anna kohdepaikan tunnus: ");
        String kohdepaikka = scanner.nextLine();
        
        Lentokone lentskari = null;
        
        for(Lentokone lentokone : lentokoneet){
            if(lentokone.getTunnus().equals(tunnus)){
                lentskari = lentokone;
            }
        }
        
        lennot.add(new Lento(lahtopaikka, kohdepaikka, lentskari));
    }
    
    public static void etsiKone(Scanner scanner){
        System.out.print("Mikä kone: ");
        String tunnus = scanner.nextLine();
        for(Lentokone lentokone : lentokoneet){
            if(lentokone.getTunnus().equals(tunnus)){
                System.out.println(lentokone);
            }
        }
    }
}
