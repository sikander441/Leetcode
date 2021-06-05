package week1;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumPerformanceTeamTest extends TestCase {

    int speed[]={2,10,3,1,5,8};
    int efficiency[]={5,4,3,9,7,2};

    @Test
    public void testAnce1() {
        MaximumPerformanceTeam solution = new MaximumPerformanceTeam();
        int result = solution.ance(6,speed,efficiency,2);
        Assert.assertEquals(60,result);
    }
    @Test
    public void testAnce2() {
        MaximumPerformanceTeam solution = new MaximumPerformanceTeam();
        int result = solution.ance(6,speed,efficiency,3);
        Assert.assertEquals(68,result);
    }
    @Test
    public void testAnce3() {
        MaximumPerformanceTeam solution = new MaximumPerformanceTeam();
        int result = solution.ance(6,speed,efficiency,4);
        Assert.assertEquals(72,result);
    }
}