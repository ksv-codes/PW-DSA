package Recursion.Problem;

import java.util.Scanner;

public class mazePath {    //to know at a particular moment hum kha pr hain
    public static int maze(int row,int column,int m,int n){
        if (row==m || column ==n) {
           return 1;
        }
        int rightWays = maze(row,column+1,m,n);//right jane ke baad kitne number of ways aaenge
        int downWays = maze(row+1, column, m, n);
        return rightWays + downWays;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter m");
        int m = input.nextInt();
        System.out.println("Enter n");
        int n = input.nextInt();
        System.out.println(maze2(m,n));
    }
    public static int maze2(int m,int n){
        if (m==1 || n==1) {
           return 1;
        }
        int rightWays = maze2(m,n-1);//right jane ke baad kitne number of ways aaenge
        int downWays = maze2(m-1, n);
        return rightWays + downWays;
    }
    public static int maze3(int m,int n){
        if (m==1 || n==1) {
           return 1;
        }
        return maze3(m,n-1) + maze3(m-1, n);
    }
}
