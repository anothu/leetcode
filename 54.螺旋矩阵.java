import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.lang.model.util.ElementScanner6;

/*
 * @lc app=leetcode.cn id=54 lang=java
 *
 * [54] 螺旋矩阵
 */

// @lc code=start
class Solution {
    private final int RIGHT = 1;
    private final int DOWN = 2;
    private final int LEFT = 3;
    private final int UP = 4;

    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return new LinkedList<>();
        boolean[][] isUsed = new boolean[matrix.length][matrix[0].length];
        List<Integer> result = new LinkedList<>();
        int m = 0;
        int n = 0;
        int flag = RIGHT;
        int end = matrix.length * matrix[0].length;
        result.add(matrix[0][0]);
        isUsed[0][0] = true;
        while (result.size() < end) {
            if (flag == RIGHT) {
                // 如果右边超出界限或被用过
                if (n + 1 >= matrix[0].length || isUsed[m][n + 1]) {
                    flag = DOWN;
                    continue;
                } else {
                    n++;
                }
            } else if (flag == DOWN) {
                if (m + 1 >= matrix.length || isUsed[m + 1][n]) {
                    flag = LEFT;
                    continue;
                } else {
                    m++;
                }
            } else if (flag == LEFT) {
                if (n - 1 < 0 || isUsed[m][n - 1]) {
                    flag = UP;
                    continue;
                } else {
                    n--;
                }
            } else if (flag == UP) {
                if (m - 1 < 0 || isUsed[m - 1][n]) {
                    flag = RIGHT;
                    continue;
                } else {
                    m--;
                }
            } else
                break;
            // result[index++] = matrix[m][n];
            result.add(matrix[m][n]);
            isUsed[m][n] = true;
        }
        return result;
    }
}
// @lc code=end
