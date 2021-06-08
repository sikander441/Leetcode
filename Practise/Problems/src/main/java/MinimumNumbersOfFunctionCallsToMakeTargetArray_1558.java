import java.util.HashMap;
import java.util.Map;

public class MinimumNumbersOfFunctionCallsToMakeTargetArray_1558 {


    Map<Integer,Pair> memo = new HashMap<>();

    class Pair{
        int one;int two;
        Pair(){one=0;two=0;}
        Pair(int o,int t){one=o;two=t;}
        @Override
        public String toString() {
            return "Pair{" +
                    "one=" + one +
                    ", two=" + two +
                    '}';
        }
    }
    public boolean isPowerOf2(int x){
        return x!=0 && ((x&(x-1)) == 0);
    }
    public static int log2(int N)
    {
        int result = (int)(Math.log(N) / Math.log(2));
        return result;
    }

    public Pair DP(int num){
        if(num ==0)
            return new Pair();
        if(memo.containsKey(num))
            return memo.get(num);
        if(num == 1)
            return new Pair(1,0);

        Pair pp = new Pair();
        pp.two = log2(num);
        pp.one = 1+DP(num-((int)Math.pow(2,log2(num)))).one;
        memo.put(num,pp);
        return pp;
    }
    public int minOperations(int[] nums) {

//        for(int i=1;i<=1000;i++){
//            if(log2(i)!=DP(i).two)
//             throw new RuntimeException(String.valueOf(i));
//            else
//            System.out.println(i+"==> "+DP(i)+ "-->"+(DP(i).one+DP(i).two)+"    power2->"+log2(i));
//        }


        int max = -1; int indexOfMax = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] >= max){
                max=nums[i];
                indexOfMax = i;
            }
        }
//
//        if(max == 0  || indexOfMax==-1)
//            return 0;
////        Pair dp[] = new Pair[max+1];
////        for(int i=0;i<=max;i++)
////            dp[i]=new Pair();
//
////        dp[1].one++;
////        for(int i=2;i<=max;i++)
////        {
////            if( i%2!=0){
////                dp[i].one = dp[i-1].one+1;
////                dp[i].two = dp[i-1].two;
////            }else{
////                dp[i].one = dp[i/2].one;
////                dp[i].two = dp[i/2].two+1;
////            }
////        }
////        for(int i=0;i<dp.length;i++){
////            System.out.println(i+" --> "+dp[i]+" ");
////
////        }
        int max2 = DP(nums[indexOfMax]).two;
        int total1 = 0;
        for(int i=0;i<nums.length;i++){
            total1+=DP(nums[i]).one;
        }
        return total1+max2;
   }
}
