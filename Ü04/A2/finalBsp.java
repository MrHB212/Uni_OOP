public class finalBsp {
    //final besagt, dass die Variable nicht weiter verändert werden kann. (Konstante)
    //Allerdings kann sie erstmal als final deklariert werden ohne initialisierung, dadurch kann man den Wert einmalig später zuweisen

    public static void main(String[] args) {
        int a = 0;
        final int b;

        a++;
        System.out.println(a);

        b = 30;
        System.out.println(b);
        // b = 50; gibt eine Fehlermeldung

    }
}
