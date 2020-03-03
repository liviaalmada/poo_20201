
public class Controller {
	
	public static void main(String[] args) {
		Musica m1 = new Musica(); // declarando uma nova musica e c
								  // cria um novo objeto da classe Musica
		
		Musica m2 = new Musica("A dona da minha rua", 180);
		
		m2.setTitulo("A Dona Da Minha Rua");
		
		System.out.println(m2.getTitulo());
	}
	
}
