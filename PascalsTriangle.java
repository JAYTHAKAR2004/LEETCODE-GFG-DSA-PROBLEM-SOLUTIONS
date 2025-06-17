import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<Integer>row=new ArrayList<>();
        long val=1;
        for(int i=0;i<numRows;i++){
            row.add((int)val);
            val=val*(numRows-i-1)/(i+1);
        }
        return Collections.singletonList(row);

    }
    public static void main(String[] args) {

    }
}
