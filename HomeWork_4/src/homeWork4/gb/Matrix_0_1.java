package homeWork4.gb;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Matrix_0_1 {
    public static void main(String[] args) {
        int[][] matrix = {{0,0,0}, {0,1,0}, {1,1,1}};
        System.out.println(Arrays.deepToString(updateMatrix(matrix)));
    }
    public static int[][] updateMatrix(int[][] matrix) {
        if(matrix.length == 0) return matrix;

        int rows = matrix.length;
        int columns = matrix[0].length;
        boolean[][] visited = new boolean[rows][columns];

        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                visited[i][j] = false;
                if(matrix[i][j] == 0) {
                    queue.add(new int[] {i-1,j} );
                    queue.add(new int[] {i,j-1} );
                    queue.add(new int[] {i+1,j} );
                    queue.add(new int[] {i,j+1} );
                }
            }
        }

        int steps = 0;
        while(!queue.isEmpty()) {
            steps++;
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int[] temp = queue.poll();
                assert temp != null;
                int first = temp[0];
                int second = temp[1];

                if ((first >= 0) && (second >= 0) && (first < rows) && (second < columns)
                        && !visited[first][second] && (matrix[first][second] != 0)) {
                    visited[first][second] = true;
                    matrix[first][second] = steps;
                    queue.add(new int[] {first-1,second} );
                    queue.add(new int[] {first,second-1} );
                    queue.add(new int[] {first+1,second} );
                    queue.add(new int[] {first,second+1} );
                }
            }
        }
        return matrix;
    }
}