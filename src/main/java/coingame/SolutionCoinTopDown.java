package coingame;

/**
 * Created by adem on 24.12.2016.
 */
public class SolutionCoinTopDown implements SolutionCoin{

    public int solve(int[] coins){
        if(coins==null|| coins.length<=0) return 0;

        int [][] scores = new int[coins.length][coins.length];

        return coinWinner(coins,0,coins.length-1,scores);
    }

    private int coinWinner(int [] coins, int from, int to, int scores[][]){
        int size = to-from+1;
        if(coins==null|| coins.length<=0 || from<0 || to>=coins.length || size<=0) return 0;

        if(size==1) return coins[from];
        if(size==2){
            if(coins[from]>coins[to]) return coins[from];
            else return coins[to];
        }

        if(scores[from][to]>0){
            return scores[from][to];
        }

        scores[from][to] = Math.max(
                coins[from]+
                        Math.min(coinWinner(coins,from+2,to,scores),
                                coinWinner(coins,from+1,to-1,scores)),
                coins[to]+
                        Math.min(coinWinner(coins,from,to-2,scores),
                                coinWinner(coins,from+1,to-1,scores)));

        return scores[from][to];
    }


}
