import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void Product(int arr[],int product [],int n){
        int prefix[]=new int[n];
        int suffix[]=new int[n];
        prefix[0]=1;
        for(int i=1;i<n;i++){
prefix[i]=prefix[i-1]*arr[i-1];
        }

        suffix[n-1]=1;
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]*arr[i+1];
        }
        for(int i=0;i<n;i++){
            product[i]=prefix[i]*suffix[i];
        }
    }
public static void main(String[] args) {
    int arr[]={1,2,3,4};
    int product[]=new int[arr.length];
    Product(arr,product,arr.length);
    System.out.println(Arrays.toString(product));
}
}
