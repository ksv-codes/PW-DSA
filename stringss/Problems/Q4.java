package stringss.Problems;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            String s = Integer.toString(n);//Wrapper Class
            System.out.print("Length of the Entered String is: ");
            System.out.println(s.length());
        }
    }
}
