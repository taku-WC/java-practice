
public class For2 {
	public static void main(String[] args) {
		for(int x = 1; x <= 3; x++) {
			for(int y = 3; y >= 1; y--) {
				if(x <= y) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
			System.out.println();
		}
	}
}
