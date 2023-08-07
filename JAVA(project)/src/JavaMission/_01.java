package JavaMission;

import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int d = a + b + c;
		double e = (double) d/3;
		
		System.out.println("영어 점수 : " + a);
		System.out.println("수학 점수 : " + b);
		System.out.println("자바 점수 : " + c);
		System.out.println("총점 : " + d);
		System.out.println("평균 : " + e);
		
		sc.close();
	}
}
