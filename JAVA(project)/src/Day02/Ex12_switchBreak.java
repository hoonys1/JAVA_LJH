package Day02;

import java.util.Scanner;

public class Ex12_switchBreak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		// 입력 받은 정수를 5로 나눈 나머지
		// 2보다 작으면 "*" 출력
		// 그렇지 않으면 "**" 출력
		// - switch 문을 사용하여 작성하시오.
		// ? % 5 : 0 1 2 3 4
		
		int a = (num % 5);
		switch(a) {
		case 0: 
		case 1: System.out.println("*"); break;
		case 2: 
		case 3: 
		case 4: System.out.println("**"); break;
		// default 블록은 생략가능하다.
		default:System.out.println("숫자를 입력해 주세요");break;
		}
		
		sc.close();
		
	
	}
}
