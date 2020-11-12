package classMethod;

import classMethod.human.Human04;

public class ClassMethod04 {
	public static void main(String[] args) {
		Human04 yamada = new Human04("山田");
		Human04.staticMethodPrint();
		System.out.println(Human04.GREETING);
		yamada.instanceMethodPrint();
		
		
		Human04 yamada2 = new Human04("山田2");
		Human04.staticMethodPrint();
		System.out.println(Human04.GREETING);
		yamada2.instanceMethodPrint();

	}
}
