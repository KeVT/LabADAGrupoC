//Q7logaritmica.java

public class Q7logaritmica {

	public static void main(String[] args) {	
		//Dado un número, se recorre el ciclo calculando el doble del anterior valor hasta antes de dicho número.
		int n = 10;
		for(int i = 1; i < n; i = i*2) {		//O(log2(n))	
			System.out.println(i);
		}		
	}
	
}

//Resultado de la ejecución
1
2
4
8
