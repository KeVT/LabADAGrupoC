import java.util.*;
public class greatestNumber {

	public static void main(String[] args) {
	//caso de prueba	
	int [] array = {3,6,2,8,1,9,56,-23,0};
	System.out.println(greatestNumber(array));
	System.out.println(greaterNumber(array));

	}
	//código O(n^2)
	public static int greatestNumber(int [] array) {
        for(int i=0;i<array.length;i++){
        	boolean isIValTheGreatest = true;
            for(int j=0;j<array.length;j++){ 
            	if (array[j]>array[i]) 
            		isIValTheGreatest = false;           	
            }
            if (isIValTheGreatest){
            	return array[i];
            }
        }        
		return 0;
	}
	//código O(n)
	public static int greaterNumber(int [] array) {
    	int mayor= array[0];
        for(int i=0;i<array.length;i++){
        	if (array[i] > mayor)
            	mayor = array[i];          
        }        
    	return mayor;          
	}	
}

//resultado de la ejecución
56
56
