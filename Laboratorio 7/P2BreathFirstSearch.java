//P2BreathFirstSearch.java

import java.util.*;
public class P2BreadthFirstSearch {

	public static void main(String[] args) {
		int tabla [][] = {{-1, -1, -1, -1, -1},
						  {-1, -1, -1, -1, -1},
						  {-1, -1, -1, -1, -1},
						  {-1, -1, -1, -1, -1},
						  {-1, -1, -1, -1, -1}};		
						
		System.out.println(Arrays.deepToString(tabla).replace("],","],\n"));
		System.out.println();
		entrada(tabla, 1, 2);
		System.out.println(Arrays.deepToString(tabla).replace("],","],\n"));

	}
	
	public static void entrada(int [][] grid, int x, int y) {
    //Dado una matriz bidimensional, desde un punto inicial contar los pasos hacia las demás casillas
		int inicio = 0;
		grid[x][y] = inicio;
		int count = 1;
		int [] dx = {-1, 0 , +1, 0};
		int [] dy = {0, +1 , 0, -1};
		int nx=0,ny=0,mx=0,my=0,lx=0,ly=0;
		for (int i=0; i<4; i++) {
			nx = x + dx[i];
		    ny = y + dy[i];	
			if (grid[nx][ny] == -1) {
				grid[nx][ny]=grid[x][y];
				grid[nx][ny] = count;
			}
		}	
		count++;
		for (int j=0; j<4; j++) {			
			 mx = nx + dx[j];				
			 my = ny + dy[j];				
			if (grid[mx][my] == -1 && grid[mx][my] != 1 && grid[mx][my] != 0 ) {					
				grid[mx][my]=grid[x][y];				
				grid[mx][mx] = count;
			}
		}
	}
}
	
//Resolución
[[-1, -1, -1, -1, -1],
 [-1, -1, -1, -1, -1],
 [-1, -1, -1, -1, -1],
 [-1, -1, -1, -1, -1],
 [-1, -1, -1, -1, -1]]

[[3, 2, 1, 2, 3],
 [2, 1, 0, 1, 2],
 [3, 2, 1, 2, 3],
 [4, 3, 2, 3, 4],
 [5, 4, 3, 4, 5]]
