import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    { 
        int low = 0; 
        int mid = 0; 
        int high = arr.length - 1;
        int temp;
        while(mid <= high){
            switch(arr[mid]){
                case 0:
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
            }
       }
    }
}