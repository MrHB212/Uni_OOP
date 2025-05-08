public class GanzeZahlen {
    public static void main(String[] args) {
        int summe = 0; //Variable für die Summe

        for (int a = 0; a != 10; a++){
            summe += a; //summe = summe + a
        }

        System.out.println("Die Summe der ersten 10 ganzen Zahlen ab 0 : " + summe); //Ausgabe summe
    }
}
