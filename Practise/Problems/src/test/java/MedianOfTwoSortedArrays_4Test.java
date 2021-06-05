import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class MedianOfTwoSortedArrays_4Test {

    MedianOfTwoSortedArrays_4 solution;
    @Before
    public void setup(){
        solution = new MedianOfTwoSortedArrays_4();
    }
    @Test
    public void findIndexInSortedArrayTest1() {

        int arr[]={1,4,6,7,8};
        int val = 5;
        int result = solution.findIndexInSortedArray(arr,0,arr.length-1,val);

        Assert.assertEquals(2,result);
    }
    @Test
    public void findIndexInSortedArrayTest2() {

        int arr[]={2,3,5};
        int val = 1;
        int result = solution.findIndexInSortedArray(arr,0,arr.length-1,val);

        Assert.assertEquals(0,result);
    }
    @Test
    public void findIndexInSortedArrayTest3() {

        int arr[]={2,3,5};
        int val = 7;
        int result = solution.findIndexInSortedArray(arr,0,arr.length-1,val);

        Assert.assertEquals(3,result);
    }

    @Test
    public void findMedianSortedArraysTest1(){
        int nums1[]={1,2,3,4};
        int nums2[]={5,6,7};

        double result = solution.findMedianSortedArrays(nums1,nums2);

        Assert.assertEquals(4,result,0.4);
    }
    @Test
    public void findMedianSortedArraysTest2(){
        int nums1[]={1,3};
        int nums2[]={2};

        double result = solution.findMedianSortedArrays(nums1,nums2);

        Assert.assertEquals(2,result,0.1);
    }
    @Test
    public void findMedianSortedArraysTest3(){
        int nums1[]={1,2};
        int nums2[]={3,4};

        double result = solution.findMedianSortedArrays(nums1,nums2);

        Assert.assertEquals(2.5,result,0.1);
    }

    @Test
    public void findMedianSortedArraysTest4(){
        int nums1[]={12,3,4};
        int nums2[]={4,2,1,3};

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> arr = new ArrayList<>();
        double result = solution.findMedianSortedArrays(nums1,nums2);
        for(int i=0;i<nums1.length;i++){
            arr.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            arr.add(nums2[i]);
        }
        Collections.sort(arr);

        double median;
        if(arr.size()%2==0){
            median=( arr.get(arr.size()/2) + arr.get((arr.size()/2)-1))/2.0;
        }else
            median = arr.get(arr.size()/2);
        Assert.assertEquals(median,result,0.1);
    }
    @Test
    public void findMedianSortedArraysTest5(){
        int nums1[]={0,0};
        int nums2[]={0,0};

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> arr = new ArrayList<>();
        double result = solution.findMedianSortedArrays(nums1,nums2);
        for(int i=0;i<nums1.length;i++){
            arr.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            arr.add(nums2[i]);
        }
        Collections.sort(arr);

        double median;
        if(arr.size()%2==0){
            median=( arr.get(arr.size()/2) + arr.get((arr.size()/2)-1))/2.0;
        }else
            median = arr.get(arr.size()/2);
        Assert.assertEquals(median,result,0.1);
    }
    @Test
    public void findMedianSortedArraysTest6(){
        int nums1[]={};
        int nums2[]={1};

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> arr = new ArrayList<>();
        double result = solution.findMedianSortedArrays(nums1,nums2);
        for(int i=0;i<nums1.length;i++){
            arr.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            arr.add(nums2[i]);
        }
        Collections.sort(arr);

        double median;
        if(arr.size()%2==0){
            median=( arr.get(arr.size()/2) + arr.get((arr.size()/2)-1))/2.0;
        }else
            median = arr.get(arr.size()/2);
        Assert.assertEquals(median,result,0.1);
    }
    @Ignore
    public void findMedianSortedArraysTest7(){
        int nums1[]={1,1,1,2};
        int nums2[]={2,2,2};

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> arr = new ArrayList<>();
        double result = solution.findMedianSortedArrays(nums1,nums2);
        for(int i=0;i<nums1.length;i++){
            arr.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            arr.add(nums2[i]);
        }
        Collections.sort(arr);

        double median;
        if(arr.size()%2==0){
            median=( arr.get(arr.size()/2) + arr.get((arr.size()/2)-1))/2.0;
        }else
            median = arr.get(arr.size()/2);
        Assert.assertEquals(median,result,0.1);
    }
}