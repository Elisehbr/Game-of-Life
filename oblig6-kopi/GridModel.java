public class GridModel {
    private char[][] grid;
    Rutenett rutenett;

    public GridModel(int numRows, int numCols) {
        rutenett = new Rutenett(numRows, numCols);

        grid = new char[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                grid[i][j] = ' ';
            }
        }
    }

    public char hentCelle(int row, int col) {
        return grid[row][col];
    }

    public void settCelle(int row, int col, char value) {
        grid[row][col] = value;
    }
}