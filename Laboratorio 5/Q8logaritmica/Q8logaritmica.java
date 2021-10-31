//Q8logaritmica.java

public class Q8logaritmica {

	public static void main(String[] args) {	
		//Dado un número, se recorre el ciclo calculando la mitad del valor de dicho número hasta llegar a 1.
		int n = 20;
		for(int i = n; i >= 1; i = i/2) {		//O(log2(n))	
			System.out.println(i);
		}		
	}
	
}

//Resultado de la ejecución
20
10
5
2
1
