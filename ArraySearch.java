public class ArraySearch {
    public static int search(int arr[], int x) {
        for(int i=0;i<= arr.length-1;i++){
            if (arr[i]==x){
                return i;
            }

        }
return -1;

        // Your code here
    }
    public static void main(String[] args) {
        int arr[]={10 ,8 ,30, 4, 5};
        int x=5;
        int index=search(arr,x);
        if (index==-1){
            System.out.println("Index is not possible ");
        }
        else {
            System.out.println(index);
        }

    }
}
