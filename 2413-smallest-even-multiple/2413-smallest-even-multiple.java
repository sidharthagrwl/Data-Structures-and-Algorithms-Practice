class Solution {
    public int smallestEvenMultiple(int n) {
        
        int max = (2*n);
        
        for(int i=1;i<=max;i++) {
            if((i%2==0) && (i%n==0)) return i;
        }
        
        return -1;
    }
}