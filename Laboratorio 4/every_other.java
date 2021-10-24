//every_other.java

import java.util.*;
public class every_other {		  
	public static void main(String[] args) {	
		int [] array = {1,2,3};	
    System.out.println(Arrays.toString(array));
		System.out.println();
		every_other(array);
	}
	public static void every_other(int [] array) {    
		//dado un arreglo de números enteros, la función sumará el número de orden par del array con todos los números de dicho array.
    for(int i=0;i<array.length;i++){    																									  //---O(n^2)   	        
      if (i % 2 == 0) {     																																//---O(6n)									
        for (int j = 0; j < array.length;j++)       			                                  //---O(n)		
          System.out.println(array[i] + " + " + array[j] + " = " + (array[i]+array[j]));    //---O(6)		 			        	
      }        
    }        	
  }
}

//resultado de la ejecución
[1, 2, 3]

1 + 1 = 2
1 + 2 = 3
1 + 3 = 4
3 + 1 = 4
3 + 2 = 5
3 + 3 = 6
