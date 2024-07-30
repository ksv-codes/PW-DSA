package MergeSortAlgo.Theory;

public class QuickSortAlgo {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void arrayPrinter(int[] arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static int partition(int[] arr,int low,int high){
        int pivot = arr[low];
        int pivotIndex = low;
        int smallerCount =0;
        for (int i = low+1; i <=high; i++) {
            if (arr[i]<=pivot) {
                smallerCount++;
            }
        }
        int correctIdx = pivotIndex + smallerCount;
        //swap arr[pivotIdx] & arr[correctIdx]
        swap(arr, pivotIndex, correctIdx);
        //partition
        int i = low;
        int j = high;
        while (i<correctIdx && j>correctIdx) {
            if (arr[i]<pivot) {
                i++;
            }
            else if (arr[j]>pivot) {
                j--;
            }
            else if (arr[i]>pivot && arr[j]<=pivot) {
                swap(arr, i, j);
            }
        }
        return correctIdx;
    }
    public static void quickSorter(int[] arr,int low, int high){
        if (low>=high) {
            return;
        }
        //pivot arr[low] ko shi jagah rakho
        //& pivot ke left me elements<(pivot)arr[low] rakho and pivot ke right me elements>(pivot)arr[low]
        int idx = partition(arr,low,high);
        quickSorter(arr, low, idx-1);
        quickSorter(arr, idx+1, high);
    }
    public static void main(String[] args) {
        int[] arr = {4,9,7,1,2,3,6,5,8};
        int n = arr.length;
        arrayPrinter(arr);
        quickSorter(arr,0,n-1);
        arrayPrinter(arr);
    }
}
