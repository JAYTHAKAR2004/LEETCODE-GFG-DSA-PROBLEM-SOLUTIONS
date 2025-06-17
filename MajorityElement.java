public class MajorityElement {
   public static int majorityElement(int arr[]) {
       int count=0;
       int candidate=-1;
       for (int num :arr){
           if (count==0){
               candidate=num;
               count=-1;
           } else if (num==count) {
               count++;
               
           }
           else {
               count--;
           }
       }
       count=0;
       for (int num: arr){
           if (num==candidate){
               count++;
           }
       }
       return count> arr.length/2?candidate:-1;
        // code here

    }
    public static void main(String[] args) {
       int arr[]={1, 1, 2, 1, 3, 5, 1};
        System.out.println(majorityElement(arr));

    }
}
