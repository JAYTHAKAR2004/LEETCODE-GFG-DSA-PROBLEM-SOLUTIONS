import java.math.BigInteger;

public class MultiplyStrings {
    public static String multiply(String num1, String num2) {
        BigInteger no1=new BigInteger(num1);
        BigInteger no2=new BigInteger(num2);
        BigInteger result=no1.multiply(no2);
        return result.toString();


    }
    public static void main(String[] args) {
        System.out.println(multiply("123456789","987654321"));


    }
}
