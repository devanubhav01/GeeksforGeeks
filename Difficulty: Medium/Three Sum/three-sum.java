class Solution {
    public static ArrayList<ArrayList<Integer>> triplets(int[] arr) {
        ArrayList<ArrayList<Integer>> nums=new ArrayList<>();
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
         if(i>0&&arr[i]==arr[i-1]){
             continue;
         }
         int left=i+1;
         int right=n-1;
         while(left<right){
             int sum=arr[i]+arr[left]+arr[right];
             
             ArrayList<Integer> z=new ArrayList<>();
             
             if(sum==0){
                 z.add(arr[i]);
                 z.add(arr[left]);
                 z.add(arr[right]);
                 nums.add(z);
                 left++;
             right--;
                 while(left<right&&arr[left]==arr[left-1]){
                     left++;
                 }
                 while(left<right&&arr[right]==arr[right+1]){
                     right--;
                 }
             }else if(sum<0){
                 left++;
             }else{
                 right--;
             }
         }
     }
       return nums; 
    }
}
