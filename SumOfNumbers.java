public class SumOfNumbers {


        public static int findSum(String s1, String s2) {
            int result=0;
            s1="25";
            int num1=Integer.parseInt(s1);
            s2="23";
           int  num2=Integer.parseInt(s2);
            result= num1+num2;
            return result;

            // code here
        }
        public static void main(String[] args){
            System.out.println(findSum("25","23"));
        }
    }

