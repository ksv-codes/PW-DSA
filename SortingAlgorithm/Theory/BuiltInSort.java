package SortingAlgorithm.Theory;

import java.util.Arrays;

public class BuiltInSort {
    public static void main(String[] args) {
        int[] arr = {7,1,2,-4};
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        Arrays.sort(arr);//BUILT IN SORT
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
