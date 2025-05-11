public class GanzeZahlen {
    public static void main(String[] args) {
        int summe = 0; //Variable für die Summe

        for (int a = 0; a != 20; a += 2){
            summe += a; //summe = summe + a
        }

        System.out.println("Die Summe der ersten 10 ganzen geraden Zahlen : " + summe); //Ausgabe summe
    }
}
