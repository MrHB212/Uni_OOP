public class PolymorphieUni {
    public static void main(String[] args) {
        //Gibt ganz normal den namen aus.
        PersonUni alice = new PersonUni("Alice");
        alice.sayName();

        //Gibt ganz normal Name und Matrikelnummer aus
        Student bobby = new Student("Bobby", 1234);
        bobby.sayName();
        bobby.examRegister();

        Mitarbeiter charly = new Mitarbeiter("Charly");
        charly.sayName();
        charly.setBeruf("Mensakoch"); //Da Beruf nach sayName gesetzt wird, wird Beruf nicht angegeben.

        //Hier wird die Deklaration des Objekt und der Aufruf der Methode in einer Zeile durchgeführt.
        //Man speichert das neue Objekt also nicht erst in einer Variable.
        new Mitarbeiter("Doris").sayName();

        PersonUni emma = new Student("Emma", 3300);
        emma.sayName(); //ruft sayName von personUni auf

        PersonUni franzi = new Mitarbeiter("Franzi");
        franzi.sayName(); //ruft sayName von personUni auf

        //prof ist eine Unterklasse von Mitarbeiter, umgekehrt wäre richtig
        //Prof georg = new Mitarbeiter("Georg"); 
        //georg.sayName();

        //Student ist keine Unterklasse von Prof
        //Student hans = new Prof("Hans"); 
        //hans.sayName();

        PersonUni inga = new Prof("Inga");
        inga.sayName(); //ruft sayname von personUni auf

        Prof james = new Prof("James");
        james.sayName(); //Ruft sayname von Mitarbeiter auf
        james.setBeruf("Junior-Prof"); //Ruft setBeruf von Mitarbeiter auf. Da Beruf nach sayname gesetzt wird, wird Beruf nicht angegeben.

    }
}
