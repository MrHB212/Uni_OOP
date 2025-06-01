public class tryCatch {
    // try-Catch wird verwendet um Fehler abzufangen und zu behandeln
    // Beispielsweise wenn bei einer Eingabe eine Zahl erwartet wird, allerdings ein Buchstabe eingegeben wird
    // Oder wenn ein Element in einem Array gesetzt wird und dabei eine Variable Indexangabe genutzt wird.
    public static void main(String[] args) {
        int[] zahlen = new int[5];
        int index = 6;

        try {
            zahlen[index] = 5;
        } catch (Exception e) {
            System.out.println("Index außerhalb des Arrays");
            System.out.println("Fehler: " + e); //Gibt Fehlermeldung aus
        }
        System.out.println();
        System.out.println("Try: Versucht den Code (mit potenziellen Fehlerquellen) auszuführen.");
        System.out.println("Catch: Fängt Fehler ab und dient zur Fehlerbehandlung. Speichert auch die Fehlermeldung.");
    }
    
}
