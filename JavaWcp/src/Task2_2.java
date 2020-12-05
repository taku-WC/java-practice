
public class Task2_2 {
	public static void main(String[] args) {
		int sum2 = 0;

		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				sum2 = sum2 + i;
			}
		}
		System.out.println("2から100までの偶数を全て足す計算: " + sum2);
	}
}
