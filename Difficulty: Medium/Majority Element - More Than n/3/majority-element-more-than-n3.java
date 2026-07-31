class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
       ArrayList<Integer> a=new ArrayList<>();
        HashMap<Integer,Integer> nums=new HashMap<>();
        for(int i=0;i<arr.length;i++){
          nums.put(arr[i], nums.getOrDefault(arr[i], 0) + 1);
          if (nums.get(arr[i]) > arr.length / 3&&!a.contains(arr[i])){
            
         a.add(arr[i]);
            
     }
     }
     
     Collections.sort(a); 
     return a;
        
    }
}