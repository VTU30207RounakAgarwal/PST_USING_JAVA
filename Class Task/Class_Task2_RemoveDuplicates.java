import java.util.*;

public class Class_Task2_RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 30, 40, 40 };
        int ans[] = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                ans[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
