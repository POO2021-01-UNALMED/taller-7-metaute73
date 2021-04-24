package comunicacion;

public class Tesis extends Escrito{
	
	private String idea;
	private static String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] lista, String conclusion,
			String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		argumentos = lista;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}
	public int palabrasTotales(int palabrasPagina) {
		return palabrasPagina * this.getPaginas() * 5;
	}
	public String interpretacion() {
		return this.interpretacion;
	}
	public String toString() {
		return this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n" +
	 this.idea + "\n" + this.counting() + "\n" + this.conclusion + "\n" + this.referencias;
	}
	int counting() {
		int c = 0;
		for (String r : argumentos) {
			c += 1;
		}
		return c;
	}
	
	public void setIdea(String idea) {
		this.idea = idea;
	}
	public String getIdea() {
		return this.idea;
	}
	public void setArgumentos(String[] lista) {
		argumentos = lista;
	}
	public String[] getArgumentos() {
		return argumentos;
	}
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	public String getConclusion() {
		return this.conclusion;
	}
	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}
	public String getReferencias() {
		return this.referencias;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
}
