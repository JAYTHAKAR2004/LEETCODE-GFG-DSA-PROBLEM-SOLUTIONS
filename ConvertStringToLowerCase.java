import java.util.Locale;

public class ConvertStringToLowerCase {
   public  static String toLower(String s){
       String str=s.toLowerCase(Locale.ENGLISH);
       return str;

    }
    public static void main(String[] args) {
        System.out.println(toLower("ABCDEF"));

    }
}
