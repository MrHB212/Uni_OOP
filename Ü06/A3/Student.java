public class Student extends PersonUni {
    protected int matrNr;

    public Student(String name, int matrNr) {
        super(name);
        this.matrNr = matrNr;
    }

    public void sayName() {
        System.out.println("Hi, ich bin " + name + " und studiere an der Uni.");
    }

    public void examRegister() {
        System.out.println(name + " hat die Matrikel-Nr " + matrNr + " und meldet sich zur Prüfung an.");
}
}