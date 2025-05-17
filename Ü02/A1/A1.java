public class A1 {
    static int zahl;

    public static void main(String[] args) {

    zahl = 20;
    // falls zahl zwischen 30 und 50 liegt
    if(zahl > 30 && zahl < 50){
        System.out.println("A");
    }
    

    zahl = 80;
    // falls zahl zwischen 20 und 40 oder zwischen 70 und 90 liegt
    if((zahl > 20 && zahl < 40) || (zahl > 70 && zahl < 90)){
        System.out.println("B");
    }
    

     zahl = 27;
    // falls zahl kleiner als 20 oder größer als 30 und ungerade ist
    if(zahl < 20 || (zahl >= 30 && zahl % 2 != 0)){
        System.out.println("C");
    }
    

    zahl = 32;
    // falls zahl durch 4 teilbar ist und nicht 40 ist
    if(zahl % 4 == 0 && zahl != 40){
        System.out.println("D");
    }
    

    zahl = 0;
    // falls zahl größer als -1 oder kleiner als -5 ist oder zwischen 10 und 15 liegt
    if((zahl > -1 || zahl < -5) || (zahl > 10 && zahl < 15)){
        System.out.println("E");
    }
    
    }
}

/*
BDE
b) zahl = 20, 80, 27, 32, 0
*/