public class summe {
    public static void main(String[] args) {
        int[] ungerade = new int[25];
        int zähler = 0;

        // Schreibe ungerade Zahlen in den array
        for(int a = 0; a != 51; ++a){
            if(a % 2 != 0){
                ungerade[zähler] = a;
                ++zähler;
            } 
        }

        zähler = 0; // wiederverwendung für die Summe

        // berechne Summe
        for(int zahl: ungerade) {
            zähler += zahl;
        }
        System.out.println("Summe :" + zähler);

        // Gebe array aus
        for(int a = 0; a != ungerade.length; ++a){
            System.out.println(a + " : " + ungerade[a]);
        }

    }
}
