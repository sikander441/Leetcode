import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstUniqueCharacterInAString_387Test {

    @Test
    public void firstUniqChar1() {
        FirstUniqueCharacterInAString_387 solution = new FirstUniqueCharacterInAString_387();
        String str = "leetcode";
        Assert.assertEquals(0,solution.firstUniqChar(str));
    }
    @Test
    public void firstUniqChar2() {
        FirstUniqueCharacterInAString_387 solution = new FirstUniqueCharacterInAString_387();
        String str = "loveleetcode";
        Assert.assertEquals(2,solution.firstUniqChar(str));
    }
    @Test
    public void firstUniqChar3() {
        FirstUniqueCharacterInAString_387 solution = new FirstUniqueCharacterInAString_387();
        String str = "aabb";
        Assert.assertEquals(-1,solution.firstUniqChar(str));
    }
}