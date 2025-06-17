import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>s1=new HashSet<>();
        for (int val:nums1){
            s1.add(val);
                    }

        int count=0;
        Set<Integer>intersection=new HashSet<>();
        for(int val:nums2){
            if (s1.contains(val)&& !intersection.contains(val)){
                count++;
            }
            intersection.add(val);
        }
        return new int[]{count};

    }
    public static void main(String[] args) {

    }
}
