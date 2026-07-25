class Solution {
    int missingNum(int arr[]) {
     long m=arr.length+1;
        
        
        long expectedSum=m*(m+1)/2;
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
       return (int)(expectedSum-sum); 
        
    }
    
}