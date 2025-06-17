public class MissingElementOfAP {
    public int findMissing(int[] arr) {
      int n= arr.length;
      int d=(arr[n-1]-arr[0])/n;
      int low=0;
      int high=n-1;
      while (low<high){
          int mid=(low+high)/2;
          int expected=arr[0]+mid*d;

          if (arr[mid]==expected){
              low=mid+1;
          }
          else {
              high=mid;
          }
      }
return arr[0]+low*d;

    }
    public static void main(String[] args) {

    }
}
