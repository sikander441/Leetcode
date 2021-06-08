import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeastOperatorsToExpressNumber_964Test {

    @Test
    public void leastOpsExpressTarget1() {
        LeastOperatorsToExpressNumber_964 solution = new LeastOperatorsToExpressNumber_964();
        int result = solution.leastOpsExpressTarget(3,19);
        Assert.assertEquals(5,result);
    }

    @Test
    public void leastOpsExpressTarget2() {
        LeastOperatorsToExpressNumber_964 solution = new LeastOperatorsToExpressNumber_964();
        int result = solution.leastOpsExpressTarget(5,501);
        Assert.assertEquals(8,result);
    }
    @Test
    public void leastOpsExpressTarget3() {
        LeastOperatorsToExpressNumber_964 solution = new LeastOperatorsToExpressNumber_964();
        int result = solution.leastOpsExpressTarget(100,100000000);
        Assert.assertEquals(3,result);
    }
    @Test
    public void leastOpsExpressTarget4() {
        LeastOperatorsToExpressNumber_964 solution = new LeastOperatorsToExpressNumber_964();
        int result = solution.leastOpsExpressTarget(3,365);
        Assert.assertEquals(17,result);
    }
    @Test
    public void leastOpsExpressTarget5() {
        LeastOperatorsToExpressNumber_964 solution = new LeastOperatorsToExpressNumber_964();
        int result = solution.leastOpsExpressTarget(79,155800339);
        Assert.assertEquals(45,result);
    }
    @Test
    public void leastOpsExpressTarget6() {
        LeastOperatorsToExpressNumber_964 solution = new LeastOperatorsToExpressNumber_964();
        int result = solution.leastOpsExpressTarget(79,15);
        Assert.assertEquals(29,result);
    }
    @Test
    public void leastOpsExpressTarget7() {
        LeastOperatorsToExpressNumber_964 solution = new LeastOperatorsToExpressNumber_964();
        int result = solution.leastOpsExpressTarget(79,38950096);
        Assert.assertEquals(33,result);
    }
    @Test
    public void leastOpsExpressTarget8() {
        LeastOperatorsToExpressNumber_964 solution = new LeastOperatorsToExpressNumber_964();
        int result = solution.leastOpsExpressTarget(79,116850258);
        Assert.assertEquals(41,result);
    }
    @Test
    public void leastOpsExpressTarget9() {
        LeastOperatorsToExpressNumber_964 solution = new LeastOperatorsToExpressNumber_964();
        int result = solution.leastOpsExpressTarget(79,77900177);
        Assert.assertEquals(37,result);
    }
    @Test
    public void leastOpsExpressTarget10() {
        LeastOperatorsToExpressNumber_964 solution = new LeastOperatorsToExpressNumber_964();
        int result = solution.leastOpsExpressTarget(79,155800339);
        Assert.assertEquals(45,result);
    }
}

