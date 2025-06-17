public class ArrangingCoins {
    public int arrangeCoins(int n) {
        long nn=(long) n;
        return (int) (Math.sqrt(1+8*nn)-1)/2;

    }
    public static void main(String[] args) {

    }
}
