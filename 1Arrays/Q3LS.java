package Arrays;

import java.util.Scanner;

public class Q3LS {
    public static void main(String[] args) {
    boolean a = true;//To print only onr index
    int count=0;//in case of no element found
    try (Scanner input = new Scanner(System.in)) {
        System.out.print("Enter the no. of element you want in array");
        int n = input.nextInt();
        System.out.print("Enter the element you want to find: ");
        int x = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i]==x) {
                System.out.println("Element is fount at"+" "+i+" index");
                a=false;
                count = 1;
                break;
                
            }
            if (a==false) {
            break;
            }
        }
    }
    if (count==0) {
        System.out.println("Element is not found");
    }
    }
    
}
