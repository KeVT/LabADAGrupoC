//P1EsCuadrado.java

public class P1EsCuadrado {

	public static void main(String[] args) {
    int x = 16;
		int arreglo [] = new int [x];	
		for (int i = 0;i < arreglo.length; i++) {
			arreglo[i] = i + 1;	
		}	
    System.out.println(Arrays.toString(arreglo));
		int ind = esCuadrado(arreglo, x);
		if(ind != -1)
			System.out.println(ind + " --> sí es cuadrado ");
		else
			System.out.println(ind + " --> no es cuadrado");
	}
	
	public static int esCuadrado (int [] lista, double valor) {
    //Dado un valor la función determina si ese número es un cuadrado perfecto con el algoritmo de búsqueda binaria
		int L, R, mid;
		L = 0;
		R = lista.length - 1;
		while(L<=R) {
			mid = L + (R - L) / 2;
			if(Math.pow(mid, 2) == valor)
				return valor;
			if(Math.pow(mid, 2) < valor)
				L = mid + 1;
			else
				R = mid - 1;		
		}
		return -1;		
	}
}


//Resolución
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
16 --> sí es cuadrado 

