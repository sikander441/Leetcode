package week1;

import org.junit.Assert;
import org.junit.Test;


public class InterleavingStringTest {

    @Test
    public void isInterleaveTest1() {
        String s1,s2,s3;
        s1="";
        s2="";
        s3="";
        boolean result = new week1.InterleavingString().isInterleave(s1,s2,s3);
        Assert.assertEquals(true,result);
    }
    @Test
    public void isInterleaveTest2() {
        String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc";
        boolean result= new week1.InterleavingString().isInterleave(s1,s2,s3);
        Assert.assertEquals(false,result);
    }
    @Test
    public void isInterleaveTest3() {
        String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
        boolean result= new week1.InterleavingString().isInterleave(s1,s2,s3);
        Assert.assertEquals(true,result);
    }
    @Test
    public void isInterleaveTest4() {
        String s1 = "", s2 = "", s3 = "a";
        boolean result= new week1.InterleavingString().isInterleave(s1,s2,s3);
        Assert.assertEquals(false,result);
    }
}