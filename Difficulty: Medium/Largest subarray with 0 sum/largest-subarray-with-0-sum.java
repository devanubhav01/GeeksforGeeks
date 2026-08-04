class Solution {
    int maxLength(int arr[]) {
        HashMap<Integer,Integer> nums=new HashMap<>();
        int n=arr.length;
        int max=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
         sum+=arr[i];
         if(sum==0){
             max=i+1;
         }else{
             if(nums.containsKey(sum)){
                 max=Math.max(max,i-nums.get(sum));
             }else{
                 nums.put(sum,i);
             }
         }
     }
        
        
        
       return max; 
        
        
        
    }
}