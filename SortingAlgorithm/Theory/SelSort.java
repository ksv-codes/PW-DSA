package SortingAlgorithm.Theory;

public class SelSort {
    public static void main(String[] args) {
        int[] arr = {10,-4,-20,1,-6,8};
        int n = arr.length;
        // int min = Integer.MAX_VALUE;
        // int min_idx = -1;
        // for (int i = 0; i < n; i++) {
        //     if (min>arr[i]) {
        //         min=arr[i];
        //         min_idx =i;
        //     }
        // }
        // System.out.println(min+" "+min_idx);


    //SelectionSort    
        for (int i = 0; i < n-1; i++) {
            int min = Integer.MAX_VALUE;
            int min_idx = -1;
            for (int j = i; j < n; j++) {
                if (arr[j]<min) {
                    min = arr[j];
                    min_idx = j;
                }
            }
            //swap arr[i] and arr[mid_idx]
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
        BubSort.printArray(arr);
    }
}
