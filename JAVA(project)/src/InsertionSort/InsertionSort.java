package InsertionSort;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 길이를 입력하시오.");
		int N = sc.nextInt();
		System.out.println("배열의 수를 입력하시오.");
		int arr[] = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		insertionSort(arr);
		System.out.println("정렬 후 배열 : ");
		printArray(arr);
		
		
		sc.close();
	}
	
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			
			// key보다 큰 요소들을 오른쪽으로 이동
			while (j >= 0 && arr[j] > key) {
				arr[j +1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
	
	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}