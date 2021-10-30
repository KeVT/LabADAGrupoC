//Q5cuadratica.java

public class Q5cuadratica {

	public static void main(String[] args) {	
		//Dado un número, se recorren dos ciclos anidados.
    //El ciclo exterior recorre las veces que ese número representa.
    //El ciclo interior recorre la cantidad de veces que recorre el ciclo exterior.
    //Muestra la suma de los números que representan las iteraciones en cada ciclo.
		int n = 3;
		for(int i = 0; i < n; i++) {		//O(n)			  //O(n^2)
			for(int j = 0; j < i; j++) {	//O(n)       	
				System.out.println(i + " + " + j + " = " + (i + j));   
			}
			System.out.println();		
		}
		
	}
	
}

//Resultado de la ejecución
1 + 0 = 1

2 + 0 = 2
2 + 1 = 3
