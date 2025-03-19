import java.util.Arrays;

public class SortColors {

    private static void sortColors(int[] arr) {
        int i = 0;
        int j = 0;
        int k = arr.length - 1;

        while (j <= k) {
            if (arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            } else if (arr[j] == 1) {
                j++;
            } else {
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                k--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0, 0, 1, 2, 0};
        System.out.println("Before sorting the colors :");
        System.out.println(Arrays.toString(arr));
        sortColors(arr);
        System.out.println("After sorting the colors");
        System.out.println(Arrays.toString(arr));
    }
}
