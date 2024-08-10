package Stacks;

import java.util.Stack;

public class Post2In {
    public static void main(String[] args) {
        String str = "953+4*6/-";  // Yeh hai postfix expression jo infix mein convert karna hai
        Stack<String> val = new Stack<>();  // Yeh stack infix operands (values) store karega

        // Loop to process each character in the postfix expression
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);  // Current character ko fetch kar rahe hain

            // Agar character ek digit hai, toh usse stack mein push kar do
            if (Character.isDigit(ch)) {
                val.push("" + ch);  // Character ko string mein convert karke stack mein push karte hain
            } 
            // Agar operator milta hai, toh do operands pop karte hain aur unhe combine karte hain
            else {
                String v2 = val.pop();  // Second operand ko stack se pop karo
                String v1 = val.pop();  // First operand ko stack se pop karo

                // Operator ke hisaab se ek infix expression banao aur usse stack mein push karo
                String temp = "(" + v1 + ch + v2 + ")";  // Operands ko operator ke saath combine karke stack mein push kar do
                val.push(temp);  // Combined infix expression stack mein push ho jayega
            }
        }

        // Final infix expression stack ke top pe hoga, usse print kar do
        System.out.println("Infix expression: " + val.peek());  // Yeh hai final infix expression jo humein mila hai
    }
}
