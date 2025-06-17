import java.util.ArrayList;
import java.util.Collections;

public class CourseScheduleIII {
    public int scheduleCourse(int[][] courses) {
        ArrayList<Job>jobs=new ArrayList<>();
        for (int i=0;i<courses.length;i++){
            jobs.add(new Job(i,courses[i][0],courses[i][1]));
        }
        Collections.sort(jobs,(obj1,obj2)->obj2.profit- obj1.profit);
        ArrayList<Integer>seq=new ArrayList<>();
        int time=0;
        for (int i=0;i<jobs.size();i++) {
            Job Curr = jobs.get(i);
            if (Curr.deadline>time){
                seq.add(Curr.id);
                time++;

            }

        }
        return seq.size();

    }
    public class Job{
        int deadline;
        int profit;
        int id;


        public Job(int d, int p, int i) {

            deadline = d;
            profit = p;
            id = i;
        }
    }
    public static void main(String[] args) {

    }
}
