import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arreglo [] = {1,2,3,5,5,5,7,9,10,14,15,18,40,50,50};
		int ind = busquedaBinaria(arreglo,13);
		if(ind!=-1)
			System.out.println("se encontró en la posición: "+ind);
		else
			System.out.println("no se encontró");
	}
	
	public static int busquedaBinaria (int [] lista, int valor) {
  //Se busca un número en un conjunto de valores con el algoritmo de búsqueda binaria 
		int alta,media,baja;
		baja = 0;
		alta = lista.length-1;
		while(baja<=alta) {
			media = (baja+alta)/2;
			if(lista[media]==valor)
				return media;
			else			
				if (valor<lista[media])						
					alta=media-1;			
				else 				
					baja=media+1;
		}
		return -1;		
	}
}

//Resultado de la ejecución
no se encontró
//El número buscado es el 13 pero no se encontró en el arreglo
