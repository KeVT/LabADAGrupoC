//Q12linealLogaritmica.java

public class Q12linealLogaritmica {

	public static void main(String[] args) {	
		//Dado un número, se recorren dos ciclos anidados.
    //El ciclo interior calcula el doble del anterior valor hasta antes de dicho número.
    //El ciclo exterior recorre las veces que representa dicho número.
    int n = 3;
		
		for(int i = 0; i < n; i++) {	          //O(n)	--> O(n) * O(log2(n))  =  O(nlog2(n))
			for(int j = 1; j < n; j = j * 2) {		//O(n)	
				System.out.println(j);
			}
			System.out.println();		
		}
		
	}
	
}

//Resultado de la ejecución
1
2

1
2

1
2

