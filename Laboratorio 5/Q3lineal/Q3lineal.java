//Q3lineal.java

public class Q3lineal {

	public static void main(String[] args) {	
	  //Dado un número, se imprimen números pares desde el 0 hasta antes de dicho número.
		int n = 12;
		
		for(int i = 0; i < n; i=i+2) {	//O(n)
        	System.out.println(i);      
        }
		
	}
	
}

//Resultado de la ejecución
0
2
4
6
8
10
