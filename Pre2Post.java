package Stacks;

import java.util.Stack;

public class Pre2Post {
    public static void main(String[] args) {
        String str = "-9/*+5346";  // Yeh prefix expression hai jo humein postfix mein convert karna hai
        Stack<String> val = new Stack<>();  // Yeh stack string values store karega

        // Loop ko reverse karna hai, kyunki prefix mein pehle se shuru karte hain
        for (int i = str.length() - 1; i >= 0; i--) {  // i ko decrement karna hai, 0 tak
            char ch = str.charAt(i);  // Current character ko fetch kar rahe hain

            // Agar character digit hai, toh usse stack mein push kar do as string
            if (Character.isDigit(ch)) {
                val.push("" + ch);  // Character ko string mein convert karke stack mein push karte hain
            } 
            // Agar operator milta hai, toh do operands ko pop karo
            else {
                String v1 = val.pop();  // First operand ko pop karo
                String v2 = val.pop();  // Second operand ko pop karo

                // Operator ko operands ke saath concatenate karke stack mein wapas push kar do
                String temp = v1 + v2 + ch;  // Postfix expression mein pehle operands aate hain
                val.push(temp);  // Final expression ko stack mein push kar dete hain
            }
        }

        // Stack ke top par final postfix expression hoga, usse print kar do
        System.out.println("Postfix expression: " + val.peek());
    }
}


/*String str: Prefix expression jo humein postfix mein convert karna hai.
Reverse Loop: Prefix expression ko evaluate karne ke liye loop ko reverse mein chalayenge, kyunki prefix mein operators pehle aate hain.
Operand Handling: Agar Character.isDigit(ch) true hai, toh matlab character ek digit hai (0 se 9 ke beech), usse stack mein string ke roop mein push kar dete hain.
Operator Handling: Agar character operator hai (+, -, *, /), toh stack se do operands pop karte hain, unhe concatenate karte hain (pehle operands phir operator), aur result ko wapas stack mein push kar dete hain.
Final Result: Loop ke baad stack ke top par jo string bachi hai, wahi final postfix expression hoga, jo hum print karenge. */