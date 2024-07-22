package Searching.Problems;

public class LoweBound {
    public static void main(String[] args) {
        int[] arr = {10,23,46,46,91,97,97,140,264};
        int n = arr.length;
        int target = 50;
        int lb = n;
        int low = 0;
        int high = n-1;
        while (low<high) {
            int mid = (high-low)/2 + low;
            if (arr[mid]>=target) {
                lb = Math.min(lb, mid);
                high = mid-1;
            }
            else low = mid +1;
        }
        System.out.println(lb);
    }
}
