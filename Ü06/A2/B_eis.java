public class B_eis extends A_ital_essen{
    String sorte;
    int kugeln;
    boolean waffel;

    //Kalorien und Preis pro Kugel
    public B_eis(String sorte, int kugeln, boolean waffel, String name, float preis, int kalorien, boolean vegetarisch){
        super(name, preis, kalorien, vegetarisch);
        this.sorte = sorte;
        this.kugeln = kugeln;
        this.waffel = waffel;
    }

    public void zubereiten(){
        System.out.println("Es werden " + kugeln + " Kugeln " + sorte + "-Eis in ein" + (waffel ? "e Waffel gegeben": "en Becher gegeben."));
    }

    public void servieren(){
        System.out.println("Das Eis wird dem Kunden serviert.");
        System.out.println(String.format("Kalorien: " + kalorien*kugeln + " kcal, " +
                            "Preis: %.2f Euro", preis*kugeln));
    }
}
