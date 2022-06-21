class Solution {
    public final int[][] DIRECTIONS = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    private int origColor = -1;
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        if (origColor == -1) {
            origColor = image[sr][sc];
        }
        
        image[sr][sc] = color;
        
        for (int[] dir : DIRECTIONS) {
            int x = sr + dir[0];
            int y = sc + dir[1];
            
            if (x >= 0 && x < image.length && y >= 0 && y < image[0].length && image[x][y] == origColor && image[x][y] != color) {
                floodFill(image, x, y, color);
            }
        }
        
        return image;
    }
}