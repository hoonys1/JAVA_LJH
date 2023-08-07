package InsertionSort;

import java.util.Scanner;

public class test {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int BubbleSorting[] ; //배열 선언
		BubbleSorting = new int[n]; //n개의 배열 생성
		for (int i = 0; i < BubbleSorting.length; i++) {
			BubbleSorting[i] = sc.nextInt();
		}
		for (int i = 0; i < BubbleSorting.length; i++) {
			System.out.println(BubbleSorting[i]); //값을 배열에 넣음
		}
		
		for (int i = 0; i < BubbleSorting.length-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if (BubbleSorting[j] > BubbleSorting[j+1]) {
					int t = BubbleSorting[j];
					BubbleSorting[j] = BubbleSorting[j+1];
					BubbleSorting[j+1] = t;
				} else {
					continue;
				}
			}
		}
		//출력
		for (int i = 0; i < BubbleSorting.length; i++) {
			System.out.println(BubbleSorting[i]);
		}
	}
}
