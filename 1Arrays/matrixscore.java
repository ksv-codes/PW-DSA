package DSA.Leetcode;

class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // Put 1 at the 0th position of every row
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 0) { // Flip that row
                for (int j = 0; j < n; j++) {
                    grid[i][j] = 1 - grid[i][j];
                }
            }
        }

        // Flip those columns where (#0s > #1s)
        for (int j = 1; j < n; j++) {
            int count0 = 0;
            int count1 = 0;
            for (int i = 0; i < m; i++) {
                if (grid[i][j] == 0) {
                    count0++;
                } else {
                    count1++;
                }
            }
            if (count0 > count1) { // Flip that column
                for (int i = 0; i < m; i++) {
                    grid[i][j] = 1 - grid[i][j];
                }
            }
        }

        // Calculate the final score
        int score = 0;
        for (int i = 0; i < m; i++) {
            int rowValue = 0;
            for (int j = 0; j < n; j++) {
                rowValue = (rowValue << 1) + grid[i][j];
            }
            score += rowValue;
        }

        return score;
    }
}
