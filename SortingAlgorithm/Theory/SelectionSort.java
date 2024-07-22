package SortingAlgorithm.Theory;

public class SelectionSort {
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {10,-4,-20,1,-6,8};
        int n = arr.length;
        System.out.print("Array Before Sorting: ");
        ArrayUtility.printArray(arr);
        for (int i = 0; i < n-1; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j = i; j < n; j++) {
                if (arr[j]<min) {
                    min = arr[j];
                    mindx=j;
                } 
            }
        //Swap arr[i] and arr[mindx]
        swap(arr, i, mindx);
    }
    System.out.print("Array After Sorting: ");
    ArrayUtility.printArray(arr);
}}
