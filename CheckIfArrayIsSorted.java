public class CheckIfArrayIsSorted {
    public static boolean arraySortedOrNot(int[] arr) {
        for (int i=0;i< arr.length;i++){
            if (arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
        // code here
    }

    public static void main(String[] args) {
        int []arr={90 ,80 ,100 ,70 ,40 ,30};
        System.out.println(arraySortedOrNot(arr));
    }
}
