package stringss.Theory;

public class indexOfnCompareto {
    public static void main(String[] args) {
        String s = "Raghav Garg";
        System.out.println(s.indexOf('r'));
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf("Gar"));
        System.out.println(s.lastIndexOf('a'));

        String a = "abc";
        String b = "dbc";
        System.out.println(a.compareTo(b));
        String c = "defgh";
        String d = "def";
        System.out.println(c.compareTo(d));

        String x = "Physics Wallah Skills";
        System.out.println(x.contains("all"));//true 
        System.out.println(x.startsWith("all"));//true 
    }
}
