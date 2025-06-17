import java.util.PriorityQueue;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res=new int[nums.length-k+1];
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        for (int i=0;i<k;i++){
           pq.add(new Pair(i,nums[i]));
        }
        res[0]=pq.peek().val;
        for (int i=k;i< nums.length;i++){
            while (!pq.isEmpty() && pq.peek().idx<=i-k){
                pq.remove();
            }
            pq.add(new Pair(i,nums[i]));
            res[i-k+1]=pq.peek().val;
        }
        return res;

    }
    static class Pair implements Comparable<Pair>{
        int idx;
        int val;
        public Pair(int idx,int val){
            this.val=val;
            this.idx=idx;
        }

        @Override
        public int compareTo(Pair o) {
            return o.val-this.val;
        }
    }
    public static void main(String[] args) {

    }
}
