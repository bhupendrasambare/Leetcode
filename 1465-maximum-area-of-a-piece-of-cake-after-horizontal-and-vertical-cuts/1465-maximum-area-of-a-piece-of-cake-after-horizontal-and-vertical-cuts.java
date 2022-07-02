class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int mod = (int) 1e9 + 7;
        
        int nh = horizontalCuts.length;
        int nw = verticalCuts.length;
        
        long max_h = horizontalCuts[0];
        long max_w = verticalCuts[0];
        
        for(int i=1;i<nh;i++)
            max_h = Math.max(horizontalCuts[i] - horizontalCuts[i-1],max_h);
         
        for(int i=1;i<nw;i++)
            max_w = Math.max(verticalCuts[i] - verticalCuts[i-1], max_w);
        max_h = Math.max(h-horizontalCuts[nh-1], max_h);
        max_w = Math.max(w-verticalCuts[nw-1],max_w);

        return (int)((max_h*max_w) % mod);
    }
}