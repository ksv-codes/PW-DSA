package SortingAlgorithm.Theory;
import java.util.Scanner;
 public class ArrayUtility {
    static int z;
    public static boolean isSorted(int[] a) {
        int n = a.length;
        boolean flag = true;
        for (int i = 0; i < n-1; i++) {
            if (a[i]>a[i+1]) {
                //System.out.println("Unsorted");
                flag = false;
                z = i; //Don't initialize a value inside a if condition that's why value -1 se initialize ki na ki just declare kr diya
                break;
            }
        }
        // if (!flag) {
        //     System.out.printf("array got unsorted at %dth index",z);
        //     System.out.println();
        // }
        if (flag) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String...keshav) {
       try (Scanner input = new Scanner(System.in)) {
        System.out.println("Welcome to array Sorting checker");
           System.out.print("Please Enter the length of the array you want to Check: ");
           int l = input.nextInt();
           int[] arr = new int[l];
           for (int i = 0; i < l; i++) {
                System.out.print("Please Enter the "+i+"th"+" element of the array: ");
                arr[i]=input.nextInt();
            }
            boolean result = isSorted(arr);
            System.out.println();
            if (result) {
                printArray(arr);
                System.out.println("Your array is sorted ");
            }
            else{
                printArray(arr);
                System.out.println("Your array is not sorted at "+z);
            } 
    }
    }
    public static void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
