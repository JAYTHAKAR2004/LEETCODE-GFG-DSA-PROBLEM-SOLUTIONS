import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if (a>=b&& a>=c){
            System.out.println("a is greatest of all");

        } else if (b>=a&&b>=c) {
            System.out.println("b is greatest of all");

        } else if (c>=a&&c>=b) {
            System.out.println("c is greatest of all");

        }
    }
}
