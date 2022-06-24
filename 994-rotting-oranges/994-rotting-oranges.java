class Solution {
   int[][] direction = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    
    public int orangesRotting(int[][] grid) {
		int rows = grid.length;
		int cols = grid[0].length;
		// create a queue to store coordinates of rotten oranges
		Queue<int[]> queue = new LinkedList<>();
		int freshCount = 0;

		// traverse by each cell of grid
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (grid[i][j] == 1) {
					// increase count of fresh orange
					freshCount++;
				} else if (grid[i][j] == 2) {
					// add all rotten oranges coordinates to the queue
					queue.offer(new int[] { i, j });
				}
			}
		}

		int time = 0;
		// BFS starting from initially rotten oranges
		while (!queue.isEmpty() && freshCount > 0) {
			// Initialize size as size of queue
			int size = queue.size();

			for (int i = 0; i < size; i++) {
				// pick and remove an element from the queue
				int[] curr = queue.poll();
				// Traverse into all four direction for this cell and check if a fresh orange
				// exists on a valid coordinates of matrix
				// add that adjacent coordinate to the queue and mark that orange as rotten
				for (int[] dir : direction) {
					int nextX = curr[0] + dir[0];
					int nextY = curr[1] + dir[1];
					if (nextX < 0 || nextX >= rows || nextY < 0 || nextY >= cols || grid[nextX][nextY] != 1) {
						continue;
					}
					queue.offer(new int[] { nextX, nextY });
					grid[nextX][nextY] = 2;
					freshCount--;
				}
			}
			time++;
		}
		if(freshCount > 0) {
			System.out.println("fresh Count: " + freshCount);
		}
		
		return freshCount == 0 ? time : -1;
	}
}