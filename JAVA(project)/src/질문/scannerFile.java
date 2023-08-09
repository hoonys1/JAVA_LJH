package 질문;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class scannerFile {

	public static void main(String[] args) throws FileNotFoundException {	// throws FileNotFoundException
		// 파일 객체 생성														   test.txt가 없을경우 예외처리
		File file = new File("test.txt");
		// 파일을 읽기 위한 Scanner 객체 생성
		Scanner sc = new Scanner(file);
		
		// 파일의 내용을 줄 단위로 읽어
		while( sc.hasNextLine() ) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		sc.close();
		
		
	}
}
