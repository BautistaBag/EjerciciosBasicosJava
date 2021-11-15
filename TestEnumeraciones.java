
public class TestEnumeraciones {

	public static void main(String[] args) {
		
		System.out.println("Dia 1: "+ Dias.LUNES);
		indicarDiaSemana(Dias.LUNES);
	}
	
	private static void indicarDiaSemana(Dias dias) {
		switch(dias) {
		case LUNES:
			System.out.println("Primer dia de la semana");
			break;
			
		case MARTES:
			System.out.println("Segundo dia de la semana");
			break;

		case MIERCOLES:
			System.out.println("Tercer dia de la semana");
			break;

		case JUEVES:
			System.out.println("Cuarto dia de la semana");
			break;

		}
	}
}
