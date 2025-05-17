public class random {
    public static void main(String[] args) {
        int zahl = 0;
        do{
            zahl = (int) (Math.random() * 50 + 1); // * (max - min + 1) + min, random = 0.0 bis knapp 1.0
            System.out.println(zahl);
        } while (zahl != 50);

    }
}
