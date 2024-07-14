package stringss.Theory;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String a = input.nextLine();
            int c = input.nextInt();
            input.nextLine();//to consume new line character
            String b = input.nextLine();
            System.out.println(a+b);
            System.out.println(c);
        }
        
    }
}
