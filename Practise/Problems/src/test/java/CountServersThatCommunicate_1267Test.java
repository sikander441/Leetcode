import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountServersThatCommunicate_1267Test {

    @Test
    public void countServersTest1() {
        CountServersThatCommunicate_1267 solution = new CountServersThatCommunicate_1267();
        Assert.assertEquals(0,solution.countServers(new int[][]{{1,0},{0,1}}));
    }
    @Test
    public void countServersTest2() {
        CountServersThatCommunicate_1267 solution = new CountServersThatCommunicate_1267();
        Assert.assertEquals(3,solution.countServers(new int[][]{{1,0},{1,1}}));
    }
    @Test
    public void countServersTest3() {
        CountServersThatCommunicate_1267 solution = new CountServersThatCommunicate_1267();
        Assert.assertEquals(4,solution.countServers(new int[][]{{1,1,0,0},{0,0,1,0},{0,0,1,0},{0,0,0,1}}));
    }
}