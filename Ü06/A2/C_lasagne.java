public class C_lasagne extends B_pasta {

    public C_lasagne(String name, float preis, int kalorien, boolean vegetarisch){
        super(name, preis, kalorien, vegetarisch);
    }
    
    public void zubereiten(){
        System.out.println("Schicht für Schicht wird die Lasagne zubereitet");
    }
}
