package stringss.Theory;

public class plusOp {
    public static void main(String[] args) {
        String s = "abc";
        s=s.concat("xyz");//have to be a string to add
        System.out.println(s);
        String t = "pqr";
        s=s+"xyz";
        s=s+t;//s+=t;
        s=s+10;
        s=s+'z';
        System.out.println(s);
        System.out.println("hi I am " + 10);
        s=10+s;
        System.out.println(s);
        System.out.println("abc"+10+20);
        System.out.println(10+20+"abc");
    }
}
