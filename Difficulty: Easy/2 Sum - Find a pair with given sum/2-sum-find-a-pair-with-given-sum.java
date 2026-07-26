class Solution {
    public List<Integer> twoSum(int arr[], int target) {
        Arrays.sort(arr);
         ArrayList<Integer> ans= new ArrayList<>();
        int left=0,right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
            ans.add(arr[left]);
            ans.add(arr[right]);
            return ans;
            } 
            if(sum<target){
                left++;
            }else{
                right--;
            }
        }
         
            
      return ans;  
        
    }
}