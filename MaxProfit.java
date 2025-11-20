class MaxProfit {

    public int maxProfit(int[] prices) {
        
        Integer buy = prices[0];
        Integer profit = 0;

        for(int i = 1 ; i < prices.length; i++)
        {
            if(prices[i] < buy)
            {
                buy = prices[i];
                continue;
            }

            if(prices[i] - buy > profit)
            {
                profit  = prices[i] - buy;
            }
        }

        return profit;
    }

public static void main(String[] args){

}
}
