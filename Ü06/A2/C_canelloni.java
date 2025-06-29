public class C_canelloni extends B_pasta {
    
    public C_canelloni(String name, float preis, int kalorien, boolean vegetarisch){
        super(name, preis, kalorien, vegetarisch);
    }

    public void zubereiten(){
        System.out.println("Die Füllung der Canelloni wird mit regelmäßigem Abschmecken vorbereitet.");
        System.out.println("Danach werden die rohen Nudeln befüllt und in einer Auflaufform zubereitet.");
    }
}
