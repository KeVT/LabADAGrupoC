//twoSum.java

import java.util.Arrays;

public class twoSum {

	public static void main(String[] args) {
		int [] array = {1,5,7,3,6,4};   
    System.out.println(Arrays.toString(array));     
    System.out.println(twoSum(array));        
	}
  
	//complejidad O(n^2)
	public static boolean twoSum(int [] array) {                     //---- O(n^2) 
    //dado un arreglo de números enteros, la función buscará los dos  
    //primeros números con posiciones diferentes que sumen 10.
    for(int i=0; i<array.length; i++){   		                                                                    //---- O(n)        	
      for (int j=0; j<array.length; j++) {                                                           //---- O(n)       
        if (i != j && array[i] + array[j] == 10) {                                        //---- O(4)        	
          System.out.println(array[i] + " + " + array[j] + " = " + (array[i]+array[j]));     	
          return true;     	
        }        	
      }    
    }    
    return false;	
  }
}
 
//resultado de la ejecución 
//muestra el arreglo
[1, 5, 7, 3, 6, 4]
//muestra los primeros dos números que sumen 10 cuyos indices no se repitan 
7 + 3 = 10
//muestra verdadero ya que 7 + 3 es 10, caso de no encontrarlo mostraría falso
true
