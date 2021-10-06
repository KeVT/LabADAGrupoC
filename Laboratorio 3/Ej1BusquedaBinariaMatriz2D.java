import java.util.*;
public class Ejercicio9 {
	
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int matriz [][]= {{1, 3, 5},{7, 9, 11},{13, 15, 17}};
	imprimir(matriz);
	busquedaBinaria(matriz,7);
    if(ind!=-1)
			System.out.println("se encontró : verdadero");
		else
			System.out.println("no se encontró");
	}
	
	public static int busquedaBinaria (int [][] lista, int valor) {
  //Se busca en una matriz bidimensional un número con el algoritmo de búsqueda binaria
		int filas, columnas;
		filas = lista.length;
		columnas = lista[0].length;
		int alta,media,baja;
		baja = 0;
		alta = filas*columnas-1;
		while(baja<=alta) {
			media = (baja+alta)/2;
			if(lista[0][media]==valor)
				return media;
			else			
				if (valor<lista[0][media])						
					alta=media-1;			
				else 				
					baja=media+1;
		}
		return -1;		
	}
	
	public static void imprimir(int[][] matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

//Resultado de la ejecución, se muestra la matriz
1	  3	  5	
7	  9	  11	
13	15	17
//Resultado de la ejecución
se encontró : verdadero
