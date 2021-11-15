package domain;

public class TestForEach {

	public static void main(String[] args) {
		
		int edades[] = {5,6,8,9};
		//La variable edad pasa a ser el indice i que usabamos en el for convencional
		for(int edad: edades) {
			System.out.println("edad = " + edad);
		}
		
		Persona personas[] = {new Persona("Juan"), new Persona("Carla"), new Persona("Agustin")};
		for(Persona persona: personas) {
			System.out.println("Persona: "+persona);
		}
	}
}
