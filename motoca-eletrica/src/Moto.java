
public class Moto {
	private int potencia;
	private Passageiro pass;
	private int tempo;
	private float combustivel;
	private float maxCombustivel;
	
	public Moto(int potencia, int maxCombustivel) {
		this.potencia = potencia;
		this.maxCombustivel = maxCombustivel;
	}
	
	public void subir(Passageiro pass) {
		if(this.pass == null && pass!=null) {
			this.pass = pass;
			System.out.println("Passageiro "+pass.getNome()+
					" de idadde "+pass.getIdade()+" subiu na moto.");
		}else {
			System.out.println("Não foi possível subir na moto.");
		}
	}
	
	public void descer() {
		if(this.pass == null) {
			System.out.println("Não há passageiro para descer.");
		}else {
			this.pass = null;
			System.out.println("Passageiro desceu da moto.");
		}		
	}
	
	public void buzinar() {
		System.out.print("P");
		for (int i = 0; i < potencia; i++) {
			System.out.print("e");
		}
		System.out.println("m!");
	}
	
	public void comprar(int tempo) {
		this.tempo += tempo;
	}
	
	public void abastecer(float quantidade) {
			
		this.combustivel = Math.min(combustivel+quantidade, maxCombustivel);
		System.out.println("Você tem "+combustivel+" unidades de combustível.");		
		
		if(combustivel == maxCombustivel) {
			System.out.println("O tanque está cheio.");
		}
	}
	
	public void dirigir(int tempo) {
		
		if(pass != null && pass.getIdade()<=10) {
			int tempoAndado = Math.min(tempo, this.tempo);
			tempoAndado = Math.min(tempoAndado, (int)combustivel*2);
			
						
			if(tempo > tempoAndado) {
				System.out.println("O seu tempo/combustível acabou. ");
			}
			
			System.out.println("Você andou "+tempoAndado+" unidades de tempo.");
			
			this.tempo -= tempoAndado;
			this.combustivel -= ((float)tempoAndado)/2.0;
			
		}else {
			System.out.println("Passageiro não existe ou é idade é maior que 10.");
		}
	}
	
	
	

}
