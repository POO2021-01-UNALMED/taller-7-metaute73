package comunicacion;

public class Alfabeto extends Pictograma{
	
	private static String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] lista, String interpretacion) {
		super(origen);
		this.interpretacion = interpretacion;
		letras = lista;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	public String toString() {
		String alpha = "";
		for(String letra: letras) {
			alpha += letra + ", ";
		}
		return alpha;
	}
	public int cantidadLetras() {
		int count = 0;
		for (String c : letras) {
			count += 1;
		}
		return count;	
	}
	
	public void setLetras(String[] lista) {
		letras = lista;
	}
	public String[] getLetras() {
		return letras;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
}
