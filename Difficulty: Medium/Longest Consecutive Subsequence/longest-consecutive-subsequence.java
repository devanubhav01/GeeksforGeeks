class Solution {
    public int longestConsecutive(int[] arr) {
         HashSet<Integer> set = new HashSet<>();
        
        
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        
        int longest = 0;
        
        
        Integer[] setArray = set.toArray(new Integer[0]);
        
        for (int i = 0; i < setArray.length; i++) {
            int num = setArray[i];
            
    
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;
                
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }
                
                longest = Math.max(longest, count);
            }
        }
        
        return longest;
        
    }
}