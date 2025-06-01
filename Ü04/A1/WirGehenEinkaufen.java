public class WirGehenEinkaufen {
    public static void main(String[] args) {
        Einkaufsliste liste = new Einkaufsliste();
        boolean test = true;

        liste.notiere("Zucker");
        liste.notiere("Bananen");
        System.out.println("Einkaufsliste");
        System.out.println("--------------");
        System.out.println(liste.eintrag(0));
        System.out.println(liste.eintrag(1));
        System.out.println("--------------");


        // Führt Code zum testen aus
        if(test == true){
            System.out.println();
            System.out.println("+++++ Test +++++");

            System.out.println("Anzahl der Einträge: " + liste.anzahlEintraege());

            if(liste.enthaelt("Zucker")){
                for(int i = 0; i != liste.anzahlEintraege()+1; ++i){
                    if(liste.eintrag(i) == "Zucker") liste.loescheEintrag(i);
                }
            }

            System.out.println("Anzahl der Einträge: " + liste.anzahlEintraege());

            //liste.loescheAlles();
            //System.out.println("Anzahl der Einträge: " + liste.anzahlEintraege());

            System.out.println(liste.eintrag(0));
            liste.loescheEintrag(0);
            System.out.println("Anzahl der Einträge: " + liste.anzahlEintraege());
        }
    }

  
}
