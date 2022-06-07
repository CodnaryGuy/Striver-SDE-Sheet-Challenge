import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		long maxSum = 0, curSum = 0;

        for(int i = 0; i < n; i++) {
            curSum = Math.max(0L, curSum + arr[i]);
            maxSum = Math.max(maxSum, curSum);
        }

        return maxSum;
	}

}
