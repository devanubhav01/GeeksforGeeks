class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> nums=new HashSet<>();
        for(int i=0;i<arr.length;i++){
         if(nums.contains(target-arr[i])){
             return true;
         }
         nums.add(arr[i]);
     }
     return false;
    }
}