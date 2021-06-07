import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumTimeDifference_539 {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> timeStamps = new ArrayList<>();
        for(String timePoint: timePoints){
            String t[] = timePoint.split(":");
            timeStamps.add(Integer.parseInt(t[0])*60+Integer.parseInt(t[1]));
        }
        Collections.sort(timeStamps);
        int result = Integer.MAX_VALUE;
        for(int i=0;i<timeStamps.size()-1;i++){
            result=Math.min(result,timeStamps.get(i+1)-(timeStamps.get(i)));
        }
         result=Math.min(result,1440-(timeStamps.get(timeStamps.size()-1)-(timeStamps.get(0))));
        return result;
    }
}
