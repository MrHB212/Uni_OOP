public class person {

    String name;
    String nachname;
    int alter;
    String geschlecht;
    boolean verheiratet;
    
    // Funktion zum ausgeben der Informationen
    private void printinfo(){
        System.out.print(name + ", ");
        System.out.print(nachname + ", ");
        System.out.print(alter + ", ");
        System.out.print(geschlecht + ", ");
        
        if(verheiratet){
            System.out.print("Verheiratet");
        }else{
            System.out.print("Nicht verheiratet");
        }

        System.out.println();
    }

    // Funktion zum erstellen von Onjekten
    private person(String name, String nachname, int alter, String geschlecht, boolean verheiratet){
        this.name = name;
        this.nachname = nachname;
        this.alter = alter;
        this.geschlecht = geschlecht;
        this.verheiratet = verheiratet;
    }

    // Ändert Familienstand
    private static void heiraten(person a){
        a.verheiratet = true;
        System.out.println(a.name + " hat geheiratet");
    }

    private static void scheiden(person a){
        a.verheiratet = false;
        System.out.println(a.name + " ist geschieden");
    }

    public static void main(String[] args) {
        // Erstellt die Onjekte
        person olaf = new person("Olaf", "Olafson", 25, "M", true);
        person jürgen = new person("jürgen", "Olafson", 30, "M", false);
        person brigitte = new person("Brigitte", "Olafson", 28, "W", false);

        olaf.printinfo();
        jürgen.printinfo();
        brigitte.printinfo();

        System.out.println();
        scheiden(olaf);
        heiraten(jürgen);

        System.out.println();
        olaf.printinfo();
        jürgen.printinfo();
    }
}
