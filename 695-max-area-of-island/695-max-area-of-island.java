class Solution {
    public int maxAreaOfIsland(int[][] grid) 
    {
        // O(n) time | O(n) space
        ArrayList<Integer> myList = new ArrayList<>();
        
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] == 1)
                    myList.add(DFS(grid, i, j, 0));
            }
        }
        return myList.isEmpty() ? 0 : myList.stream().max(Integer::compare).get();        
    }
    
    public int DFS(int[][] grid, int i, int j, int count)
    {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0)
            return 0;
        
        // once the element is visted, change it from 1 -> 0
        grid[i][j] = 0;
        
        int up = DFS(grid, i+1, j, count);
        int down = DFS(grid, i-1, j, count);
        int left = DFS(grid, i, j-1, count);
        int right = DFS(grid, i, j+1, count);
        
        // the element plus 4 other directions
        count += up + down + left + right + 1;
        
        return count;
    }
}