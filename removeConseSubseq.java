package Stacks;

import java.util.Stack;

public class removeConseSubseq {
    public static int[] remove(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        
        // Loop through array ke har element ke liye
        for(int i = 0; i < n; i++) {
            // Agar stack khali hai ya phir top element current element se different hai, to push karo
            if(st.isEmpty() || st.peek() != arr[i]) {
                st.push(arr[i]);
            } else {
                // Agar current element stack ke top element ke barabar hai to pop karo
                st.pop();
                
                // Check karo ki jab tak next elements same hain, unko skip kar do
                while(i + 1 < n && arr[i] == arr[i + 1]) {
                    i++; // Same elements ko skip karte jao
                }
            }
        }
        
        // Ab stack mein jo remaining elements hain, unko result array mein dal do
        int[] res = new int[st.size()];
        int m = res.length;
        
        // Stack se elements ko reverse order mein result array mein copy karo
        for(int i = m - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        
        return res; // Final result return karo
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2};
        int[] res = remove(arr);
        
        // Result ko print karo
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}


/*Explanation in Hinglish:
Array Traverse: Pehle hum array ke har element ko loop mein iterate karte hain. Agar stack khali hai ya phir stack ka top element current element se alag hai, toh hum us element ko stack mein push karte hain.

Consecutive Element Handling: Agar current element stack ke top element ke barabar hai, toh usko stack se pop karte hain, kyunki ye ek consecutive duplicate hai. Phir check karte hain ki aage ke elements bhi same hain kya, agar hain, toh unko skip kar dete hain, taaki sequence ke saare duplicates remove ho jayein.

Result Array Creation: Jo elements stack mein bache hue hain, unko ek result array mein reverse order mein dalte hain. Ye result array wahi elements rakhta hai jo unique ya non-consecutive hain.

Final Output: Result array ko print karte hain jo final answer hoga.

Is code ka logic ye hai ki hum stack ka use karke consecutive duplicates ko remove kar dete hain aur jo bache hue elements hain unko result array mein store karte hain. */