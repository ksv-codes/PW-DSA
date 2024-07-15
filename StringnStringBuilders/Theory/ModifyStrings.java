package StringnStringBuilders.Theory;

public class ModifyStrings {
    public static void main(String[] args) {
        String s = "Hello";
        //heylo s.charAt(2)=y;
        //2nd index change to y
        s= s.substring(0,2)+'y'+s.substring(3);
        System.out.println(s);//bahut zyada time and space waste hora hain
        

    }
}
