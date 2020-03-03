
public class Musica {

	private String titulo;
	private int tempoExecucao;
	
	// construtores
	public Musica() {
		
	}
	
	public Musica(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempoExecucao = tempo;
	}
	
	// get
	
	public String getTitulo() {
		return this.titulo;
	}
	
	// set 
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
