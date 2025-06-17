public class ArithmeticNumber {
   public  static int inSequence(int a, int b, int c) {
       if (c==0){
           return a==b?1:0;
       }
       return (b-a)%c==0 && (b - a) / c >= 0 ? 1 : 0;

        // code here
    }
    public static void main(String[] args) {
        System.out.println(inSequence(13680,23796
                ,12));

    }
}
