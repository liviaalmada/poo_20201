package pokemons;

public class Teste {
	public static void main(String[] args) {
		Pokemon raichu = new Pokemon("Raichu");
		Pokemon pikachu = new Pokemon("Pikachu");
		
		Batalha batalha = new Batalha(raichu, pikachu);
		
		batalha.aprovar();
		batalha.iniciar();
		
		raichu.golpear(pikachu);
		raichu.golpear(pikachu);
		pikachu.golpear(raichu);
		
		raichu.golpear(pikachu);
		
		pikachu.golpear(raichu);
		pikachu.golpear(raichu);
		pikachu.golpear(raichu);
		
		System.out.println(pikachu.getGolpesSofridos());
		System.out.println(raichu.getGolpesSofridos());
		
		batalha.show();
		batalha.finalizar();
		batalha.show();
	}
}
