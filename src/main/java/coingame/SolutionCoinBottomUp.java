package coingame;

/**
 * Created by adem on 24.12.2016.
 */
public class SolutionCoinBottomUp implements SolutionCoin{

    public int solve(int[] coins) {
        if (coins == null || coins.length <= 0) return 0;

        int[][] scores = new int[coins.length][coins.length];

        for (int size = 0; size < coins.length; size++) {
            for (int i = 0; i + size < coins.length; i++) {

                if (size == 0) {
                    scores[i][i] = coins[i];
                } else if (size == 1) {
                    if (scores[i][i] >= scores[i+size][i + size])
                        scores[i][i + size] = scores[i][i];
                    else
                        scores[i][i + size] = scores[i+size][i + size];
                } else {
                    scores[i][i + size] = Math.max(
                            coins[i] +
                                    Math.min(scores[i + 2][i + size], scores[i + 1][i + size - 1]),
                            coins[i + size] +
                                    Math.min(scores[i][i + size - 2], scores[i + 1][i + size - 1]));
                }
            }
        }

        return scores[0][scores.length-1];
    }

}
