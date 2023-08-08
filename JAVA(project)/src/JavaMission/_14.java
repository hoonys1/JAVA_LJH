package JavaMission;

import java.util.Arrays;
import java.util.Scanner;

public class _14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 게임?");
		int N = sc.nextInt();
		int[] a = new int[6];
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < 6; j++) {
				int b = (int)(Math.random() * 45)+1;
				for (int k = 0; k < j; k++) {
					if(b == a[k]) {
						b = (int)(Math.random() * 45)+1;
						k = -1;
					}
				}
				a[j] = b;
			}
		Arrays.sort(a);
			System.out.print("[" + i + "게임] : ");
			System.out.print(a[0] + " ");
			System.out.print(a[1] + " ");
			System.out.print(a[2] + " ");
			System.out.print(a[3] + " ");
			System.out.print(a[4] + " ");
			System.out.print(a[5]);
			System.out.println();
		}
		sc.close();
	}
}
