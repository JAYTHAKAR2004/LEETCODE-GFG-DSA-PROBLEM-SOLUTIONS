import java.util.Scanner;

class Geeks {
    public static void getInput() {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input for test cases count.");
            return;
        }

        int t = sc.nextInt(); // Taking the number of test cases
        sc.nextLine(); // Consume the newline

        while (t-- > 0) {
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input for integer value.");
                break;
            }
            int a = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline
            if (!sc.hasNextLine()) {
                System.out.println("Invalid input for string.");
                break;
            }
            String s = sc.nextLine();

            System.out.println(a);
            System.out.println(s);
        }

        sc.close(); // Close scanner
    }

    public static void main(String[] args) {
        getInput();
    }
}
