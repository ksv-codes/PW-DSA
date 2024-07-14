package stringss.Problems;

import java.util.Scanner;

public class Q1 {
 public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
        System.out.print("Enter your string");
        String s = input.nextLine();
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(isVowel(ch)==true){
                count++;
            }
        }
        System.out.println(count);
    }
 }

public static boolean isVowel(char ch) {
    if (ch=='a'|| ch=='A')return true;
    if (ch=='e'|| ch=='E')return true;
    if (ch=='i'|| ch=='I')return true;
    if (ch=='o'|| ch=='O')return true;
    if (ch=='u'|| ch=='U')return true;
    else{
        return false;
    }

}}
