package week1;
//https://leetcode.com/explore/challenge/card/june-leetcoding-challenge-2021/603/week-1-june-1st-june-7th/3766/
import java.util.Arrays;


public class MaximumAreaOfCake {

   // Reference:  https://www.geeksforgeeks.org/multiply-large-integers-under-large-modulo/
     int moduloMultiplication(int a, int b, int mod)
    {
        int res = 0;
        a %= mod;
        while (b > 0)
        {
            if ((b & 1) > 0)
            {
                res = (res + a) % mod;
            }
            a = (2 * a) % mod;
            b >>= 1;
        }
        return res;
    }

    public int maxConsecutiveInArray(int[] arr,int w){
        int res = 0;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1] > res){
                res = arr[i]-arr[i-1];
            }
        }
        res = arr[0]>res ? arr[0]:res;
        res = w-arr[arr.length-1]>res ? w-arr[arr.length-1]:res;

        return res;
    }
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {

        int modulo = 1000000000+7;
        int hMax = maxConsecutiveInArray(horizontalCuts,h);
        int vMax = maxConsecutiveInArray(verticalCuts,w);
        return moduloMultiplication(hMax,vMax,modulo);
    }
}
