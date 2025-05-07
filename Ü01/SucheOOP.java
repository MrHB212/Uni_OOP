public class SucheOOP {
    public static void main(String[] args) {
        String input = "Das ist ein Satz in der nach OOP. gesucht wird"; //Der zu untersuchende Satz
        
        suche(input); //Ruft die Methode auf
    }

    private static void suche(String arg){
        //Wenn OOP gefunden wird, wird ein Text ausgegeben
        if (arg.contains("OOP")){
            System.out.println("Der Satz enthält OOP"); 
        }
    }
}
