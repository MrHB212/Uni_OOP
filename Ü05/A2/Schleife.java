public class Schleife {


    public static void main(String[] args) {
        gerahmteAusgabe('O', '#');
        System.out.println();
        gerahmteAusgabe('9', 3, 'X');
        System.out.println();
        gerahmteAusgabe("Hallo Welt!",'+');
        System.out.println();
        gerahmteAusgabe("Dies ist eine Ausgabe", 2,'?');
}

    
    // Die Ausgabe beinhaltet nur 1 Zeichen und Rahmen immer gleich
    public static void gerahmteAusgabe(char ausgabe, char zeichen) {
        String ausgabeParameter = String.valueOf(ausgabe);
        zeichne(5, true, zeichen);
        output(ausgabeParameter, 1, zeichen);
        zeichne(5, true, zeichen);
    }

    
    public static void gerahmteAusgabe(char ausgabe, int rahmendicke, char zeichen) {
        String ausgabeParameter = String.valueOf(ausgabe);
        zeichneMehrfach(rahmendicke, ausgabeParameter.length(), zeichen);
        output(ausgabeParameter, rahmendicke, zeichen);
        zeichneMehrfach(rahmendicke, ausgabeParameter.length(), zeichen);

    }

    public static void gerahmteAusgabe(String ausgabe, char zeichen) {
        zeichne(ausgabe.length()+4, true, zeichen);
        output(ausgabe, 1, zeichen);
        zeichne(ausgabe.length()+4,true, zeichen);
        
    }

    public static void gerahmteAusgabe(String ausgabe, int rahmendicke, char zeichen) {
        zeichneMehrfach(rahmendicke, ausgabe.length(), zeichen);
        output(ausgabe, rahmendicke, zeichen);
        zeichneMehrfach(rahmendicke, ausgabe.length(), zeichen);
    }

    
    //Zeichnet eine Zeile von Zeichen
    public static void zeichne(int rahmendicke, boolean leerzeile, char zeichen){
        for(int i = 0; i!= rahmendicke; ++i){
            System.out.print(zeichen);
        }
        if (leerzeile) System.out.println();
    }

    //Zeichnet mehrere Zeilen von zeichen
    public static void zeichneMehrfach(int rahmendicke, int ausgabelänge, char zeichen){
        for(int i = 0; i != rahmendicke; i++){
            zeichne(rahmendicke * 2 + ausgabelänge+2, true, zeichen);
        }
    }

    //Gibt Ausgabe mit Rahmen aus
    public static void output(String ausgabe, int rahmendicke, char zeichen){
        zeichne(rahmendicke, false, zeichen);
        System.out.print(" " + ausgabe + " ");
        zeichne(rahmendicke, true, zeichen);

    }



    
}