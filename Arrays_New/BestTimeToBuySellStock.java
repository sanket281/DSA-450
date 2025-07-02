package Arrays_New;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};
        int buy = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<buy)
            {
                buy = prices[i];
            }
            else if(prices[i] - buy>profit)
            {
                profit = prices[i] - buy;
            }
        }
        System.out.println(profit); 
    }
}


