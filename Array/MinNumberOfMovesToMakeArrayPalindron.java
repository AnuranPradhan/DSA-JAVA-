public class MinNumberOfMovesToMakeArrayPalindron {

    public static int MinMoves(int arr[]){
        int i=0;
        int j=arr.length-1;
        int ans=0;
        while(i<=j){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }else if(arr[i]>arr[j]){
                j--;
                arr[j]+=arr[j+1];
                ans++;
            }else{
                i++;
                arr[i]+=arr[i-1];
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
       int arr[] = {15, 4, 15};
       System.out.println(MinMoves(arr));
      int arr1[] = {1, 4, 5, 1};
      System.out.println(MinMoves(arr1));
      int arr2[] = {11, 14, 15, 99};
      System.out.println(MinMoves(arr2));
    }
}
