package Recursion.Theory;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("enter the number you want to find factorial of: ");
            int n = input.nextInt();
            System.out.println("Factorial of the number is: "+ fact(n));
        }
    }

    public static int fact(int n) {
        if (n==0 || n==1) {//base case
            return 1;
        }
        else{
            return n*fact(n-1);//formula and 
        }
    }
        
}
