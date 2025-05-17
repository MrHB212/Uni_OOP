public class break_continue {
    public static void main(String[] args) {
        boolean test = true;
        int a = 0;

        while(test){
            // beendet die Schleife wenn a = 10, auch wenn test = true
            if (a == 10){
                System.out.println("Beende Schleife"); 
                break;
            } 
            a++;
            if (a % 2 == 0) continue; // überspringt iteration wenn a gerade
            System.out.println(a);
            
        }

    }
}
