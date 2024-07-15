package StringnStringBuilders.Theory;

public class eqquals {
    
    public static void main(String[] args) {
        String s = "abcxyz";//created in StringPool
        String a = "abcxyz";
        String b = new String(s);//cretaed in Heap memory
        String c = "abc";
        c=c+"xyz";
        // System.out.println(s);
        // System.out.println(c);
        // System.out.println(s==c);//s and t are pointing towards the same address location
        // System.out.println(s.equals(c));
        System.out.println(s==b);

    }
}
