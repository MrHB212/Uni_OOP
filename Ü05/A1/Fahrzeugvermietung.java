// Enthält Liste der der Fahrzeuge die Verfügbar sind in einer ArrayListe
// addFahrzeug: 
// vermieten: 
// getVerfügbareFahrzeuge: gibt verfügbare Fahrzeuge zurück

import java.util.*;
import java.lang.Exception;

class VermietungFehler extends Exception {
    public VermietungFehler(String message){
        super(message);
    }
}

public class Fahrzeugvermietung {
    
    private ArrayList<Fahrzeug> Fuhrpark = new ArrayList<>();

    public void addFahrzeug(Fahrzeug fahrzeug){
        Fuhrpark.add(fahrzeug);
        fahrzeug.Verfügbar = true;
    }

    public void vermieten(Fahrzeug fahrzeug) throws VermietungFehler{
        if(Fuhrpark.contains(fahrzeug)){
            fahrzeug.Verfügbar = false;
            System.out.println(fahrzeug.Bezeichnung + " wurde vermietet.");
            Fuhrpark.remove(fahrzeug);
            
        }else{
            throw new VermietungFehler("Das Fahrzeug ist nicht verfügbar.");
        }
    }

    // Anzahl Verfügbare Fahrzeuge
    public int getVerfügbareFahrzeuge(){
        return Fuhrpark.size();
    }

    // Gebe Verfügbare Fahrzeuge aus
    public void ListeVerfügbar(){
        int länge = Fuhrpark.size();
        System.out.println("---------- Fuhrpark ----------");
        for(int i = 0; i != länge; ++i){
            Fahrzeug f = Fuhrpark.get(i);
            System.out.println("("+f.Bezeichnung + ")  "+ "Typ:" + f.Fahrzeugtyp + " Marke:" + f.Marke +   " Baujahr:" + f.Baujahr +  " Mietpreis/Tag:" + f. MietpreisTag + " Verfügbar:" + f.Verfügbar);
        }
    }
}
