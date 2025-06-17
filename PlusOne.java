public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n= digits.length;
        for (int i=n-1;i>=0;i--){
            if (digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int []newDigit=new int[n+1];
        newDigit[0]=1;
        return newDigit;


    }
    public static void PrintArr(int[] digits){
        for (int i=0;i<=digits.length-1;i++){
            System.out.print(digits[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] digits={1,2,3};
        plusOne(digits);
        PrintArr(digits);
    }
}
