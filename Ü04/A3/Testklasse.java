import java.util.Arrays;

public class Testklasse {
    public static void main(String[] args) {
        String[] stringArray = new String[5];
        stringArray[0] = "Heute ist Freitag";
        stringArray[1] = "java ist geil";
        stringArray[2] = "Was ist der Sinn des lebens ?";
        stringArray[3] = "Party Hard";
        stringArray[4] = "Eminem";

        byte[] byteArray = new byte[3];
        byteArray[0] = 12;
        byteArray[1] = 5;
        byteArray[2] = 32;

        System.out.println(Library.sum(5,8));

        System.out.println(Library.greater(8, 12));

        System.out.println(Library.isPrime(123));

        System.out.println(Library.fac(5));

        System.out.println(Arrays.toString(Library.invert(byteArray)));

        System.out.println(Library.isPart("test", stringArray));
    }
}
