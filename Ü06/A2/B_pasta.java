import java.util.ArrayList;

public abstract class B_pasta extends A_ital_essen {

    private ArrayList<String> zutaten = new ArrayList<>();

    public abstract void zubereiten();

    public B_pasta(String name, float preis, int kalorien, boolean vegetarisch){
        super(name, preis, kalorien, vegetarisch);
    }

    public void servieren(){
        System.out.println("Eine portion der Pasta wird auf einem Teller dem Kunden serviert");
        System.out.println(String.format("Kalorien: " + kalorien +
                            " Preis: %.2f Euro", preis) + ", Vegetarisch: " + (vegetarisch ?  "Ja" : "Nein"));
        System.out.print("Zutaten: ");
        ZutatenAusgabe();
    }

    public void ZutatenAusgabe(){
        for(int i = 0; i<zutaten.size(); i++){
            System.out.print(zutaten.get(i) + ", ");
        }
        System.out.println();
    }

    //Zutatenliste für die Soße
    //Falls keine Zutaten angegeben, normale Tomatensauce
    public void zutaten(){
        zutaten.add("Tomatenmark");
        zutaten.add("Basilikum");
        zutaten.add("Olivenöl");
        zutaten.add("Salz");
        zutaten.add("Pfeffer");
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
