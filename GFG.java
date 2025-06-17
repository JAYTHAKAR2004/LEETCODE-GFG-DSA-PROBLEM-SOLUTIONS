import java.util.Scanner;

public class GFG {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        float b;
        long c;
        byte d;
        String s;

        System.out.println("Enter the value of a");
        a = sc.nextInt();

        System.out.println("Enter the value of b");
        b = sc.nextFloat();

        System.out.println("Enter the value of c");
        c = sc.nextLong();

        System.out.println("Enter the value of d");
        d = sc.nextByte();

        sc.nextLine(); // Consume the leftover newline

        System.out.println("Enter the value of s");
        s = sc.nextLine(); // Read the full line

        System.out.println("Values entered:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("s = " + s);

        sc.close();
    }
}



//You are given five inputs: a(integer), b(float ), c(long), d(byte), and s(string)