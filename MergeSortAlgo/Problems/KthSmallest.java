package MergeSortAlgo.Problems;

public class KthSmallest {
    static int ans;
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
        int mid = (low+high)/2;
        int pivot = arr[mid];
        int pivotIndex = mid;
        int smallerCount =0;
        for (int i = low+1; i <=high; i++) {
            if (i==mid) {
                continue;
            }
            if (arr[i]<=pivot) {
                smallerCount++;
            }
        }
        int correctIdx = low + smallerCount;
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
    public static void quickSelect(int[] arr,int low, int high,int k){
        if (low>high) {
            return;
        }
        if (low==high) {
            if (low==k-1) {
                ans=arr[low];
                return;
            }
        }
        int idx = partition(arr,low,high);
        if (idx==k-1) {
            ans = arr[idx];
            return;
        }
        if(k-1 < idx)quickSelect(arr, low, idx-1,k);
        quickSelect(arr, idx+1, high,k);
    }
    public static void main(String[] args) {
        int k =3;
        int[] arr = {4,9,1,2,6,5,8};
        int n = arr.length;
        arrayPrinter(arr);
        ans=-1;
        quickSelect(arr,0,n-1,k);
        System.out.println(ans);
    }
}

