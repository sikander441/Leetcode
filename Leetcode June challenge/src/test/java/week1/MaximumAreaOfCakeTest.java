package week1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumAreaOfCakeTest {

    MaximumAreaOfCake solution;
    @Before
    public void setUp(){
        solution = new MaximumAreaOfCake();
    }

    @Test
    public void maxConsecutiveInArrayTest1() {
        int arr[]={2,1,4};int h=5;int w=4;
        int result = solution.maxConsecutiveInArray(arr,w);
        Assert.assertEquals(2,result);
    }
    @Test
    public void maxConsecutiveInArrayTest2() {
        int arr[]={3,1};int h=5;int w=4;
        int result = solution.maxConsecutiveInArray(arr,w);
        Assert.assertEquals(2,result);
    }
    @Test
    public void maxArea1() {
        int arr1[]={2,1,4};
        int arr2[]={3,1};
        int h=5;int w=4;
        int result = solution.maxArea(h,w,arr1,arr2);
        Assert.assertEquals(4,result);
    }
    @Test
    public void maxArea2() {
        int arr1[]={1};
        int arr2[]={3,1};
        int h=5;int w=4;
        int result = solution.maxArea(h,w,arr2,arr1);
        Assert.assertEquals(6,result);
    }

    @Test
    public void maxArea3() {
        int arr1[]={3};
        int arr2[]={3};
        int h=5;int w=4;
        int result = solution.maxArea(h,w,arr1,arr2);
        Assert.assertEquals(9,result);
    }


    @Test
    public void maxArea4() {
        int arr1[]={1};
        int arr2[]={2,1,5};
        int h=2;int w=7;
        int result = solution.maxArea(h,w,arr1,arr2);
        Assert.assertEquals(3,result);
    }
}