class staticBsp {

    //Falls eine Variable mit static bezeichnet wurde ist sie in allen Instanzen gleich
    //Falls eine Methode mit static bezeichnet wird, gehört sie der Klasse und kann ohne Objekt aufgerufen werden

    int a = 0; 
    static int b = 5; 
    public static void main(String[] args){
        staticBsp T1 = new staticBsp();
        staticBsp T2 = new staticBsp();

        T1.erhöhe();
        T2.erhöhe();

        System.out.println("T1.a: " + T1.a);
        System.out.println("T1.b: " + T1.b);
        System.out.println("T2.a: " + T2.a);
        System.out.println("T2.b: " + T2.b);
        System.out.println();

        /*
        Da b static ist, hat sie für beide Objekte den selben Wert. 
        a allerdings hat jeweils eine eigene Instanz pro Objekt.
        Wir rufen erhöhe() pro Objekt auf. Dabei wird b zwei Mal um 1 erhöht,
        a allerdings getrennt pro Instanz einmal.
        */

        erhöhe2(); //erhöhe2() kann ohne Objekt direkt aufgerufen werden, allerdings kann es dabei a nicht ändern, da dieser objektgebunden ist.

        System.out.println("T1.a: " + T1.a);
        System.out.println("T1.b: " + T1.b);
        System.out.println("T2.a: " + T2.a);
        System.out.println("T2.b: " + T2.b);

        System.out.println();
        System.out.println("Static Variable: Gleich für alle Objekte der Klasse");
        System.out.println("Static Methode: Kann ohne Objekt aufgerufen werden, kann aber nur auf static Variablen zugreifen.");



        
    }

    public void erhöhe(){
        a++;
        b++;
    }

    public static void erhöhe2(){
        b++;
    }

}