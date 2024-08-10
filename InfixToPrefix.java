package Stacks;
import java.util.Stack;

public class InfixToPrefix {
    // Method to return precedence of operators
    public static int precedence(char op) {
        if(op == '+' || op == '-') return 1;
        if(op == '*' || op == '/') return 2;
        return 0;
    }

    // Method to check if the character is an operator
    public static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/');
    }

    // Main method to convert infix to prefix
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        Stack<String> val = new Stack<>();   // Stack for storing values
        Stack<Character> op = new Stack<>(); // Stack for storing operators

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            // Agar character digit hai to usse direct values stack mein push kar do
            if (Character.isDigit(ch)) {
                val.push("" + ch);
            } 
            // Agar character '(' hai to operator stack mein push kar do
            else if (ch == '(') {
                op.push(ch);
            } 
            // Agar character ')' hai to pop and solve until '(' is found
            else if (ch == ')') {
                while (!op.isEmpty() && op.peek() != '(') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                }
                op.pop(); // '(' ko remove kar do
            } 
            // Agar operator aata hai
            else if (isOperator(ch)) {
                // Pehle wale operator ka precedence check karte hain and agr peek wale ki zyada nikal gyi toh pehle uss peek wale operator ka evaluation karo resut ko val me dalo and then uss kam precedence wale op ko stack me dalo
                while (!op.isEmpty() && precedence(op.peek()) >= precedence(ch)) {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                }
                op.push(ch); // Current operator ko stack mein push kar do
            }
        }

        // Remaining operators ke liye stack ko empty kar do
        while (!op.isEmpty()) {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t = o + v1 + v2;
            val.push(t);
        }

        // Prefix expression print karo
        System.out.println("Prefix expression: " + val.peek());
    }
}
