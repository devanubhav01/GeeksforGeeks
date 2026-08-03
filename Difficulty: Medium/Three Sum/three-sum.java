class Solution {
    public static ArrayList<ArrayList<Integer>> triplets(int[] arr) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        int n= arr.length;
        for(int i=0;i<arr.length;i++){
         if(i>0&&arr[i]==arr[i-1]){
             continue;
         }
         int left=i+1;
         int right=n-1;
         while(left<right){
             int sum=arr[i]+arr[left]+arr[right];
             if(sum==0){
                 ArrayList<Integer> triplet=new ArrayList<>();
                 triplet.add(arr[i]);
                 triplet.add(arr[left]);
                 triplet.add(arr[right]);
                 ans.add(triplet);
                 left++;
                 right--;
                 while(left<right &&arr[left]==arr[left-1]){
                     left++;
                 }
                 while(left<right &&arr[right]==arr[right+1]){
                     right--;
                 }
                 }else if(sum<0){
                     left++;
                 
                 }else{
                     right--;
                 }
             }
         }
         return ans;
     }
        
    }

