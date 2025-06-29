public class C_original extends B_pizza {
    boolean käserand;

    public C_original(String name, float preis, int kalorien, boolean vegetarisch, boolean käserand){
        super(name, preis, kalorien, vegetarisch);
        this.käserand = käserand;
    }

    public void zubereiten(){
        System.out.println("Die Pizza wird mit den Zutaten bedeckt und zum backen vorbereitet. " + (käserand ? "Die Pizza hat einen Käserand" : "" ));
    }

}