package Recursion.Theory;
public class FunctionCalls {
    public static void apple() {
        System.out.println("I am in Apple method!!");
    }
    public static void main(String[] args) {
        System.out.println("Hi! I am in main method!!");
        apple();
    }
}
