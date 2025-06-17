public class Calculator {

    public static void utility(int a, int b, int operator) {
        if (operator==1){
            System.out.println(a+b);
        } if (operator==2) {
            System.out.println(a-b);

        }
        if (operator==3){
            System.out.println(a*b);
        }


    }
    public static void main(String[] args) {
        utility(2,2,2);

    }
}


//If operator equals to 1 add a and b, then print the result as a string.
//If operator equals to 2 subtract a from b, then print the result as a string.
//If operator equals to 3 multiply a and b, then print the result as a string.