//!              Job Sequencing Problem
import java.util.*;
public class Question6 {
    
    static class job{
        int deadline;
        int profit ;
        int id ;

        public job (int i , int d , int p){
            id = i;
            deadline = d;
            profit =p;
        }

    }
    public static void main(String[] args) {
        int jobInfo[][]={{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();
        for (int i = 0; i < jobInfo.length; i++) {
            jobs.add(new Job(i,jobInfo[i][0],jobInfo[i][1] ));
        }

    }
}
