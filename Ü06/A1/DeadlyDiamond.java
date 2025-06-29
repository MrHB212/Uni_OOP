interface A {
    default void Methode(){
        System.out.println("Dies ist die Methode von A");
    }
}

interface B extends A {
    default void Methode(){
        System.out.println("Dies ist die Methode von B");
    }

}

interface C extends A {
    default void Methode(){
        System.out.println("Dies ist die Methode von C");
    }

}

interface D extends B, C{
    //Fehler: D kriegt die gleiche Methode von B und C vererbt. Es ist also unklar welches der beiden
    //Methoden bei aufruf ausgeführt werden soll. Die Methoden sind also nicht eindeutig definiert.
}