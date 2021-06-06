import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PerfectSquares_279Test {

    @Test
    public void perfectSquaresTest1(){
        PerfectSquares_279 solution = new PerfectSquares_279();
        int result = solution.numSquares(3428);
        Assert.assertEquals(2,result);
    }
}