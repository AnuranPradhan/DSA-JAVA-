import java.util.Arrays;

public class KthSmallestAndLargestElement {
public static void main(String[] args) {
    int arr[]={3,5,3,4,6,7,9,10};
    int k=1;
    Arrays.sort(arr);
    System.out.println("Kth Smallest element is"+arr[k-1]);
    System.out.println("Kth Largest element is"+arr[arr.length-k]);
}
}
