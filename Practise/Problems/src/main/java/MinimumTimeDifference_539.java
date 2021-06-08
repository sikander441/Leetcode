import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumTimeDifference_539 {
    public int findMinDifference(List<String> timePoints) {
        boolean timeStamps[] = new boolean[ (24*60)+1];
        for(String timePoint: timePoints){
            int h = (timePoint.charAt(0)-'0')*10+timePoint.charAt(1)-'0';
            int m=(timePoint.charAt(3)-'0')*10+timePoint.charAt(4)-'0';
            int ti = h*60+m;
            if(timeStamps[ti])
                return 0;
            timeStamps[ti]=true;
        }
        int result = Integer.MAX_VALUE;
        int first=-1,prev=-1;
        for(int i=0;i<=24*60;i++){
            if(timeStamps[i]){
                if(first==-1){
                  first = i;
                  prev = i;
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
