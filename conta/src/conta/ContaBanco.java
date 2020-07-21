package conta;

public class ContaBanco {
	public String dono;// qualquer classe
	private double saldo;// apenas na mesma classe
	private boolean status; // apenas na mesma classe
	protected String tipo;// apenas classes filhas
	int numConta;// por pacote
	
	public ContaBanco() {
		// TODO Auto-generated constructor stub
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	public void setDono(String novoNome) {
		this.dono = novoNome;
	}

	public void abrirConta(String dono, String tipo, int numConta) {
		this.saldo = 50;
		this.status = true;
		this.dono = dono;
		this.numConta = numConta;
		this.tipo = tipo;
	}

	public void fecharConta() {
		if (saldo == 0) {
			status = false;
			System.out.println("Conta fechada com sucesso.");
		} else {
			System.out.println("Não foi possível fechar a conta. "
					+ "O saldo precisa ser zero.");
		}
	}
	
	public void depositar(double valor) {
		if(status) {
			saldo+=valor;
			System.out.println("Depósito feito com sucesso!");
		}else {
			System.out.println("Conta inativa! Não é possível depositar.");
		}
	}
	
	public void saque(double valor) {
		if(status && valor <=saldo) {
			saldo-=valor;
			System.out.println("Saque feito com sucesso!");
		}else {
			System.out.println("Não foi possível realizar o saque! "
					+ "Conta inativa ou saldo insuficiente!");
		}
	}
	
	public void pagarMensal() {
		if(status && tipo.equals("CC")) {
			saldo-=5;
			System.out.println("Pagamento mensal realizado com sucesso!");
		}else {
			System.out.println("Não foi possível fazer pagamento mensal. "
					+ "Conta inativa ou do tipo inválido!");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
