package Recursion.Problem;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println(powr2(a,b));
        }
    }

    public static int powr(int a, int b) {
        if (a==0 && b==0) {
            System.out.println("Not Defined");
        }
        if (b==0) {
            return 1;
        }
        return a * powr(a, b-1);
    }

    public static int powr2(int a, int b) {
        if (a==0 && b==0) {
            System.out.println("Not Defined");
        }
        if (b==0) {
            return 1;
        }
       if (b%2==0) {
        return powr2(a, b/2) * powr(a, b/2);
       }
       else{
        return powr2(a, b/2) * powr(a, b/2) * a;
       }
    }
}
