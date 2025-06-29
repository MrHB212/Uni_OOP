import java.util.ArrayList;

public abstract class B_pizza extends A_ital_essen{

    private ArrayList<String> zutaten = new ArrayList<>();

    public abstract void zubereiten();
    
    public B_pizza(String name, float preis, int kalorien, boolean vegetarisch){
        super(name, preis, kalorien, vegetarisch);
    }


    public void teigHerstellen(){
        System.out.println("Der Pizzateig wird aus Hefe, Zucker, Öl, Mehl, Salz und Wasser geknetet.");
    }

    public void backen(){
        System.out.println("Die Calzone/Pizza wird zum backen in den Steinofen gegeben.");
    }

    public void servieren(){
        System.out.println("Die Calzone/Pizza wird dem Kunden serviert");
        System.out.println(String.format("Kalorien: " + kalorien + " kcal, " +
                            "Preis: %.2f Euro", preis) + ", Vegetarisch: " + (vegetarisch ?  "Ja" : "Nein"));
        System.out.print("Zutaten: ");
        ZutatenAusgabe();
        System.out.println();
    }



     public void ZutatenAusgabe(){
        for(int i = 0; i<zutaten.size(); i++){
            System.out.print(zutaten.get(i) + ", ");
        }
        System.out.println();
    }

    
    //Zutatenliste für die Pizza
    public void zutaten(){
        zutaten.add("Tomatenmark");
        zutaten.add("Champignons");
        zutaten.add("Käse");
        zutaten.add("rote Paprika");
        zutaten.add("Oliven");
    }

    public void zutaten(String zutat1){
        zutaten.add(zutat1);
    }

    public void zutaten(String zutat1, String zutat2){
        zutaten.add(zutat1);
        zutaten.add(zutat2);
    }

    public void zutaten(String zutat1, String zutat2, String zutat3){
        zutaten.add(zutat1);
        zutaten.add(zutat2);
        zutaten.add(zutat3);

    }

    public void zutaten(String zutat1, String zutat2, String zutat3, String zutat4){
        zutaten.add(zutat1);
        zutaten.add(zutat2);
        zutaten.add(zutat3);
        zutaten.add(zutat4);
    }

    public void zutaten(String zutat1, String zutat2, String zutat3, String zutat4, String zutat5){
        zutaten.add(zutat1);
        zutaten.add(zutat2);
        zutaten.add(zutat3);
        zutaten.add(zutat4);
        zutaten.add(zutat5);
    }

}