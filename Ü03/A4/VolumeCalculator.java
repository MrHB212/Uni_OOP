import java.util.InputMismatchException;
import java.util.Scanner;

public class VolumeCalculator{

    // Liest Eingabe aus und behandelt Fehleingaben
    private static int read(Scanner a){
        int readvar = 0;
        try {
            readvar = a.nextInt();
        } catch (InputMismatchException e) { // Input entspricht nicht dem Datenytyp das gelesen werden soll oder Zahl passt nicht in die variable (zu klein oder zu groß) https://docs.oracle.com/javase/7/docs/api/java/util/InputMismatchException.html
            System.out.println("Eingabe ist keine ganze Zahl (int) !");
            System.exit(1); // beendet programm
        }
        if(readvar <=0 ) {
            System.out.println("Zahl ist negativ oder 0 !");
            System.exit(1);
        }
        return readvar;
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c = 0;
        
        //Nimmt 3 Eingaben des benutzers entgegen
        System.out.print("Gib die erste Seitenlänge ein (m) : ");
        a = read(input);
        System.out.print("Gib die zweite Seitenlänge ein (m) : ");
        b = read(input);
        System.out.print("Gib die dritte Seitenlänge ein (m) : ");
        c = read(input);

        input.close();

        System.out.println("Das Volumen des Würfels beträgt: " + (a*b*c) + " m³");
        
        
    }

  
}