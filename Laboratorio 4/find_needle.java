//find_needle.java

public class find_needle {

	public static void main(String[] args) {
		char [] needle = {'m','p'};
		char [] haystack = {'c','o','m','p','a','s'};
	    System.out.println(find_needle(needle,haystack));
	}
	public static boolean find_needle(char [] needle, char [] haystack) {           //O(log(n^2))
    //dado una cadena de caracteres, esta se buscará en una cadena más grande
    //y si contiene la primera cadena devolverá true, caso contrario false 
		int needle_index = 0;                                                                                          //O(1)
		int haystack_index = 0;                                                                                        //O(1)
		boolean found_needle;
		while (haystack_index < haystack.length) {                                                                    //O(log(n))
			if (needle[needle_index] == haystack[haystack_index]) {			                                //(3log(n)) + O(5)          
				found_needle = true;                                                               //O(1) 
				while (needle_index < needle.length) {                                            //O(log(n))            
					if (needle[needle_index]!= haystack[haystack_index + needle_index])     //O(1)
						found_needle = false;                                                 //O(1)
					break;
				}
				needle_index += 1;			                                                           //O(2)
				if (found_needle) {                                                       //O(1)
					needle_index = 0;                                                       //O(1)
					return true;
				}	
			}		
			haystack_index += 1;                                                                         //O(2)
		}
		return false;		
	}
}

//resultado de la ejecución
//devueve verdadero porque la cadena '{'m','p'} está incluida en la cadena {'c','o','m','p','a','s'}
true

