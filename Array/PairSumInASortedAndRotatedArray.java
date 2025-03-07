public class PairSumInASortedAndRotatedArray {
public static int findPivot(int[]arr,int n){
    for(int i=0;i<n-1;i++){
        if(arr[i]>arr[i+1]){
            return i;
        }
    }
    return n-1;
}
public static boolean findPair(int arr[],int n,int target){
    int pivot=findPivot(arr, n);
    int low=(pivot+1)%n;
    int high=pivot;

    while(low!=high){
int currSum=arr[low]+arr[high];
if(currSum==target){
    return true;
}
 
if(currSum>target){
    high=(high+n-1)%n;
}
else{
    low=(low+1)%n;
}
    }
    return false;
}
public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6};
    System.out.println(findPair(arr,arr.length,12));
}
}
