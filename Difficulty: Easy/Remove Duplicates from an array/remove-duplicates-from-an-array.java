class Solution {
    ArrayList<Integer> remDuplicate(int arr[]) {
        ArrayList<Integer> nums=new ArrayList<>();
        HashSet<Integer> map=new HashSet<>();
        for(int i=0;i<arr.length;i++){
         if(!map.contains(arr[i])){
             nums.add(arr[i]);
             map.add(arr[i]);
         }
     }
     return nums;
        
    }
}