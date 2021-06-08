import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/length-of-longest-fibonacci-subsequence/
public class LengthOfLongestFibonacciSubsequence_873 {
    class Pair{
        int a,b;
        Pair(int a,int b){this.a=a;this.b=b;}
    }
    public int lenLongestFibSubseq(int[] arr) {

        List<Pair> fibonacciPairs = new ArrayList<>();
        Set<Integer> nums = new HashSet<>();
        for(int x:arr) nums.add(x);
        //Pairs of size 2
        for(int i=0; i< arr.length;i++) {
            for(int j = i+1 ;j<arr.length;j++){
                if(nums.contains(arr[i]+arr[j]))
                    fibonacciPairs.add(new Pair(arr[j],arr[i]+arr[j]));
            }
        }
        if(fibonacciPairs.size()==0)
            return 0;
        int result = 3;
        while(fibonacciPairs.size()!=0){
            List<Pair> newFibs = new ArrayList<>();
            for(Pair p : fibonacciPairs){
                int a = p.a;
                int b=p.b;
                if(nums.contains(a+b))
                    newFibs.add(new Pair(b,a+b));
            }
            if(newFibs.size()==0)
                return result;
            result++;
            fibonacciPairs = new ArrayList<>(newFibs);
        }
        return result;
    }
}
