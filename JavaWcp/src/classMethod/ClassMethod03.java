package classMethod;

import classMethod.human.Human03;

public class ClassMethod03 {
	public static void main(String[] args) {
//	修飾子　その他の修飾子　戻り値の型　メソッド名（引数の型)
		Human03 yamada = new Human03();
//		クラス名　オブジェクト名 = new演算子 クラス名();    ←インスタン化
		System.out.println("私の名前は" + yamada.name + "です。");
		String profile = yamada.getProfile();
		System.out.println(profile + "です。");

		yamada.greet("田辺");
//		オブジェクト名.メソッド名(引数);
		yamada.greet(null);
	}
}