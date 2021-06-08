import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumNumbersOfFunctionCallsToMakeTargetArray_1558Test {

    MinimumNumbersOfFunctionCallsToMakeTargetArray_1558 solution;
    @Before
    public void setUp(){
        solution = new MinimumNumbersOfFunctionCallsToMakeTargetArray_1558();
    }
    @Test
    public void minOperationsTest1() {

        int nums[] = new int[]{1,5};

        int result = solution.minOperations(nums);
        Assert.assertEquals(5,result);
    }


    @Test
    public void minOperationsTest2() {

        int nums[] = new int[]{2,2};

        int result = solution.minOperations(nums);
        Assert.assertEquals(3,result);
    }

    @Test
    public void minOperationsTest3() {

        int nums[] = new int[]{4,2,5};

        int result = solution.minOperations(nums);
        Assert.assertEquals(6,result);
    }

    @Test
    public void minOperationsTest4() {

        int nums[] = new int[]{3,2,2,4};

        int result = solution.minOperations(nums);
        Assert.assertEquals(7,result);
    }
    @Test
    public void minOperationsTest5() {

        int nums[] = new int[]{0};

        int result = solution.minOperations(nums);
        Assert.assertEquals(0,result);
    }
    @Test
    public void minOperationsTest6() {

        int nums[] = new int[]{0,0};

        int result = solution.minOperations(nums);
        Assert.assertEquals(0,result);
    }
    @Test
    public void minOperationsTest7() {

        int nums[] = new int[]{1,1};

        int result = solution.minOperations(nums);
        Assert.assertEquals(2,result);
    }
    @Test
    public void minOperationsTest8() {

        int nums[] = new int[]{1};

        int result = solution.minOperations(nums);
        Assert.assertEquals(1,result);
    }
    @Test
    public void minOperationsTest9() {

        int nums[] = new int[]{1000000000};

        int result = solution.minOperations(nums);
        Assert.assertEquals(42,result);
    }

    @Test
    public void minOperationsTest10() {

        int nums[] = new int[]{7,4,3,2,0,2};

        int result = solution.minOperations(nums);
        Assert.assertEquals(10,result);
    }

}