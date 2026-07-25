class Solution {
    public int longestSubarray(int[] arr, int k) {
        HashMap<Long,Integer> map=new HashMap<>();
        long sum=0;
        int maxLen=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                maxLen=i+1;
            }
            long rem=sum-k;
            if(map.containsKey(rem)){
                int len=i-map.get(rem);
                maxLen=Math.max(len,maxLen);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLen;
    }
}
