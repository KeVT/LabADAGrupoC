//P3MaximaAreaIsla.java

public class P3MaximaAreaIsla {
	 	
	public static void main(String[] args) {
        	 
		char [][] islandGrid = new char[][]         	
	      					 
				    {{ '0', '0', '1', '0', '0', '0', '0', '1', '0', '0', '0', '0', '0'},
	        	 { '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '0', '0', '0'},
	        	 { '0', '1', '1', '0', '1', '0', '0', '0', '0', '0', '0', '0', '0'},
	        	 { '0', '1', '0', '0', '1', '1', '0', '0', '1', '0', '1', '0', '0'},
	        	 { '0', '1', '0', '0', '1', '1', '0', '0', '1', '1', '1', '0', '0'},
	        	 { '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '0', '0'},
	        	 { '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '0', '0', '0'},
	        	 { '0', '0', '0', '0', '0', '0', '0', '1', '1', '0', '0', '0', '0'}};              
	       
	      
	    P3MaximaAreaIsla noOfIslands = new P3MaximaAreaIsla();
	    System.out.println("No of Islands: " + noOfIslands.numIslands(islandGrid));
	    
	}
  
	void dfs(char[][] grid, int r, int c) {
		int nr = grid.length;
		int nc = grid[0].length;

		if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') {
			return;
		}

		grid[r][c] = '0';
		dfs(grid, r - 1, c);
		dfs(grid, r + 1, c);
		dfs(grid, r, c - 1);
		dfs(grid, r, c + 1);
	}
 
	public int numIslands(char[][] grid) {
    //Dada una matriz bidimensional, contar la cantidad de islas y obtener la mayor area entre estas que se representa con unos,
    //contar la cantidad de unos y el mayor será el resultado
		if (grid == null || grid.length == 0) {			
			return 0;
		}

		int cantidad = 0;
		for (int r = 0; r < grid.length; ++r) {
			for (int c = 0; c < grid[0].length; ++c) {
				if (grid[r][c] == '1') {
					dfs(grid, r, c);
					cantidad++;

				}
			}
		}
		return cantidad;
	}	
}

//Resolución
Máxima área: 6
