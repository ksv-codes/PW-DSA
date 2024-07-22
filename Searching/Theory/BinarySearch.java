package Searching.Theory;
class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,23,46,89,91,97,107,140,264};
        int n = arr.length;
        int target = 10;
        int low = 0;
        int high = n-1;
        boolean flag = false;//array not found
        int res = -1;
        while (low<=high) {
            int mid = ((low+high)/2);//low+ (high - low)/2
            if (arr[mid]==target) {
                flag = true;
                res = mid;
                break;
            }
            else if (arr[mid]>target) {
                 high = mid-1;
            }
            else if (arr[mid] < target) {
                low = mid+1;
            }

        }
        if (flag) {
            System.out.println("target found at "+ res+" index");
        }
        else System.out.println("Target not found");
    }
}
