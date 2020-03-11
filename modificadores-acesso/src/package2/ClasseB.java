package package2;

import package1.ClasseA;

public class ClasseB {
	
	public static void main(String[] args) {
		ClasseA objetoA = new ClasseA("Aaa","Bbb", "Ccc");
		System.out.println(objetoA.a);
		System.out.println(objetoA.getB());
		System.out.println(objetoA.getC());
		
	}
	
}
