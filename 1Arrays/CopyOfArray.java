package Arrays;

import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        int[] arr = {10,30,40};
        for (int i : arr) {
            System.out.println(i);
        }

        int[] nums = arr;//ShallowCopy
            nums[0]=100;
            System.out.println(arr[0]);
        
        int[] brr = Arrays.copyOf(arr, arr.length);//DeepCopy(new array)
        brr[0]=56;
        System.out.println(arr[0]);
        System.out.println(brr[0]);

        int[] crr = new int[arr.length];
        for (int i = 0; i < crr.length; i++) {
            crr[i]=arr[i];
        }
        crr[0]=78;
        System.out.println(arr[0]);
    }
}
