import java.util.ArrayList;
/*
* Diese Klasse ermöglicht es, beliebig viele Artikel in einer
* Einkaufsliste zu speichern und einzelne Einträge abzurufen.
*/
public class Einkaufsliste {

    // Die Einkaufsliste wird intern mithilfe einer ArrayList implementiert.
    private ArrayList<String> speicher = new ArrayList<>();
    
    // Hängt den Artikel an das Ende der Liste an.
    public void notiere(String artikel) {
        speicher.add(artikel);
    }


    // Gibt den Eintrag an entsprechender Stelle (beginnend mit 0) zurück.
    public String eintrag(int index) {
        if(index <= speicher.size()-1){
            return speicher.get(index);
        }
        return "FEHLER";
    }

    // Gibt Anzahl der Elemente zurück
    public int anzahlEintraege(){
        return speicher.size();
    }

    public void loescheEintrag(int index){
        if(index <= speicher.size()-1){
            speicher.remove(index);
        }else{
            System.out.println("Das zu löschende Index ist nicht gültig");
        }
    }

    public void loescheAlles(){
        speicher.clear();
    }

    public boolean enthaelt(String artikel){
        if (speicher.contains(artikel)) return true;
        return false;
    }

}

