package week1;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class LongestConsecutiveSequence {
    Set<Integer> values = new HashSet<>();
    Set<Integer> visited = new HashSet<>();
    public int longestConsecutive(int[] nums) {


        for(int i:nums){
            values.add(i);
        }
        int ans = Integer.MIN_VALUE;
        for(int x : nums){
            if(!visited.contains(x))
               ans=Math.max(ans,DFS(x));
        }
        return ans;
    }

    private int DFS(int x) {
        int count =0 ;
        Stack<Integer> st = new Stack<>();
        st.push(x);
        while(!st.isEmpty()){
            int curr = st.pop();
            visited.add(curr);
            count++;
            if(!visited.contains(curr+1) && values.contains(curr+1))
                st.push(curr+1);
            if(!visited.contains(curr-1) && values.contains(curr-1))
                st.push(curr-1);
        }
        return count;
    }
}
