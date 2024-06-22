package Arrays;

import java.util.Scanner;

public class output {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[7];
        int[] drr = new int[5];
        int n = input.nextInt();
        int[] brr= new int[n];//variable length array
        arr[0]=100;
        arr[1]=10;
        arr[2]=10;
        arr[3]=10;
        arr[4]=10;
        arr[5]=10;
        arr[6]=10;

        for (int i : arr) {
            System.out.println(i);
        }


        //Input of array
        for (int i = 0; i < brr.length; i++) {
            brr[i]=input.nextInt();
        }
        for (int i = 0; i < drr.length; i++) {
            drr[i]=input.nextInt();
        }

        //output
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        //output
        for (int i = 0; i < drr.length; i++) {
            System.out.print(drr[i]+" ");
        }
    }
    
}
