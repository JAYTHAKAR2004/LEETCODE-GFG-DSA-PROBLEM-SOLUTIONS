public class AddStrings {

    public static String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        StringBuilder result=new StringBuilder();
        int j=num2.length()-1;
        int carry=0;
        while (i>=0||j>=0||carry!=0){
            int digit1=(i>0)?num1.charAt(i)-'0':0;
            int digit2=(j>0)?num2.charAt(i)-'0':0;
            int sum=digit2+digit1+carry;
            result.append(sum%10);
            carry=sum/10;
            i--;
            j--;


        }
        return result.reverse().toString();

    }
    public static void main(String[] args) {

    }
}
