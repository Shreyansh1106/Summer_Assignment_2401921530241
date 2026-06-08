class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int p=0;
        for(int price : prices){
            if(price<min){
                min=price;
            }
            else if(price-min>p){
                p=price-min;
            }
        }
        return p;
    }
}
