import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        int miniPrice = Integer.MAX_VALUE;
        int profit = 0;
        for(int i=0; i<prices.size(); i++){
             miniPrice = Math.min(miniPrice, prices.get(i));
             profit = Math.max(profit, prices.get(i) - miniPrice);
            // Alternate way to write logic
//             if(prices.get(i) < miniPrice)
//                 miniPrice = prices.get(i);
//             else if(prices.get(i) - miniPrice > profit)
//                 profit = prices.get(i) - miniPrice;
        }
        return profit;
    }
}