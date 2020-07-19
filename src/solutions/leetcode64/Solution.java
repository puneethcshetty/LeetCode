package solutions.leetcode64;

import java.util.HashMap;

class Solution {
	
	//using brute force
    HashMap<String,Integer> map =  new HashMap<>();
    public int minPathSum(int[][] grid) {
        int result = 0;
        if(grid.length!=0)
            result = dfs(grid,0,0);
        return result;
    }
    
    public int dfs(int[][] grid, int i, int j){
        if(i>grid.length-1 || j>grid[0].length-1)
            return Integer.MAX_VALUE;
        if(grid.length-1==i && grid[0].length-1==j)
            return grid[i][j];
        
        Integer min = map.get(i+":"+j);
        int down = 0, right = 0;
        if(min != null)
            return min;
        
        min = grid[i][j];
        down = dfs(grid,i+1,j);
        right = dfs(grid,i,j+1);
        
        min += down<right?down:right;
        map.put(i+":"+j,min);
        return min;
    }
    
    //Better solution
    public int minPathSum1(int[][] grid) {
        int[] min = new int[grid[0].length];
        for(int i = grid.length-1 ; i >= 0 ; i--)
            for(int j = grid[0].length-1 ; j >= 0 ; j--){
                if(i == grid.length-1 && j != grid[0].length-1)
                    min[j] = grid[i][j] + min[j+1];
                else if(j == grid[0].length-1 && i != grid.length-1)
                    min[j] = grid[i][j] + min[j];
                else if(j != grid[0].length-1 && i != grid.length-1)
                    min[j] = grid[i][j] + Math.min(min[j],min[j+1]);
                else
                    min[j] = grid[i][j];
            }
        return min[0];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
