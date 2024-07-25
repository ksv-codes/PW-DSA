package Recursion.Theory;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }
    public static int fibo(int i) {
        if (i<=1) {
            return i;
        }
        return fibo(i-2) + fibo(i-1);
    }
}
