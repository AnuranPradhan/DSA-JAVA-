import java.util.Arrays;

public class ReverseArray {
    public static int[] reverse(int []arr,int start,int end){
if(arr.length==1){
    return arr;
}
if(end<=start){
    return arr;
}
int temp=arr[start];
arr[start]=arr[end];
arr[end]=temp;
return reverse(arr, start+1, end-1);
    }
public static void main(String[] args) {
    int arr[]={1,2,5,6,8,4,6};
reverse(arr, 0, arr.length-1);
System.out.println(Arrays.toString(arr));
}
}
