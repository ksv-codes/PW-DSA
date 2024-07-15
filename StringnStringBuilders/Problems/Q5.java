package StringnStringBuilders.Problems;

public class Q5 {
    //Update even Positions
    public static void main(String[] args) {
        String s = "Physics Wallah Skills";
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if(i%2==0){
                str+='a';
            }
            else{
                str+=s.charAt(i);
            }
        }
        s=str;
        System.out.println(s);//Bahut hi costly Method
    }
}
