import java.util.Scanner;

public class Controller {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// instaciar uma calculadora
		while (true) {
			String line = scan.nextLine();
			System.out.println("$" + line);
			if (line.equals("end"))
				break;
			String ui[] = line.split(" ");
			if (ui[0].equals("help"))
				System.out.println("soma _a _b; show; div _a _b; charge _value");
			else if (ui[0].equals("init")) {
				int val = Integer.parseInt(ui[1]); // lê valor inteiro
				// instaciar uma calculadora com bateria igual ao valor lido
			} else if (ui[0].equals("show")) {
				// imprimir conteúdo da calculadora
			} else if (ui[0].equals("charge")) {
				// calc.charge(Integer.parseInt(ui[1]));
			} else if (ui[0].equals("sum")) {
				// Ler dois valores inteiros calcular a soma e imprimir o resultado
			} else if (ui[0].equals("div")) {
				// Ler dois valores inteiros calcular a divisão e imprimir o resultado
			} else
				System.out.println("fail: comando invalido");
		}
	}
}
