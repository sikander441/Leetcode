import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumTimeDifference_539 {
    public int findMinDifference(List<String> timePoints) {
        boolean timeStamps[] = new boolean[ (24*60)+1];
        for(String timePoint: timePoints){
            String t[] = timePoint.split(":");
            int ti = Integer.parseInt(t[0])*60+Integer.parseInt(t[1]);
            if(timeStamps[ti])
                return 0;
            timeStamps[ti]=true;
        }
        int result = Integer.MAX_VALUE;
        int first=-1,prev=-1;
        for(int i=0;i<=24*60;i++){
            if(timeStamps[i]){
                if(result==Integer.MAX_VALUE){
                  first = i;
                  prev = i;
                  result = Integer.MAX_VALUE-1;
                  continue;
                }
                result = Math.min(result,i-prev);
                prev=i;
            }
        }
         result=Math.min(result,1440-(prev-first));
        return result;
    }
}
