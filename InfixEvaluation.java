package Stacks;

import java.util.Stack;

public class InfixEvaluation {

    // Function to return precedence of operators
    public static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }

    // Function to perform the arithmetic operations
    public static int applyOperation(int v1, int v2, char op) {
        switch (op) {
            case '+': return v1 + v2;
            case '-': return v1 - v2;
            case '*': return v1 * v2;
            case '/': return v1 / v2;
        }
        return 0;
    }

    // Main method to evaluate infix expression
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<Integer> val = new Stack<>();    // Stack for operands
        Stack<Character> op = new Stack<>();   // Stack for operators

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Agar character digit hai toh usse operand stack mein push kar do
            if (Character.isDigit(ch)) {                                            // Agar 'ch' digit hai, to 'ch - '0'' se uska integer value nikal raha hai
                val.push(ch - '0');                                                 // Example: Agar 'ch' '5' hai, to '5' - '0' se 5 milega
            }                                                                       // Yeh integer value ko 'val' stack mein push kar raha hai
                                                                                     
            // Agar '(' hai toh operator stack mein push kar do
            else if (ch == '(') {
                op.push(ch);
            } 
            // Agar ')' hai toh solve karo jab tak '(' nahi milta
            else if (ch == ')') {
                while (op.peek() != '(') {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    char o = op.pop();
                    val.push(applyOperation(v1, v2, o));
                }
                op.pop(); // '(' ko stack se hata do
            } 
            // Agar koi operator milta hai
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                // Operator precedence check karo aur apply karo agar zarurat hai
                while (!op.isEmpty() && precedence(op.peek()) >= precedence(ch)) {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    char o = op.pop();
                    val.push(applyOperation(v1, v2, o));
                }
                op.push(ch); // Current operator ko stack mein push karo
            }
        }

        // Remaining operators ko resolve kar do
        while (!op.isEmpty()) {
            int v2 = val.pop();
            int v1 = val.pop();
            char o = op.pop();
            val.push(applyOperation(v1, v2, o));
        }

        // Final result print karo
        System.out.println("Final Result: " + val.peek());
    }
}
