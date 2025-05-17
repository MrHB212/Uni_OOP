import java.io.*;

public class wochenplaner {
    
    public static void main(String[] args) {
        // Lese eingabe
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        System.out.print("Eingabe :");
        
        // Fange Fehler ab
        try{
            s = in.readLine().toLowerCase();

        } catch(IOException ex){
            System.out.println("Fehler beim lesen");
        }

        // Ausgabe je nach Eingabe
        switch(s){
        case "montag":
            System.out.println("To-Do: Lernen mit Helmut");
            break;

        case "dienstag":
            System.out.println("To-Do: Sport");
            break;

        case "mittwoch":
            System.out.println("To-Do: Grillparty bei Hermann");
            break;

        case "donnerstag":
            System.out.println("To-Do: OOP Abgabe mit Gruppe");
            break;

        case "freitag":
            System.out.println("To-Do: Umzug bei Brunhilde");
            break;

        case "samstag":
            System.out.println("To-Do: Lernen mit Ulm");
            break;

        case "sonntag":
            System.out.println("To-Do: Zum Tierarzt mit Susanne");
            break;

        default:
            System.out.println("Eingabe war kein Wochentag");
            break;
        
    }
    }

    
}