import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromicSubstring_5Test {

    @Test
    public void longestPalindromeTest1() {
        LongestPalindromicSubstring_5 solution = new LongestPalindromicSubstring_5();
        String reuslt  = solution.longestPalindrome("babad");
        Assert.assertEquals("bab",reuslt);
    }
}