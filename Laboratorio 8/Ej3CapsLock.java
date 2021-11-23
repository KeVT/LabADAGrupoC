// Ej3CapsLock.java

import java.io.*;
import java.util.*;
 
public class Ej3CapsLock {	
	 
	public static void main(String[] args) {     
	        
		String m = "abc$d@ef$@g$";	       
		cambiarCaso(m);
	    
	}
	
    static void cambiarCaso(String m){
        //Dada una cadena,la función almacena en un buffer los caracteres que se encuentren antes de
        //un $. Cuando aparezca un @ todos los caracteres de ese buffer serán cambiado de mayúscula 
        //a minúscula o visceversa. Finalmente imprime el buffer acumulado. Utilizando colas.
        Queue<String> O = new LinkedList<String>();

        String temp = "";
        String aux = "";
        char a = ' ';
 
        for (int i = 0; i < m.length(); ++i) {
        	
        	if (m.charAt(i) != '$' && m.charAt(i) != '@') {
        		temp = temp + m.charAt(i);
        	}
        	if(m.charAt(i) == '$' ) {
        		System.out.println(temp);
        		aux = temp;
        	}
        	if (m.charAt(i) != '@'){
                for (int j= 0; j < m.length(); ++j) {         		
                	while (m.charAt(i+j) != '@') {              	
            			if(m.charAt(i+j)==Character.toUpperCase(m.charAt(i+j)))  {     		
            				a=Character.toLowerCase(m.charAt(i+j));        		        		
            				temp = temp + a;	
            				aux = temp;
            			}
            			if(m.charAt(i+j)==Character.toLowerCase(m.charAt(i+j)))  {     		
            				a=Character.toUpperCase(m.charAt(i+j));        		        		
            				temp = temp + a;	
            				aux = temp;
            			}
                	}        			
                }    		
        	}
        	O.add(temp);                
        }    
        System.out.println();
    	System.out.println(aux);
                      
    }
}

//Resultado
abcDEFg
