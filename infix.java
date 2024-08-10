package Stacks;

import java.util.Stack;

public class infix {
    public static void main(String[] args) {
        String str = "9-5+3*4/6";
        Stack<Integer>  val = new Stack<>();
        Stack<Character>  op = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);//ch='5'
            int ascii=(int)ch;//ascii=53
            //'0'->48 and '9'->57
            if(ascii>=48 && ascii<=57) val.push(ascii-48);
            else if (op.isEmpty()) op.push(ch);
            else{
                if(ch=='+'||ch=='-'){
                    //work
                    int v2=val.pop();
                    int v1=val.pop();
                    if (op.peek()=='-') val.push(v1-v2);
                    if (op.peek()=='+') val.push(v1+v2);
                    if (op.peek()=='*') val.push(v1*v2);
                    if (op.peek()=='/') val.push(v1/v2);
                    op.pop();
                    //push
                    op.push(ch);
                }
                if(ch=='*'||ch=='/'){
                    if (op.peek()=='*'||op.peek()=='/') {
                        //work
                        int v2=val.pop();
                        int v1=val.pop();
                        if (op.peek()=='*') val.push(v1*v2);
                        if (op.peek()=='/') val.push(v1/v2);
                        op.pop();
                        //push
                        op.push(ch);
                    }
                    else op.push(ch);
                    
                }
            }
        }
        while (val.size()>1) {
            int v2= val.pop();
            int v1=val.pop();
            if (op.peek()=='-') val.push(v1-v2);
            if (op.peek()=='+') val.push(v1+v2);
            if (op.peek()=='*') val.push(v1*v2);
            if (op.peek()=='/') val.push(v1/v2);
            op.pop();
        }
        System.out.println(val.peek());
    }
}

/*Precedence Function:

Ye function operator ka precedence return karta hai. Higher precedence matlab pehle evaluate karna hai (* aur / ka precedence higher hai + aur - se).
applyOperation Function:

Ye function actual arithmetic operation perform karta hai based on the operator. Switch case ka use karke, ye v1 aur v2 par operation perform karta hai.
Main Logic:

Digit Handling: Agar current character digit hai, toh usse val stack mein push kar dete hain.
Opening Parenthesis: Agar ( aata hai, toh op stack mein push kar dete hain.
Closing Parenthesis: Agar ) aata hai, toh hum operators ko evaluate karte hain jab tak ( nahi mil jata.
Operator Handling: Agar koi operator aata hai, toh hum pehle check karte hain ki jo operator stack mein hai uska precedence zyada hai ya nahi. Agar zyada hai toh pehle usko evaluate karte hain.
Final Evaluation: Jab saara infix expression process ho jata hai, tab jo bache operators hain unhe bhi evaluate kar lete hain.
Output:

Finally, jo result val stack mein bacha hota hai, wahi humara evaluated expression hai. */
