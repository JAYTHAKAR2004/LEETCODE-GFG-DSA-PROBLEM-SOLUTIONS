public class UniqueNumber {
    public static int findUnique(int[] arr) {
        int result=0;
        for (int num=0;num< arr.length;num++){
            result^=arr[num];
        }
        // code here
return result;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 1, 5, 5};
        System.out.println(findUnique(arr));

    }
}
