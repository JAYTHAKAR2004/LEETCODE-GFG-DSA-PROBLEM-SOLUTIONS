public class NPR {

    public static long nPr(long n, long r) {
        return factorial(n) / factorial(n - r);
    }

    public static long factorial(long n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        long result = nPr(5, 2);

    }
}
