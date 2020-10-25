
  
//695 vs 200
//max area of island

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int area = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1) area = Math.max(area, count(grid, i, j));
            }
        }
        return area;
    }
    
    public int count(int[][] grid, int i, int j){
        if(i >=0 && i < grid.length && j >=0 && j < grid[0].length && grid[i][j] == 1){
            grid[i][j] = 0;
            return count(grid, i+1, j) + count(grid, i-1, j) + count(grid, i, j+1) + count(grid, i, j-1) + 1;
        }
        return 0;
    }
    
}

class Solution {
    public int numIslands(char[][] grid) {
        int ans = 0;
        for (int y = 0; y < grid.length; y++)
            for (int x = 0; x < grid[0].length; x++)
                if (grid[y][x] == '1') {
                    ++ans;
                    dfs(grid, x, y);
                }
        
        return ans;
    }
    
    private void dfs(char[][] grid, int x, int y, int n, int m) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[y][x] == '0')
            return;
        grid[y][x] = '0';
        dfs(grid, x + 1, y);
        dfs(grid, x - 1, y);
        dfs(grid, x, y + 1);
        dfs(grid, x, y - 1);
    }
}

