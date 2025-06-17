public class KadanesAlgorithm {
   public static int maxSubarraySum(int[] arr) {
       int ms = Integer.MIN_VALUE;
       int cs=0;
       for (int i=0;i<arr.length;i++){
           cs+=arr[i];
           ms=Math.max(cs,ms);
           if (cs<0){
               cs=0;
           }


       }
       return ms;


    }
    public static void main(String[] args) {
       int arr[]={10, 22, 5, 75, 65, 80};
        System.out.println(maxSubarraySum(arr));

    }
}
