import coingame.SolutionCoin;
import coingame.SolutionCoinBottomUp;
import coingame.SolutionCoinTopDown;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by adem on 26/12/2016.
 */
public class TestSolutionCoin {

    @Test
    public void testBottomUp(){
        testDifferentValues(new SolutionCoinBottomUp());
    }

    @Test
    public void testTopDown(){
        testDifferentValues(new SolutionCoinTopDown());
    }

    public void testDifferentValues(SolutionCoin solutionCoin) {
        assertEquals(16,solutionCoin.solve(new int[]{3, 15, 2, 1}));
        assertEquals(23,solutionCoin.solve(new int[]{6, 9, 1, 2, 16, 8}));
        assertEquals(22,solutionCoin.solve(new int[]{8,15,3,7}));
        assertEquals(4,solutionCoin.solve(new int[]{2,2,2,2}));
        assertEquals(42,solutionCoin.solve(new int[]{20,30,2,2,2,10}));
    }

}
