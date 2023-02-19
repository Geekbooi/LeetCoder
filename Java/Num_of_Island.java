package Java;

public class Num_of_Island {
        public static int numIslands(char[][] grid) {
            if((grid == null || (grid.length == 0))) {
                return 0;
            }
            int count = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == '1') {
                        dfs(grid, i, j); // recursive call
                        count++; //found island
                    }
                }
            }
            return count;
        }

        private static void dfs(char[][] grid, int i, int j) {
            if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
                return; //boundary and non island checker
            }
            grid[i][j] = '0'; //if there is an island marked as visited/rested to 0

            dfs(grid, i + 1, j); //check up
            dfs(grid, i - 1, j); //check down
            dfs(grid, i, j + 1); //check right
            dfs(grid, i, j - 1); //check left
        }

        public static void main(String[] args) {
            char[][] grid = {
                    {'1', '1', '0', '0', '0'},
                    {'1', '1', '0', '0', '0'},
                    {'0', '0', '1', '0', '0'},
                    {'0', '0', '0', '1', '1'}
            };
            int numIslands = numIslands(grid);
            System.out.println("Number of islands: " + numIslands);
        }
}
