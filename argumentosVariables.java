
public class argumentosVariables {
	
	public static void main(String[] args) {

		imprimirNumeros(2,3,4);
		imprimirNumeros(9,10);
		
		variosParametros("Lau",12,13,14);
		
	}
	
	//con los ... indicamos que vamos a recibir una cantidad de elementos indefinidos(en este caso de tipo enteros	)
	public static void imprimirNumeros(int... numeros) {
		for(int i=0;i<numeros.length;i++) {
			System.out.println("elemento: " + numeros[i]);
		}
	}
	
	
	
	public static void variosParametros(String nombre, int... numeros) {
		System.out.println("nombre = "+ nombre);
		imprimirNumeros(numeros);
	}
	
}
