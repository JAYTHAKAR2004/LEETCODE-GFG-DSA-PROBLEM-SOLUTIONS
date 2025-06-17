public class FindFirstAndLastPositionOfElementInSortedArray {
    public  static int[] searchRange(int[] nums, int target) {
        int first=findFirst(nums,target);
        int last=FindLast(nums,target);
        return new int[]{first,last};


    }
    public static int findFirst(int nums[],int target){
        int low=0;
        int high= nums.length-1;
        int result=-1;
        while (low<=high){
            int mid=(low+high)/2;
            if (nums[mid]==target){
                result=mid;
                high=mid-1;
            } else if (nums[mid]<target) {
                low=mid+1;

            }
            else {
                high=mid-1;
            }
        }
        return result;
    }
    public static int FindLast(int nums[],int target){
        int low=0;
        int high= nums.length-1;
        int result=-1;

        while (low<=high){
            int mid=(low+high)/2;
        if (nums[mid]==target){
            result=mid;
            low=mid+1;
        } else if (nums[mid]<target) {
            low=mid+1;
            
        }
        else {
            high=mid-1;
        }}
        return result;

    }

    public static void main(String[] args) {
        int nums[]={5,7,7,8,8,10};
        System.out.println(searchRange(nums,8));
    }

}
