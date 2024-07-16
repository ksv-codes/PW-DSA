package SortingAlgorithm.Theory;

public class BubSort {
    public static void printArray(int [] arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4};
        int n = arr.length;
        for (int j = 0; j < n-1; j++) {//ek pass me cheeze kam nhi karti hain //aur har pass me ek km baar swap krna pad rha
            boolean flag = true; 
            for (int i = 0; i < n-1-j; i++) {
                if (arr[i]>arr[i+1]) {
                    int temp = arr[i];
                    arr[i] =arr[i+1];
                    arr[i+1] =temp;
                    flag =false;
                }
            }
        if (flag) {
            break;
        }
        }
        printArray(arr);
    }
}
