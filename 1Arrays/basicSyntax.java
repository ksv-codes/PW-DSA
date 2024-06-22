package Arrays;

//import java.util.Scanner;

public class basicSyntax {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        //int x = input.nextInt();
        int[] arr = new int[5];
        int[] brr = {1,2,3,4,5};
        int[] crr = new int[] {1,2,3,4,5,6};
        System.out.println(brr);
        System.out.println(crr[0]);
        
        //in case of returning an array use this "return new int[]{i,j,k}" && empty array return new int[0](array of zero size)



        //initialising individual elemnts
        arr[0]=100;
        arr[1]=10;
        arr[2]=10;
        arr[3]=10;
        arr[4]=10;
        
        //outputOfArray
        System.out.print("We can access array elements like this: ");
        System.out.println(arr[0]+" ");

        arr[0]=99;//updating the value
        System.out.print("value after updation: ");
        System.out.println(arr[0]);
        arr[0]+=10;
        System.out.println(arr[0]);
    }
}
