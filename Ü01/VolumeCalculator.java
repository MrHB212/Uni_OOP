import java.util.*;

public class VolumeCalculator {
    public static void main(String[] args) {
        float a, b, c = 0F;
        Scanner input = new Scanner(System.in);

        //Nimmt 3 Eingaben des benutzers entgegen
        System.out.print("Gib die erste Seitenlänge ein: ");
        a = (float) input.nextFloat();
        System.out.print("Gib die zweite Seitenlänge ein: ");
        b = (float) input.nextFloat();
        System.out.print("Gib die dritte Seitenlänge ein: ");
        c = (float) input.nextFloat();
        input.close();

        //Überprüft ob es Seitenlängen gibt die 0 oder kleiner sind
        //Je nachdem wird das Volumen ausgerechnet oder eine Fehlermeldung ausgegeben
        if(a <= 0 || b <= 0 || c <= 0){
            System.out.println("Eine der Seitenlängen ist ungültig");
        }else{
            System.out.println("Das Volumen des Würfels beträgt: " + (a*b*c) + " m³");
        }
        
    }
}
