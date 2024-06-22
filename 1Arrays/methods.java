package Arrays;

import java.util.Arrays;

public class methods {
    public static void main(String[] args) {
        int[] arr = {10,10,40,23,89,34};
        Arrays.sort(arr);
        //foreachloop
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
