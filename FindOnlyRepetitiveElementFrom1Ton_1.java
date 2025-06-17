import java.util.HashSet;

public class FindOnlyRepetitiveElementFrom1Ton_1 {
    public static int findDuplicate(int[] arr) {
        HashSet<Integer> seen=new HashSet<>();
        for (int num:arr){
            if (seen.contains(num)){
                return num;
            }
            seen.add(num);
        }
       return -1;


    }

    public static void main(String[] args) {
        int arr[]={1, 3, 2, 3, 4};
        System.out.println(findDuplicate(arr));


    }
}
