public class BubbleSort {

    // Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int arr[]) {

        for (int turn =0;turn<arr.length-1;turn++){
            for (int j=0;j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }




    }
    public static void PrintArr(int arr[]){
        for (int i=0;i<= arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        int arr[]={3,4};
        bubbleSort(arr);
        PrintArr(arr);

    }
}
