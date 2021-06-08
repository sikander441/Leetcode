import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MinimumTimeDifference_539Test {

    @Test
    public void findMinDifferenceTest1() {
        List<String> input = new ArrayList<>(Arrays.asList("23:14","23:54","11:54","05:22","23:59"));
        MinimumTimeDifference_539 solution = new MinimumTimeDifference_539();
        int result = solution.findMinDifference(input);
        Assert.assertEquals(5,result);
    }
    @Test
    public void findMinDifferenceTest2() {
        List<String> input = new ArrayList<>(Arrays.asList("23:14","23:54","11:54","05:22","00:00","23:59"));
        MinimumTimeDifference_539 solution = new MinimumTimeDifference_539();
        int result = solution.findMinDifference(input);
        Assert.assertEquals(1,result);
    }
    @Test
    public void findMinDifferenceTest3() {
        List<String> input = new ArrayList<>(Arrays.asList("23:14","23:54","11:54","05:22","00:01","23:59"));
        MinimumTimeDifference_539 solution = new MinimumTimeDifference_539();
        int result = solution.findMinDifference(input);
        Assert.assertEquals(2,result);
    }
    @Test
    public void findMinDifferenceTest4() {
        List<String> input = new ArrayList<>(Arrays.asList("23:59","00:00"));
        MinimumTimeDifference_539 solution = new MinimumTimeDifference_539();
        int result = solution.findMinDifference(input);
        Assert.assertEquals(1,result);
    }
    @Test
    public void findMinDifferenceTest5() {
        List<String> input = new ArrayList<>(Arrays.asList("00:00","23:59","00:00"));
        MinimumTimeDifference_539 solution = new MinimumTimeDifference_539();
        int result = solution.findMinDifference(input);
        Assert.assertEquals(0,result);
    }
    @Test
    public void findMinDifferenceTest6() {
        List<String> input = new ArrayList<>(Arrays.asList("00:00","00:00"));
        MinimumTimeDifference_539 solution = new MinimumTimeDifference_539();
        int result = solution.findMinDifference(input);
        Assert.assertEquals(0,result);
    }
}