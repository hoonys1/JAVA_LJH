package JavaMission;

import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < N; i++) {
			if(i % 2 == 1 ) {
				sum1 += i;
				
			}
		}
		System.out.println();
		for (int i = 0; i < N; i++) {
			if(i % 2 == 0 ) {
				sum2 += i;
			}
		}
		System.out.println();
		for (int i = 0; i < N; i++) {
			if(N % i == 1) {
				System.out.print(i + " ");
			}
		}
		
		
		sc.close();
	}
}
