public class C_spaghetti extends B_pasta{
    
    boolean parmesan;

    public C_spaghetti(String name, float preis, int kalorien, boolean vegetarisch, boolean parmesan){
        //super(name, preis, kalorien, vegetarisch);
        super(name, preis, kalorien, vegetarisch);
        this.parmesan = parmesan;
    }

    public void zubereiten(){
        System.out.println("Die Spaghetti werden traditionell mit etwas Salz in einem Top gekocht.");
        System.out.print("Parallel dazu wird eine Soße mit folgenden Zutaten vorbereitet: ");
        ZutatenAusgabe();
        if (parmesan == true && vegetarisch == true) vegetarisch = false;
    }


    public void servieren(){
        System.out.println("Die Spaghetti werden zusammen mit der Soße auf einem Teller dem Kunden serviert.");
        System.out.println(String.format("Kalorien: " + kalorien + " kcal, " +
                            "Preis: %.2f Euro, ", preis) + 
                            (vegetarisch ? "Vegetarisch: ja, " : "Vegetarisch: nein, ") +
                            (parmesan ? "Parmesan: ja" : "Parmesan: nein"));
    }

    
}
