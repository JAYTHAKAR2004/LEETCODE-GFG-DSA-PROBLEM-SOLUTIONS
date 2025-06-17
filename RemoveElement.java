public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        if (nums.length==0){
            return 0;

        }
        int i=0;
        for (int j=1;j< nums.length;j++){
            if (nums[j]!=val){
                i++;
                nums[i]=nums[j];


            }
        }
        return i;

    }
    public static void main(String[] args) {
        int nums[]={3,2,2,3};
        System.out.println(removeElement(nums,3));

    }
}
