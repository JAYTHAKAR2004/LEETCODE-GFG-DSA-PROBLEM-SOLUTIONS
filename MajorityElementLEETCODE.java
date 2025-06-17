public class MajorityElementLEETCODE {
    public int majorityElement(int[] nums) {
        int count=0;
        int candidate=-1;
        for (int num:nums){
            if (count==0){
            candidate=num;
            count=-1;}
            else if (num==count) {
                count++;

            }
            else {
                count--;
            }

        }
        count=0;
        for (int num:nums){
            if (num==candidate){
                count++;
            }
        }
        return count>nums.length/2?candidate:-1;



    }
    public static void main(String[] args) {

    }
}
