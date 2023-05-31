package flecha;

public class Flechas {
	int longitud;
	String color;
	String ms;

	public Flechas() {
		longitud = 18;
		color = "negro";
		ms="";
	}

	public Flechas(int longitud, String color) {
		this.longitud = longitud;
		this.color = color;
	}

	public void imprimirEspacios() {
		System.out.println();
	}

	public String ConstrurFlechas() {
		String ms="";
		for (int i = 0; i < longitud; i++) {
			ms+="-";
			
		}
		return imprimir(ms+">");

	}

	public String imprimir(String simbolo) {
		if (color.equalsIgnoreCase("negro")) {
			System.out.println(simbolo);
		} else {
			System.err.println(simbolo);
		}
		return simbolo;
	}
	@Override
	public String toString() {
	    return ConstrurFlechas();
	}

}
