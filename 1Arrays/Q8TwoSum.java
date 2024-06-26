package Arrays;

public class Q8TwoSum {
    public static void main(String[] args) {
        int[] arr ={2,5,7,9,5};
        int x = 12;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==x) {
                    System.out.println(i+" "+j);
                    flag = true;
                    break;
                }
            }
            if (flag==true) {
                break;
            }
        }
    }
    
}