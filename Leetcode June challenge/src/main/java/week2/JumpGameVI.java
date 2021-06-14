package week2;

import java.util.PriorityQueue;

public class JumpGameVI {

    class Pair{
        int index,val;
        Pair(int i,int v){index=i;val=v;}
    }
    public int maxResult(int[] nums, int k) {
        PriorityQueue<Pair> heap = new PriorityQueue<>((a,b) -> b.val-a.val);
        int len = nums.length;
        int dp[] = new int[len];
        dp[0]=nums[0];
        heap.add(new Pair(0,dp[0]));
        for(int i=1;i<len;i++){
            dp[i]=nums[i]+heap.peek().val;
            while(!heap.isEmpty() && heap.peek().index <= i-k){
                heap.poll();
            }
            heap.add(new Pair(i,dp[i]));
        }
        return dp[len-1];
    }
    public static void main(String args[])
    {
        JumpGameVI sol = new JumpGameVI();
        System.out.println(sol.maxResult(new int[]{1,-1,-2,4,-7,3},1));
    }
}
