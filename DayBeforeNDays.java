public class DayBeforeNDays {
    public static int nthDay(int d, int n) {
        // write your code here

        return ((d - n) % 7 + 7) % 7;
    }

    public static void main(String[] args) {
        System.out.println(nthDay(2,19));
    }
}
