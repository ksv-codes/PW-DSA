package Recursion.Problem;

import java.util.Scanner;

public class PrintIncreasingAfterCall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = input.nextInt();
        print(n);
    }

    private static void print(int n) {
        if (n==0) return;
        print(n-1);
        System.out.println(n);
        
    }
}
