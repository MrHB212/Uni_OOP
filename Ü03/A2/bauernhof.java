import java.util.ArrayList;

public class bauernhof{

public static void main(String[] args) {
    ArrayList<String> hof = new ArrayList<>();
    hof.add("Kühe");
    hof.add("Ochsen");
    hof.add("Hühner");
    hof.add("Tiger");

    for(String ausgabe: hof){
        System.out.println(ausgabe);
        System.out.println();
    }

    if(hof.contains("Tiger")) hof.remove("Tiger");
    

    for(String ausgabe: hof){
        System.out.println(ausgabe);
    }


    }
}

/*
Array: Hat eine feste größe und ist schneller, länge muss bekannt sein
ArrayList: Dynamische länge aber langsamer, einfaches hinzufügen
 */