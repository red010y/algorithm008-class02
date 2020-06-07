package NumberOfIslands200;

/**
 * 思路：
 * 遍历二维数组，遇到1进行岛屿数累加
 * BFS当前的位置将其周围的值变为0，直到超出范围或者遇到0
 */
public class DFS {
    public static int numIslands(char[][] grid) {
        if (grid.length==0||grid==null)return 0;
        int row =grid.length;
        int column =grid[0].length;
        int num=0;
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                if (grid[i][j]=='1'){
                    num++;
                    dfs(grid,i,j);
                }
            }
        }
        return num;
    }

    private static void dfs(char[][] grid, int i, int j) {
        int row = grid.length;
        int column = grid[0].length;
        if (i<0||j>=column||i>=row||j<0||grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
    }
}
