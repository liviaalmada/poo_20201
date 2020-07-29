package pokemons;

public class Batalha {
	private Pokemon desafiado;
	private Pokemon desafiador;
	private boolean aprovada;
	private boolean finalizada;
	private boolean iniciada;
	private Pokemon campeao;
	
	public Batalha(Pokemon desafido, Pokemon desafiador) {
		this.desafiado = desafido;
		this.desafiador = desafiador;
		aprovada = false;
		iniciada = false;
		finalizada = false;
	}
	
	public void show() {
		System.out.println("Desafiador:" + desafiador.getNome());
		System.out.println("Desafiado:" + desafiado.getNome());
		System.out.println("Golpes sofridos pelo desafiado:" + desafiado.getGolpesSofridos());
		System.out.println("Golpes sofridos pelo desafiador:" + desafiador.getGolpesSofridos());
		if(finalizada) {
			System.out.println("Campeão: "+campeao.getNome());
		}
	}
	
	public void aprovar() {
		this.aprovada = true;
		System.out.println("Batalha aprovada com sucesso!");
	}
	
	public void iniciar() {
		if(aprovada) {
			this.iniciada = true;
			desafiado.zerar();
			desafiador.zerar();
			System.out.println("Batalha iniciada com sucesso!");
		}else {
			System.out.println("Essa batalha ainda não foi aprovada. "
					+ "Não é possível iniciar.");
		}
		
	}
	
	public void finalizar() {
		if(iniciada) {
			this.finalizada = true;
			if(desafiado.getGolpesSofridos()>desafiador.getGolpesSofridos()) {
				campeao = desafiador;
				desafiador.ganhar();
				desafiado.perder();
			}if(desafiado.getGolpesSofridos()<desafiador.getGolpesSofridos()) {
				campeao = desafiado;
				desafiado.ganhar();
				desafiador.perder();
			}
			System.out.println("Batalha fializada com sucesso!");
		}else {
			System.out.println("Essa batalha ainda não foi iniciada. "
					+ "Não é possível finalizar.");
		}
		
	}

}
