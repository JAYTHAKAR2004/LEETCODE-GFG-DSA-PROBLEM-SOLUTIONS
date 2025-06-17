import java.util.ArrayList;

public class PascalTriangle {

    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
ArrayList<Integer>row=new ArrayList<>();
long val=1;
for (int i=0;i<n;i++) {
    row.add((int) val);
    val = val * (n - i - 1) / (i + 1);

}
return row;
        // code here

    }
    public static void main(String[] args) {

    }
}
