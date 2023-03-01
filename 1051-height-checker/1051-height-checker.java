class Solution {
    public int heightChecker(int[] heights) {
        
        int expected[] = new int[heights.length];
        for(int i=0;i<heights.length;i++) {
            expected[i] = heights[i];
        }
        
        Arrays.sort(expected);
        
        int i=0;
        int count = 0;
        
        while(i<heights.length) {
            if(expected[i] != heights[i]) count++;
            i++;
        }
        
        return count;
    }
}