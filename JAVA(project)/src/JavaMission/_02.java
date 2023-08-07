package JavaMission;

import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 1; i <= N; i+=2) {
			if(i < N-1 ) {
				sum1 += i;
				System.out.print(i + "+");
			}
		}
		if(N % 2 == 1){
			System.out.print(N);
			sum1 += N;
		}
		else {
			System.out.print(N-1);
			sum1 += N-1;
		}
		System.out.print("=" + sum1);
		System.out.println();
		for (int i = 2; i <= N; i += 2) {
			if(i < N) {
				sum2 += i;
			System.out.print(i + "+");
			}
		}
		if(N %2 == 0) {
			System.out.print(N);
			sum2 += N;
		}
		else {
			System.out.print(N-1);
			sum2 += N-1;
		}
		System.out.print("=" + sum2);
		System.out.println();
		for (int i = 1; i <= N; i++) {
			if(N % i == 0) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
}
