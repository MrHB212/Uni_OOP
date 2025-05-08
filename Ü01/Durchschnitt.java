public class Durchschnitt {
    public static void main(String[] args) {
        // Deklariere hier die Zahlen
        float x = 3.8F;
        float y = 4.7F;
        float z = 5.2F;
        
        float ergebnis = berechne (x,y,z); //Ruft die Methode auf ind speichert den zurückgegebenen Wert in ergebnis
        System.out.println("Der Durchschnitt beträgt: " + ergebnis); //Gibt das Ergebnis aus
        System.out.println("Verwendet wurden die Zahlen : " + x + ", " + y + ", " + z);
    }
    
    private static float berechne(float a, float b , float c){
        float value = (a + b + c) / 3; //Berechnet den Durchschnitt
        return value; //Gibt das Ergebnis zurück
    }
}
