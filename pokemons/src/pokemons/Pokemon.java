package pokemons;

public class Pokemon {
	private String nome;
	private int vitorias;
	private int derrotas;
	private int golpesSofridos;
	
	public Pokemon(String nome) {
		this.nome = nome;
		vitorias = 0;
		derrotas = 0;
		golpesSofridos = 0;
	}
	
	public void zerar() {
		this.golpesSofridos = 0;
	}
	
	public void ganhar() {
		vitorias +=1;
	}
	
	public void perder() {
		derrotas +=1; 

	}
	
	public void golpear(Pokemon p) {
		p.golpesSofridos+=1;
	}
	
	
	public String getNome() {
		return nome; 
	}
	
	public int getVitorias() {
		return vitorias;
	}
	
	public int getDerrotas() {
		return derrotas;
	}
	
	public int getGolpesSofridos() {
		return golpesSofridos;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}	
	
}
