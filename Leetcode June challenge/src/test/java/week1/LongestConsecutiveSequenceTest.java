package week1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestConsecutiveSequenceTest {

    @Test
    public void longestConsecutive1() {
        int arr[] ={100,4,200,1,3,2} ;
        LongestConsecutiveSequence solution = new LongestConsecutiveSequence();
        int result = solution.longestConsecutive(arr);
        Assert.assertEquals(4,result);
    }
    @Test
    public void longestConsecutive2() {
        int arr[] ={0,3,7,2,5,8,4,6,0,1} ;
        LongestConsecutiveSequence solution = new LongestConsecutiveSequence();
        int result = solution.longestConsecutive(arr);
        Assert.assertEquals(9,result);
    }
}