
public class Chapter06 {
	public static void main(String[] args) {
//		演算子練習
		int val = 2 + 5;
		val++;
		System.out.println(val);
		
		val *= 5;
		System.out.println(val);
		
		boolean bool = (val == 50);
		System.out.println(bool);
		
		bool = (val <= 50) && (val % 10 == 0);
		System.out.println(bool);
//		if文練習
		int num = 7;
		if (num < 5) {
			System.out.println(num + "は5未満です");
		} else if (num < 10) {
			System.out.println(num + "は5以上10未満です");
		} else if (num < 15) {
			System.out.println(num + "は10以上15未満です");
		} else {
			System.out.println(num + "は15以上です");
		}
//		swich文練習
		int val2 = 2;
		switch (val2) {
		case 3:
			System.out.println("よくできました");
		case 2:
			System.out.println("ふつうでした");
			break;
		default:
			System.out.println("がんばろう");
		}
	}
}