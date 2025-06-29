public class PersonUni {
    protected String name;

    public PersonUni(String name) {
        this.name = name;
    }

    public void sayName() {
        System.out.println("Hi, ich bin " + name + ".");
    }
}