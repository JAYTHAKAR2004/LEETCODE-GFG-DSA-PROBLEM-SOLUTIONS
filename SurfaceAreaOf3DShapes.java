public class SurfaceAreaOf3DShapes {

        public int surfaceArea(int[][] grid) {
            int n = grid.length;
            int surface = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int height = grid[i][j];
                    if (height > 0) {
                        // Top and bottom faces
                        surface += 2;

                        // Four sides
                        // Up
                        surface += Math.max(height - get(grid, i - 1, j), 0);
                        // Down
                        surface += Math.max(height - get(grid, i + 1, j), 0);
                        // Left
                        surface += Math.max(height - get(grid, i, j - 1), 0);
                        // Right
                        surface += Math.max(height - get(grid, i, j + 1), 0);
                    }
                }
            }

            return surface;
        }

        // Helper function to get neighbor value safely
        private int get(int[][] grid, int i, int j) {
            int n = grid.length;
            if (i < 0 || i >= n || j < 0 || j >= n) {
                return 0;
            }
            return grid[i][j];
        }


    public static void main(String[] args) {

    }
}
