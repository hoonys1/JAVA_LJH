import java.util.Scanner;

public class Recursive {

	public static void method(int N) {
		// 종료조건
		if(N == 0)
			return;
		
		method(N-1);
		System.out.println(N);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1에서 200사이의 정수를 입력하시오.");
		int N = sc.nextInt();
		
		method(N);
		
		
		sc.close();
	}
	
}
