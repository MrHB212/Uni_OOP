public abstract class A_ital_essen {

    String name;
    float preis;
    int kalorien;
    boolean vegetarisch;

    abstract public void zubereiten();
    abstract public void servieren();


    A_ital_essen(String name, float preis, int kalorien, boolean vegetarisch){
        this.name = name;
        this.preis = preis;
        this.kalorien = kalorien;
        this.vegetarisch = vegetarisch;
    }
}