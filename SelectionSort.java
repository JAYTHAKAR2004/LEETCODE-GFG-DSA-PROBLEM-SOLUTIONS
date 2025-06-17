public class SelectionSort {
   public static void selectionSort(int[] arr) {
       for (int i=0;i< arr.length-1;i++){
           int minpos=i;
           for (int j=i+1;j< arr.length;j++){
               if (arr[minpos]>arr[j]){
                   minpos=j;
               }
           }
           int temp=arr[minpos];
           arr[minpos]=arr[i];
           arr[i]=temp;
       }

        // code here
    }
    public static void PrintArr(int arr[]){
       for (int i=0;i< arr.length;i++){
           System.out.print(arr[i]+" ");
       }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={4, 1, 3, 9, 7};
        selectionSort(arr);
        PrintArr(arr);
    }
}
