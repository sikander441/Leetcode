package week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class MaximumPerformanceTeam {
    class Pair{
        int first;int second;
        Pair(int f,int s){this.first=f;this.second=s;}
    }

    public int ance(int n, int[] speed, int[] efficiency, int k) {
        long MOD = (int) (1e9 + 7);
        List<Pair> engineers = new ArrayList<>();
        for(int i=0;i<n;i++)engineers.add(new Pair(speed[i],efficiency[i]));
       engineers.sort((a,b)->b.second-a.second);
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.first-b.first);

        long performance=Long.MIN_VALUE;
        long speedSum=0;
        for(Pair engineer : engineers){
            if(pq.size()==k){
                Pair ele = pq.poll();
                speedSum-=ele.first;
            }
            pq.add(engineer);
            speedSum+=engineer.first;
            performance=Math.max(performance,speedSum*engineer.second);
        }
        return (int) (performance%MOD);
    }

}

