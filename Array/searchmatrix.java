class searchMatrices {
    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length;
        int n = arr[0].length;
        int i = 0;
        int j = n-1;
        while(i<m && j>=0){
            if(arr[i][j]==target) return true;
            else if(arr[i][j]>target){//go left
                j--;
            }
            else{//go down
                i++;
            }
        }
        return false;
    }
}