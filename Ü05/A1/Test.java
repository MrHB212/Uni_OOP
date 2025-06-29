public class Test {
    public static void main(String[] args) throws VermietungFehler {

        Fahrzeugvermietung Fuhrpark = new Fahrzeugvermietung();

        // Füge Autos hinzu
        Fahrzeug Auto1 = new Fahrzeug("Auto1", "PKW", "VW", 2012, 100, true);
        Fahrzeug Auto2 = new Fahrzeug("Auto2", "Bus", "Mercedes", 2012, 300, true);
        Fahrzeug Auto3 = new Fahrzeug("Auto3", "PKW", "Audi", 2018, 200, true);

        // Füge Autos der Fahrzeugvermietung hinzu
        Fuhrpark.addFahrzeug(Auto1);
        Fuhrpark.addFahrzeug(Auto2);
        Fuhrpark.addFahrzeug(Auto3);

        // Gebe Verfügbare Anzahl der Autos aus
        System.out.println("Verfügbare Fahrzeuge: " + Fuhrpark.getVerfügbareFahrzeuge());
        System.out.println();

        // Gibt alle Fahrzeuge aus
        Fuhrpark.ListeVerfügbar();

        // Vermiete Auto2
        Fuhrpark.vermieten(Auto2);
        System.out.println();

        Fuhrpark.ListeVerfügbar();

        System.out.println("Verfügbare Fahrzeuge: " + Fuhrpark.getVerfügbareFahrzeuge());
        System.out.println();

        // Teste Exception
        //Fuhrpark.vermieten(Auto2);

        Fuhrpark.addFahrzeug(Auto2);
        Fuhrpark.ListeVerfügbar();

        System.out.println("Verfügbare Fahrzeuge: " + Fuhrpark.getVerfügbareFahrzeuge());
        System.out.println();


    }
}
