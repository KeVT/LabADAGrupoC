public class Ej1UniquePathII {

	public static void  main(String[] args){         
        int obstacleGrid [][] = {{0,1},{0,0}};  
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }
	    
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {         
		if(obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0) {	             
			return 0;		         
		}   		          
		int n = obstacleGrid[0].length;	         
		int[] temp = new int[n];
		temp[0] = 1;	          
		for(int i = 0; i < obstacleGrid.length; i++) {	             
			for(int j = 0; j < n; j++) {		               
				if(obstacleGrid[i][j] == 1) 	                
					temp[j] = 0;	               
				else {	                   					
					if(j > 0) 	                       
						temp[j] += temp[j-1];	                    						                 
				}	             
			}		     
		}		        
		return temp[n-1];		     
	}	
}
