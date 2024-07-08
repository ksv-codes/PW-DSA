public class RnCwisePrint {
    public static void main(String[] args) {
        // 1 2
        // 3 4
        // 5 6
        int [][] arr ={{1,2},{3,4},{5,6}};
        int[][] res = new int[2][3];
        int m = arr.length;//rows
        int n = arr[0].length;//colums
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int j = 0; j < n ; j++) {
            for (int i = 0; i < m; i++) {
                res[j][i]=arr[i][j];
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("in the new array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
