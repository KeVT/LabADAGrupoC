//Q4cuadratica.java

public class Q4cuadratica {

	public static void main(String[] args) {	
		//Dado un número, se recorren dos ciclos anidados las veces que ese número representa.
    //Muestra la suma de los números que representan las iteraciones en cada ciclo.
		int n = 3;
		for(int i = 0; i < n; i++) {	  //O(n)			   //O(n^2)
			for(int j = 0; j < n; j++) {	//O(n)       	
				System.out.println(i + " + " + j + " = " + (i + j));   
			}
			System.out.println();		
		}
		
	}
	
}

//Resultado de la ejecución
0 + 0 = 0
0 + 1 = 1
0 + 2 = 2

1 + 0 = 1
1 + 1 = 2
1 + 2 = 3

2 + 0 = 2
2 + 1 = 3
2 + 2 = 4
