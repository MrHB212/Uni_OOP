public class C_calzone extends B_pizza{

    public C_calzone(String name, float preis, int kalorien, boolean vegetarisch){
        super(name, preis, kalorien, vegetarisch);
    }

    public void zubereiten(){
        System.out.println("Die Calzone wird zur Hälfte mit den Zutaten bedeckt und dann zusammengeklappt.");
        
    }
}