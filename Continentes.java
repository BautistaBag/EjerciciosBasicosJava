
public enum Continentes {
	AFRICA(53),
	EUROPA(46),
	ASIA(44),
	AMERICA(34),
	OCEANIA(14);
	
	//Va a ser "final" porque una vez que le asignemos un valor, ya no queremos que se modifique
	private final int paises;
	
	Continentes(int paises){
		this.paises = paises;
	}
	
	public int getPaises() {
		return this.paises;
	}
}
