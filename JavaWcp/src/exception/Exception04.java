package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception04 {
	public static void main(String[] args) {
		try {
			Exception04.readFile("exceprion.txt");
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundExceptionが発生");
		}
		System.out.println("プログラム終了");
	}

	public static void readFile(String fileName) throws FileNotFoundException{
		System.out.println("ファイル読み込み開始");
		FileReader fr = new FileReader(fileName);
		System.out.println(fileName + "の読み込み完了");

	}
}
