import java.util.ArrayList;

public class bauernhof{

public static void main(String[] args) {
    ArrayList<String> hof = new ArrayList<>();
    hof.add("Kühe");
    hof.add("Ochsen");
    hof.add("Hühner");
    hof.add("Tiger");

    // Gibt ArrayListe aus
    for(String ausgabe: hof){
        System.out.println(ausgabe);
    }
    System.out.println();

    if(hof.contains("Tiger")) hof.remove("Tiger"); // Entfernt Tiger aus der Liste falls vorhanden
    
    // Gibt ArrayListe aus
    for(String ausgabe: hof){
        System.out.println(ausgabe);
    }


    }
}
