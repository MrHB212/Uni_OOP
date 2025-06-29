public class Testklasse {
    public static void main(String[] args) {
        //Jedes Gericht wird deklariert
        B_eis eis = new B_eis("Schokolade", 3, false, "Becher", 1F, 100, false);
        C_spaghetti pasta_spaghetti = new C_spaghetti("Spaghetti", 5, 500, true, true);
        C_original pizza_original = new C_original("Vegetarische Pizza", 10, 800, true, true);
        C_calzone pizza_calzone = new C_calzone("Vegetarisch", 10, 800, true);
        C_canelloni pasta_canelloni = new C_canelloni("Fleisch", 15, 1200, false);
        C_lasagne pasta_lasagne = new C_lasagne("Normal", 15, 1500, false);
            


        //Rufe einmal jede Funktion der Gerichte auf
        eis.zubereiten();
        eis.servieren();
        System.out.println();

        pasta_spaghetti.zutaten(); //Sollte bei Zutaten keine angegeben sein, wird eine Standardliste verwendet
        pasta_spaghetti.zubereiten();
        pasta_spaghetti.servieren();
        System.out.println();

        pizza_original.zutaten("Das", "sind", "keine", "zutaten");
        pizza_original.zubereiten();
        pizza_original.servieren();
        System.out.println();

        pizza_calzone.zutaten();
        pizza_calzone.zubereiten();
        pizza_calzone.servieren();
        System.out.println();

        pasta_canelloni.zutaten();
        pasta_canelloni.zubereiten();
        pasta_canelloni.servieren();
        System.out.println();

        pasta_lasagne.zutaten();
        pasta_lasagne.zubereiten();
        pasta_lasagne.servieren();
        System.out.println();

    }
}
