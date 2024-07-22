package SortingAlgorithm.Theory;

public class InsertinSort {
    public static void main(String[] args) {
        int[] arr = {10,-4,20,78,-6,8};
        int n = arr.length;
        System.out.print("Array Before Sorting: ");
        ArrayUtility.printArray(arr);
        //Insertion Sort
        // for (int i = 1; i < n; i++) {
        //     for (int j = i; j >=1; j--) {
        //         if (arr[j]<arr[j-1]) {
        //             SelectionSort.swap(arr, j, j-1);
        //         }
        //         else{
        //             break;
        //         }
        //     }
        //     ArrayUtility.isSorted(arr);
        // }
        for (int i = 1; i < n; i++) {
            int j =1;
            while (j>=1 && arr[j]<arr[j-1]) {
                SelectionSort.swap(arr, j-1, j);
                j--;
            }
           //ArrayUtility.isSorted(arr);
        }
        System.out.print("Array after Sorting: ");
        ArrayUtility.printArray(arr);
    }
}
