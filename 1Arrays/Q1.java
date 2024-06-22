package Arrays;
public class Q1 {
    public static void main(String[] args) {
        int count=0;
        int[] marks = new int[] {3,76,39,64};
        for (int i = 0; i < marks.length; i++) {
            if (marks[i]<35) {
                System.out.print(i+" ");
                count++;
            }
        }
        if (count==0) {
            System.out.println("All Pass");
        } 
    }
}
