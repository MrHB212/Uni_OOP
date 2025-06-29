// Enthält Informationen über die Fahrzeuge sowie ob es verfügbar ist

public class Fahrzeug {
    String Bezeichnung; // Dient zur Ausgabe welches Auto vermietet wurde z.B. Auto1. Verdeutlicht test
    String Fahrzeugtyp;
    String Marke;
    int Baujahr;
    int MietpreisTag;
    boolean Verfügbar;


    // Konstruktor
    public Fahrzeug(String Bezeichnung, String Fahrzeugtyp, String Marke, int Baujahr, int MietpreisTag, boolean Verfügbar) {
        this.Bezeichnung = Bezeichnung;
        this.Fahrzeugtyp = Fahrzeugtyp;
        this.Marke = Marke;
        this.Baujahr = Baujahr;
        this.MietpreisTag = MietpreisTag;
        this.Verfügbar = Verfügbar;
    }
}