package Arrays;

public class rotateArray189 {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7};
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        int[] res = new int[7];
        int n = 7;
        int k = 5;
        //{3,4,5,6,7,1,2}
        for (int i = (7-5); i < 7; i++) {
            for (int j = i-2; j < i-1; j++) {
                res[j]=arr[i];
                
            }
        }
        for (int i = 0; i < 2; i++) {//i=0,1
            for (int j = i+5; j<i+6 ; j++) {//j=6,7
                res[j]=res[i];

            }
        }
        for (int i : res) {
            System.out.print(i+" ");
        }
    }
}
