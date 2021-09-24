import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arreglo[] = new int [10];
		for (int i=0;i<arreglo.length;i++) {
			arreglo[i]=sc.nextInt();
		}
		System.out.println(buscar(arreglo,15));		
	}
	
	public static int buscar(int arreglo[],int n) {
		for (int i=0;i<arreglo.length;i++) {
			if (arreglo[i]==n) 
				return i;			
		}
		return -1;
	}
}


//Resultado de la ejecución
1
4
8
9
11
15
7
12
13
6
//El número 15 se encuentra en la posición 5
5

