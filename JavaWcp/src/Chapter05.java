
public class Chapter05 {
	public static void main(String[] args) {
		long long1 = 1234567890;
		double double1 = 3.14;
		boolean boolean1 = true;

		System.out.println(long1);
		System.out.println(double1);
		System.out.println(boolean1);

		Float float1 = 0.01f;
		Integer integer1 = 1;
		Character character1 = 'あ';

		System.out.println(float1);
		System.out.println(integer1);
		System.out.println(character1);

		int[] array1 = { 1, 2, 3 };
		System.out.println(array1[0]);

		int a;

		a = 10;  // a = 10：aに10を代入
		a += 5;  // a = 15：aにa+5の結果を代入
		a -= 3;  // a = 12：aにa-3の結果を代入
		a *= 4;  // a = 48：aにa*4の結果を代入
		a /= 2;  // a = 24：aにa/2の結果を代入
		a %= 7;  // a = 3 ：aにa%7の結果を代入
		System.out.println(a);
	}
}
