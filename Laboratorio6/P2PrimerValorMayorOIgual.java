//P2PrimerValorMayorOIgual.java

public class P2PrimerValorMayorOIgual {

	public static void main(String[] args) {
		int arreglo [] = {2, 3, 5, 6, 8, 10, 12};
		int ind = primerValorMayorOIgual(arreglo, 9);
		if(ind != -1)
			System.out.println("se encontró en la posición: " + ind);
		else
			System.out.println("no se encontró");
	}
	
	public static int primerValorMayorOIgual (int [] lista, double valor) {
    //Dado un conjunto de números y un número determinado, la función determina la posición
    //del primer valor encontrado en el conjunto de números que sea mayor o igual que dicho número determinado.
		int L, R, mid, aux =- 1;
		L = 0;
		R = lista.length - 1;
		while(L <= R) {
			mid = L + (R - L) / 2;
			if(lista[mid] == valor)
				return mid;
			if(lista[mid] < valor)
				L = mid + 1;
			else {
				aux = mid;
				R = mid - 1;
			}
		}
		return aux;	
	}
}


//Resolución
se encontró en la posición: 5

