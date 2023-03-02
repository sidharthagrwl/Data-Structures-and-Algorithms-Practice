class Solution {
    public int largestAltitude(int[] gain) {
        
        int arr[] = new int[gain.length+1];
        arr[0] = 0;
        int sum = 0;
        
        for(int i=0;i<gain.length;i++) {
            sum += gain[i];
            arr[i+1] = sum;
        }
        
        int max = arr[0];
        for(int x: arr) {
            if(x > max) max = x;
        }
        
        return max;
    }
}