class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] numCoins = new int[amount + 1];
        numCoins[0] = 0;
        for (int i=1; i < numCoins.length; i++){
            numCoins[i] = Integer.MAX_VALUE - 1;
        }
        for (int i=0; i < coins.length; i++){
            for (int j=1; j < numCoins.length; j++){
                if(j >= coins[i]){
                    numCoins[j] = Math.min(numCoins[j], 1+numCoins[j-coins[i]]);
                }
            }
        }
        if(numCoins[amount] == Integer.MAX_VALUE - 1)
            return -1;
        return numCoins[amount];
    }
}