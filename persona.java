package domain;
//Manejo de bloques de inicializacion
public class Persona {

	private final int idPersona;
	private static int contadorPersona;
	
	//Bloque de codigo de inicializacion estatico
	static {
		System.out.println("Ejecucion bloque estatico");
		++Persona.contadorPersona;
	}
	

	{
		System.out.println("Ejecucion bloque NO estatico");
		this.idPersona = Persona.contadorPersona++;
	}
	public Persona() {
		System.out.println("Ejecucion del constructor");
	}
	
	public int getIdPersona() {
		return idPersona;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Persona{ idPersona= "+ idPersona+"}";
	}
}
