public class Library {

    public static int sum(int n, int m){
        return n+m;
    }

    public static int greater(int a, int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }

    public static boolean isPrime(long n){
        for(int a = 2; a < n; a++){
            if(n % a == 0) return false;
        }
        return true;
    }

    public static int fac(int n){
        int fakultät = 1;

        for(int a = n; a!=0; --a){
            fakultät *= a;
        }

        return fakultät;
    }

    public static byte[] invert(byte[] b){
        byte[] inverse = new byte[b.length];
        int reverseIndex = 0;

        for(int i = b.length - 1; i != -1; --i){
            inverse[reverseIndex] = b[i];
            reverseIndex++;
        }

        return inverse;
    }

    public static boolean isPart(String c, String[] a){
        for(int i = 0; i != a.length; ++i){
            if(a[i] == c) return true;
        }
        return false;
    }

        
    
}