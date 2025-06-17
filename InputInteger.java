import java.util.Scanner;

public class InputInteger {
    public static void main(String args[]) {
        // Implement Scanner Class
        //  Take input
        //  Add 10 and Print

        Scanner sc=new Scanner(System.in);
        int num;
        num= sc.nextInt();
        int ans=10+num;
        System.out.println(ans);
    }

}
