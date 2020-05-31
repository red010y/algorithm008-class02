package MinimumPathSum64;

/**
 * 在上个解法中，我们可以用一个一维数组来代替二维数组，
 * dpdp 数组的大小和行大小相同。这是因为对于某个固定状态，
 * 只需要考虑下方和右侧的节点。首先初始化 dp 数组最后一个元素是右下角的元素值，
 * 然后我们向左移更新每个 dp(j)dp(j) 为：
 */
public class DP_one {
    public int minPathSum(int[][] grid) {
        int[] dp = new int[grid[0].length];
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[0].length - 1; j >= 0; j--) {
                if(i == grid.length - 1 && j != grid[0].length - 1)
                    dp[j] = grid[i][j] +  dp[j + 1];
                else if(j == grid[0].length - 1 && i != grid.length - 1)
                    dp[j] = grid[i][j] + dp[j];
                else if(j != grid[0].length - 1 && i != grid.length - 1)
                    dp[j] = grid[i][j] + Math.min(dp[j], dp[j + 1]);
                else
                    dp[j] = grid[i][j];
            }
        }
        return dp[0];
    }
}
