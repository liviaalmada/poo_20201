
public class Teste {
	public static void main(String[] args) {
		Passageiro p = new Passageiro("João", 10);
		Passageiro p2 = new Passageiro("Ana", 10);
		Moto m = new Moto(5, 10);
		m.subir(p);
		m.subir(p2);
		m.descer();
		m.descer();
		
		m.subir(p2);
		m.buzinar();
		m.comprar(10);// 10 de tempo
		m.abastecer(4); // 4 de combustivel
		m.dirigir(9); // 0 de combustivel e 2 de tempo.
		m.abastecer(4); // 4 de combutivel
		m.dirigir(3);
	}
}
