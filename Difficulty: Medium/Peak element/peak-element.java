class Solution {
    public int peakElement(int[] arr) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr.length==1){
                return i;
            }
            else if(i==0&&arr[i]>arr[i+1]){
             return i;
         }else if(i==arr.length-1&&arr[arr.length-1]>arr[arr.length-2]){
             return arr.length-1;
         }
          else if(arr[i]>arr[i+1]&&arr[i]>arr[i-1]){
             return i;
         }
     }
       return 0; 
    }
}