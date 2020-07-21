package conta;

public class Teste {
	public static void main(String[] args) {
		ContaBanco conta = new ContaBanco();
		
		conta.abrirConta("Livia", "CC", 1);
		conta.setDono("Lívia Almada");
		
		System.out.println(conta.dono);
		System.out.println(conta.numConta);
		System.out.println("Saldo antes do depósito: "+conta.getSaldo());
		conta.depositar(100);
		System.out.println("Saldo depois do depósito: "+conta.getSaldo());
		
		conta.saque(200);
		
		conta.saque(50);
		
		System.out.println("Saldo depois do saque: "+conta.getSaldo());
		
		conta.pagarMensal();
		System.out.println("Saldo depois do pagamento mensal: "+conta.getSaldo());
		
		
	}
}
