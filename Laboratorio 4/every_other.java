import java.util.*;
public class every_other {

	public static void main(String[] args) {	
    //caso de prueba
		int [] array = {1,2,3};	
    System.out.println(Arrays.toString(array));
		System.out.println();
		every_other(array);
	}
	//método que sumará el número de orden par de un array con todos los números de dicho array.
	public static void every_other(int [] array) {      
    for(int i=0;i<array.length;i++){       	        
      if (i % 2 == 0) {     		
        for (int j = 0; j < array.length;j++)       			
          System.out.println(array[i] + " + " + array[j] + " = " + (array[i]+array[j]));      		        	
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
