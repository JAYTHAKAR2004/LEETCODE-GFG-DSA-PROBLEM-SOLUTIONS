import java.util.Map;

public class DivisibilityBy8 {
   public static int DivisibleByEight(String s){
int len=s.length();
int num=Integer.parseInt(s.substring(Math.max(0,len-3)));
return num%8==0?1:-1;




    }
    public static void main(String[] args) {
        System.out.println(DivisibleByEight("16"));
    }
}
