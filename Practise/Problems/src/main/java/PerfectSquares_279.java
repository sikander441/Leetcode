import java.util.*;

public class PerfectSquares_279 {

    int dp[];
    public int solve(int n){
        if(n<=0)
            return 0;
        if(dp[n]!=-1)
            return dp[n];

        int ans = Integer.MAX_VALUE;
        List<Integer> perfectSquares = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            perfectSquares.add(i*i);
        }
       for(int i=0;i<perfectSquares.size();i++){
           ans = Math.min(1 + solve(n-perfectSquares.get(i)),ans);
       }
        return  dp[n]=ans;
    }

    public int numSquares(int n) {
        dp = new int[n+1];
       for(int i=0;i<=n;i++)
           dp[i]=-1;
       return solve(n);
    }

    public static void main(String args[]){
        PerfectSquares_279 solution = new PerfectSquares_279();
         System.out.println(solution.numSquares(13));
    }
}
