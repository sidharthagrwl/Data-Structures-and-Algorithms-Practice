class Solution {
    public double average(int[] salary) {
     
        int max = salary[0];
        int min = salary[0];
        int sum = 0;
        
        for(int i=0;i<salary.length;i++) {
            if(salary[i] > max) max = salary[i];
            if(salary[i] < min) min = salary[i];
            sum += salary[i];
        }
        
        double avg = sum - (max+min);
        return avg/(salary.length-2);
        
    }
}