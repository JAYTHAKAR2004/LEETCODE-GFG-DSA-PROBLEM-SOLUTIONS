public class TheFizzBuzzProgram {

    public static void fizzBuzz(int number){
        if (number%3==0){
            System.out.println("Fizz");
        } else if (number%5==0) {
            System.out.println("Buzz");

        } else if (number%3==0 || number%5==0) {
            System.out.println("FizzBuzz");

        }
        return;


        // Write your code here.
    }
    public static void main(String[] args) {
        fizzBuzz(3);

    }
}
