class Solution {
    public int closest3Sum(int[] arr, int target) {
          Arrays.sort(arr);
        int n=arr.length;
        int small=Integer.MAX_VALUE;
        int resultValue=0;
        
        for(int i=0;i<arr.length;i++){
         int left=i+1;
         int right=n-1;
         while(left<right){
             int sum=arr[i]+arr[left]+arr[right];
             int sub=Math.abs(target-sum);
            if(sub<small||(sub==small&&sum>resultValue )){
                small=sub;
                resultValue=sum;
            }
             if (sum < target) {
                    left++;
                } else {
                    right--;
                }
         }
     }
      return resultValue;  
    }
}