public class MaxSubArray {
    public static int maxProduct(int[] nums) {
        int n=nums.length;
        if(n==0)return 0;
        int prefix=1;
        int suffix=1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            prefix*=nums[i];
            suffix*=nums[n-1-i];
         ans=Math.max(ans,Math.max(suffix,prefix));

         if(prefix==0){
            prefix=1;
         }
         if(suffix==0){
            suffix=1;
         }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(maxProduct(arr));
    }
}
