package week1;

import org.junit.Assert;
import org.junit.Test;


public class OpenTheLockTest {

    @Test
    public void openLock1() {

        String deadEnds[] = { "0001","0010","0100" } ;
        OpenTheLock solution = new OpenTheLock();
        int result = solution.openLock(deadEnds,"0200");
        Assert.assertEquals(4,result);
    }

    @Test
    public void openLock2() {

        String deadEnds[] = { "0201","0101","0102","1212","2002" } ;
        OpenTheLock solution = new OpenTheLock();
        int result = solution.openLock(deadEnds,"0202");
        Assert.assertEquals(6,result);
    }
    @Test
    public void openLock3() {

        String deadEnds[] = { "8888" } ;
        OpenTheLock solution = new OpenTheLock();
        int result = solution.openLock(deadEnds,"0009");
        Assert.assertEquals(1,result);
    }
    @Test
    public void openLock4() {

        String deadEnds[] = { "8887","8889","8878","8898","8788","8988","7888","9888" } ;
        OpenTheLock solution = new OpenTheLock();
        int result = solution.openLock(deadEnds,"8888");
        Assert.assertEquals(-1,result);
    }
    @Test
    public void openLock5() {

        String deadEnds[] = { "0000" } ;
        OpenTheLock solution = new OpenTheLock();
        int result = solution.openLock(deadEnds,"8888");
        Assert.assertEquals(-1,result);
    }

}