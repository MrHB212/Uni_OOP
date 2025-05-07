public class Variablen {
    public static void main(String[] args) {
        int a = 2; // a = 2
        int b = 3 * a; // b = 6
        double c = 4.5; // c = 4,5
        double d = 6 * c; // d = 27
        float e = 5.0f; // e = 5
        float f = e / 2; // f = 2,5
        long g = 100L; // g = 100
        long h = g + 300L - 400L; // h = 0
        int i = (int) h; // i = 0
        int j = i - 70; // j = -70
        boolean m = i > 100; // false
        i = (j > 50) ? 22 : 2; // i = 2
        h = (i < 30) ? ((int) (10.5 / 4)) : ((int) (6.9 / 2)); // h = 2
        char n = 'S'; // n = S
        char o = (char) (n + 1); // o = T
        int p = (int) o; // p = 84

        System.out.println("Dies soll nur einen Breakpoint ermöglichen");
    }
}

/*
b)  Beim switch betrachtet man eine Variable, beim if-statement kann man mehrere Bedingungen
    miteinander verknüpfen.
 */
