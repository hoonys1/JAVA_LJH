package Day15;

import java.io.FileInputStream;

public class Ex06_FileInputStream {

	public static void main(String[] args) {
		byte[] date = new byte[100];
		
		
		try {
			FileInputStream fin = new FileInputStream("./src/Day15/Test.out");
			
			int i =0, b;
			while( (b = fin.read() ) != -1 ) {
				date[i] = (byte) b;		// 읽어온 바이트 b 를 바이트 배열에 형변환하여 대입
				i++;
			}
			
			for (byte a : date) {
				System.out.print( (char) a);
			}
			System.out.println();
			
			fin.close();
			
		} catch (Exception e) {
			System.err.println("입출력 시, 예외가 발생하였습니다.");
			e.printStackTrace();
		}
	}
}
