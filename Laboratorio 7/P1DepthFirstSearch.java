//P1DepthFirstSearch.java

import java.util.*;
public class P1DepthFirstSearch {

	public static void main(String[] args) {
		String tabla [][] = 
              {{"#", "#", "#", "#", "#", "#"},
							 {"#", "0", "0", "0", "0", "#"},
							 {"#", "0", "0", "0", "0", "#"},
							 {"#", "0", "0", "0", "0", "#"},
							 {"#", "0", "0", "0", "#", "0"},
							 {"#", "#", "#", "#", "0", "0"}};				
		System.out.println(Arrays.deepToString(tabla).replace("],","],\n"));
		System.out.println();
		entrada(tabla,2,2);
		System.out.println(Arrays.deepToString(tabla).replace("],","],\n"));

	}
	
	public static void entrada(String [][] grid, int x, int y) {
    //Dada un arreglo bidimensional de 0 y #, a partir de un punto inicial hacer que todos los ceros 
    //adyacentes horizontal o verticalmente se conviertan en un número determinado 
		String color = "3";
		grid[x][y] = color;
		int [] dx = {-1, 0 , +1, 0};
		int [] dy = {0, +1 , 0, -1};
		
		for (int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];	
			if (grid[nx][ny] == "0" && grid[nx][ny] != "#") {
				grid[nx][ny]=grid[x][y];

				for (int j=0; j<4; j++) {
					int mx = nx + dx[j];
					int my = ny + dy[j];	
					if (grid[mx][my] == "0" && grid[mx][my] != "#") {
						grid[mx][my]=grid[x][y];
					
						for (int k=0; k<4; k++) {
							int lx = mx + dx[k];
							int ly = my + dy[k];
							if (grid[lx][ly] == "0" && grid[lx][ly] != "#") { 
								grid[lx][ly]=grid[x][y];
							}
						}			
					}		
				}
			}	
		}		
	}
}

//Resolución
[[#, #, #, #, #, #],
 [#, 0, 0, 0, 0, #],
 [#, 0, 0, 0, 0, #],
 [#, 0, 0, 0, 0, #],
 [#, 0, 0, 0, #, 0],
 [#, #, #, #, 0, 0]]

[[#, #, #, #, #, #],
 [#, 3, 3, 3, 3, #],
 [#, 3, 3, 3, 3, #],
 [#, 3, 3, 3, 3, #],
 [#, 3, 3, 3, #, 0],
 [#, #, #, #, 0, 0]]
