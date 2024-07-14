package stringss.Theory;

public class LUcase {
    public static void main(String[] args) {
        String s = "Raghav Garg is 24 years Old";
        //s.toLowerCase(); have to be stored or printed
        System.out.println(s.toLowerCase());//wont change the string
        s = s.toLowerCase();//will change the string
        System.out.println(s.toUpperCase());
        System.out.println(s);//lowerCase me hi rhega
        String a = "abc";
        a.concat("def");//wont do anuthing
        System.out.println(a.concat("def"));
        System.out.println(a);
        a= a.concat("def");
        System.out.println(a);
        String cd = "";
        System.out.println(cd.length());
    }
}
