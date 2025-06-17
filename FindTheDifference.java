import java.util.HashSet;
import java.util.Set;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
       char result=0;
       for (char c1:s.toCharArray()){
           result^=c1;

       }
       for (char c2:t.toCharArray()){
           result^=c2;
       }
       return result;


    }
    public static void main(String[] args) {


    }
}
