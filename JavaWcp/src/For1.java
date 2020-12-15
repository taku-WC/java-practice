
public class For1 {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;

		for (x = 0; x < 3; x++) {
			System.out.println("x= " + x);
			for (y = 0; y < x; ++y) {
				System.out.println("a");
				System.out.println("y= " + y);
			}
			System.out.println("b");
			System.out.println("ループ" + y);
		}
	}
}