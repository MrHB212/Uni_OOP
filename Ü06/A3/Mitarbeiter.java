public class Mitarbeiter extends PersonUni {
    private String beruf = "Mitarbeiter:in";

    public Mitarbeiter(String name) {
        super(name);
    }
    
    protected void setBeruf(String beruf) {
        this.beruf = beruf;
    }

    public void sayName() {
        System.out.println("Hi, ich bin " + name + " und bin " + beruf + " an der Uni.");
    }
}   