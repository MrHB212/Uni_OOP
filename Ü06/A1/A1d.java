//IS-A: Klasse B ist eine Unterklasse von A
//------------------------------------------
class A {
    // Klasse A
}

class B extends A {
    // Klasse B ist Unterklasse von A
}



//HAS-A: Klasse Auto beinhaltet ein Objekt der Klasse Motor
//----------------------------------------------------------
class Motor{
    // Klasse Motor
}

class Auto{
    // Klasse Auto beinhaltet ein Objekt der Klasse Motor
    Motor motor = new Motor();
}