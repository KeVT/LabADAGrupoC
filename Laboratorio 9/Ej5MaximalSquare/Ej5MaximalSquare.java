//Ej5MaximalSquare.java

public class Ej5MaximalSquare {
    
    public static void main(String[] args){         
        char squareGrid [][] = {{'0','1'},{'1','0'}};  
        System.out.println(maximalSquare(squareGrid));
    }
	    
	public static int maximalSquare(char[][] grid) {     
    //Dada una matriz binaria m x n llena de ceros y unos, la función encuentra el cuadrado 
    //más grande que contenga solo unos y devuelve su área.
    if (grid == null || grid.length == 0 || grid[0].length == 0) {        
      return 0;      
    }             
    int [][] tmp = new int[grid.length][grid[0].length];
    int mayor = 0;     
    for (int i = 0; i < grid.length; i++) {            
      for (int j = 0; j < grid[0].length; j++) {             
        if (i == 0 || j == 0 || grid[i][j] == '0') {        
          tmp[i][j] = grid[i][j] - '0';           
        }                      
        else {                	      	
          tmp[i][j] = Math.min(tmp[i - 1][j - 1], Math.min(tmp[i - 1][j], tmp[i][j - 1])) + 1;       
        }        
        mayor = Math.max(mayor, tmp[i][j]);    
      }     
    }           
    return mayor * mayor;        
  }
}

//Resultado del 2° caso de prueba
1
