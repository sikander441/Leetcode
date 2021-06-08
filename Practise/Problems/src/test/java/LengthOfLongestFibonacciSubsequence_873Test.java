import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLongestFibonacciSubsequence_873Test {

    @Test
    public void lenLongestFibSubseq1() {
        LengthOfLongestFibonacciSubsequence_873 solution = new LengthOfLongestFibonacciSubsequence_873();
        int result = solution.lenLongestFibSubseq(new int[]{1,2,3,4,5,7,8});
        Assert.assertEquals(5,result);
    }

    @Test
    public void lenLongestFibSubseq2() {
        LengthOfLongestFibonacciSubsequence_873 solution = new LengthOfLongestFibonacciSubsequence_873();
        int result = solution.lenLongestFibSubseq(new int[]{1,3,7,11,12,14,18});
        Assert.assertEquals(3,result);
    }
}