public class wuerfeln{
   

   public static void main(String[] args) {
    int[] array = new int[6];

    for(int a = 0; a != 1001; ++a){
        int augen = (int) (Math.random() * 6 + 1);
        array[augen-1]++; 
    }

    for(int a = 0 ; a!=6; ++a){
        System.out.println(a+1 + " : " + array[a]);
    }





    }
}