import java.util.HashMap;
import java.util.Map;

public class LeastOperatorsToExpressNumber_964 {

    Map<Long, Long> memo = new HashMap<Long, Long>();
    public  double log(double base,double number){
        double ans =  Math.log(number) / Math.log(base);
        return ans;
    }
    long num;
    public long dp(long target){


        if(target ==0) return 0;
        if(target == 1 || target == (2*num) || target == (num*num) ) return 2;
        long ans1 = -1;

        if(memo.containsKey(target))
            return memo.get(target);

        long r =(long)Math.ceil(log(num,target));
        long l =(long)Math.floor(log(num,target));
        if(target < num){
            ans1 = Math.min(2*target, 1 + 2*(num - target));
        }else{
            long pp = (long)Math.pow(num,l);
            ans1 =l+ dp(target- pp);
        }

        long rr = (long)Math.pow(num,r);
        if( rr-target <target )
         ans1 = Math.min(ans1,r+dp(rr-target));
        memo.put(target,ans1);
        //System.out.println(target+ " "+ans1);
        return ans1;
    }
    public int leastOpsExpressTarget(int x, int target) {
        num=x;
        return (int)dp(target)-1;
    }

}


