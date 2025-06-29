class A {
    private void test1(){
        System.out.println("Dies ist eine Ausgabe");
    }

    public void test2(){
        System.out.println("Dies ist eine Ausgabe");
    }
}

class B extends A {
    public static void main(String[] args) {
        B objekt = new B();

        //test1 ist für das Objekt nicht sichtbar.
        objekt.test1();
        objekt.test2();
    }
}