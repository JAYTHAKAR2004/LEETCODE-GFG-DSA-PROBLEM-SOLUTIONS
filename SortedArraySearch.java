public class SortedArraySearch {
   public static boolean searchInSorted(int arr[], int k) {
       int n= arr.length;
       for (int i=0;i<n;i++){
           if (arr[i]==k){
               return true;
           }
       }
       return false;

    }
    public static void main(String[] args) {
       int arr[]={1, 2, 3, 4, 6};
        System.out.println(searchInSorted(arr,6));

    }
}
