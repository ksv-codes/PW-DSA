package stringss.Theory;

import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
    System.out.println("Enter your name");
    try (Scanner input = new Scanner(System.in)) {
        String s = input.next();
        //String x = input.next();
        System.out.print("Hii ");
        System.out.println(s); 
        //System.out.println(x);
    }
    }
}
