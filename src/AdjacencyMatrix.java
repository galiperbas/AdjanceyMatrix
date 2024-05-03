public class AdjacencyMatrix {
    int[][] returnTable;
    int[][] grid;

    public AdjacencyMatrix(int[][] grid) {
        this.grid = grid;
        returnTable = new int[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (j + 1 < grid[i].length) {
                    returnTable[i][j + 1] = 1; // Right neighbor
                }
                if (j > 0) {
                    returnTable[i][j - 1] = 1; // Left neighbor
                }
                if (i + 1 < grid.length) {
                    returnTable[i + 1][j] = 1; // Bottom neighbor
                }
                if (i > 0) {
                    returnTable[i - 1][j] = 1; // Top neighbor
                }
            }
        }
    }


}
