import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer>s=new HashSet<>();
        for (Integer key:s){
            {
               if( s.contains(key)){
return true;

            }
               s.add(key);
            }

        }
  return false;



    }
    public static void main(String[] args) {

    }
}
